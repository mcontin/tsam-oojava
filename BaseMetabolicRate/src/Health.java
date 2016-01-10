
public class Health {
	
	public double calculateMB(Person p){
		if(p.sex == 'm'){
			switch(p.physActivity){
			case "sedentario":
				return (655+(13.8*p.weight)+(1.8*p.height)-(4.7*p.age)) * 1.2;
			case "moderatamente attivo":
				return (655+(13.8*p.weight)+(1.8*p.height)-(4.7*p.age)) * 1.3;
			case "attivo":
				return (655+(13.8*p.weight)+(1.8*p.height)-(4.7*p.age)) * 1.4;
			case "molto attivo":
				return (655+(13.8*p.weight)+(1.8*p.height)-(4.7*p.age)) * 1.5;
			default:
				return -1;
			}
		}
		else{
			switch(p.physActivity){
			case "sedentario":
				return (655+(9.6*p.weight)+(1.8*p.height)-(4.7*p.age)) * 1.2;
			case "moderatamente attivo":
				return (655+(9.6*p.weight)+(1.8*p.height)-(4.7*p.age)) * 1.3;
			case "attivo":
				return (655+(9.6*p.weight)+(1.8*p.height)-(4.7*p.age)) * 1.4;
			case "molto attivo":
				return (655+(9.6*p.weight)+(1.8*p.height)-(4.7*p.age)) * 1.5;
			default:
				return -1;
			}
		}
	}
}
