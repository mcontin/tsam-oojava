package main;

import java.util.HashMap;

/**
 * Gestisce le parcelle dei propri Clienti.
 *
 */
public class Commercialista {

	//private ArrayList<Cliente> clienti; 
	private HashMap<Cliente, Integer> clienti; //<CF, nRipetizioni>
	
	public Commercialista(){
		//clienti = new ArrayList<>();
		clienti = new HashMap<>();
	}
	/**
	 * Calcola il totale delle parcelle di tutti i clienti univoci (ovvero NON
	 * vengono considerati le parcelle di eventuali clienti duplicati). 
	 * @return il totale delle parcelle
	 */
	public int totaleParcelle() {
		// TODO: da implementare
		int tot = 0;
		for(Cliente c: clienti.keySet()){
			tot += c.calcolaParcella();
		}
		return tot;
	}
	
	/**
	 * Inserisce un nuovo cliente, verificando che
	 * non sia già stato inserito.
	 * @param d dipendente
	 */
	public void addCliente(Cliente d) {
		if(!clienti.containsKey(d)){
			clienti.put(d,1);
		}
		else {
			clienti.put(d, clienti.get(d) + 1);
		}
	}
	
	/**
	 * Restituisce il numero di volte che all'atto dell'inserimento di
	 * un cliente, il cliente era già stato inserito. 
	 * @return
	 */
	public int clientiDuplicati() {
		int tot = 0;
		for(Cliente c: clienti.keySet()){
				tot += clienti.get(c) - 1;
				//++tot;
		}
		return tot;
	}
	
	/**
	 * Dato un cliente, restituisce il numero di volte che lo stesso
	 * cliente è stato inserito tramite le funzione addCliente.
	 * Nel caso che un dato cliente sia stato inserito una sola volta,
	 * restituisce il valore 1. 
	 * @param d cliente da verificare
	 * @return numero di ripetizioni.
	 */
	public int numeroRipetizioni(Cliente d) {
		// TODO: da implementare
		return clienti.get(d);
	}

}
