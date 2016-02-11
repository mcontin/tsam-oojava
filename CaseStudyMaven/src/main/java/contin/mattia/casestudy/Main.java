package contin.mattia.casestudy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

public class Main {
	
	public static void main(String[] args) {
		//AIzaSyB5GGoPW7HZwSr5t2Oz50-rdCkCZhECuEU
		try{
			//17 ; 18 keywords
			FileReader file = new FileReader("src/main/resources/CSV/attiv_commerc.csv");
			BufferedReader br = new BufferedReader(file);
			String line = br.readLine();	//read header
			
			String[] element = new String[18];	//string array to store data of a line
			
			int i = 0;
			
			Map<Address, ArrayList<Integer>> addresses = new HashMap<Address, ArrayList<Integer>>();
			Address address = null;			
			
			StringBuilder builder = new StringBuilder();
			
			ArrayList<Integer> sameAddress = new ArrayList<Integer>(); 
			
			while((line = br.readLine()) != null){
				//loop per prendere la linea completa di ogni record
				while(countOccurrences(line, ';') < 17){
					line = line.concat(br.readLine());
				}
				
				//array che salva i valori del record
				element = line.split(";");
				
				//se l'indirizzo è valido, crea oggetto
				if(element[2].length() > 0 && element[3].length() > 0 && element[4].length() > 0){
					address = new Address(element[2], element[3], element[4], element[5]);
					++i;				
					//prende lista di indirizzi già esistenti
					ArrayList<Integer> temp = addresses.get(address);
					//controlla se esiste la lista, se sì
					if(temp == null){
						sameAddress = new ArrayList<Integer>();
						sameAddress.add(i);
						addresses.put(address, sameAddress);
					}
					else {
						temp.add(i);
						addresses.put(address, temp);
					}
				}
			}
	        System.out.println("Numero record: " + (i-1));
	        
	        /*
	        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyB5GGoPW7HZwSr5t2Oz50-rdCkCZhECuEU");
			GeocodingResult[] results =  GeocodingApi.geocode(context,
					"Milano " + addresses.get(inputId)).await();
			System.out.println(results[0].formattedAddress);
			*/
	        
			FileWriter fw = new FileWriter("nomefileout.csv");
			PrintWriter pw = new PrintWriter(fw);
			pw.println("id1;lat;lng;google address");
			int k=0;
			
			GeoApiContext context = null;
			GeocodingResult[] results = null;
			
			for(Address tAddress: addresses.keySet()) {
		    	System.out.println(tAddress.toString());
		        pw.println(tAddress);
		        if(k<10){
		        context = new GeoApiContext().setApiKey("AIzaSyB5GGoPW7HZwSr5t2Oz50-rdCkCZhECuEU");
				results =  GeocodingApi.geocode(context,
						"Milano " + tAddress.toString()).await();
				System.out.println(results[0].formattedAddress);
		        }
		        ++k;
		    }
			
		    pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static int countOccurrences(String str, char c){
		int i = 0;
		for(int j = 0; j<str.length(); ++j){
			if(str.charAt(j) == c)
				++i;
		}
		return i;
	}
}
