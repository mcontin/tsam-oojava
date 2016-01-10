
public class Worker {
	String name;
	String surname;
	int seniority;
	Contract contract;
	
	public Worker(String n, String surn, int sen, Contract c){
		this.name = n;
		this.surname = surn;
		this.seniority = sen;
		this.contract = c;
	}
	public Worker(){
		name = null;
		surname = null;
		seniority = -1;
		contract = null;
	}
	
	double getAnnualWage(){
		return contract.annualWage + (contract.annualWage * (0.05 * seniority));
	}
}
