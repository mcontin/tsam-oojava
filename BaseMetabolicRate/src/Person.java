
public class Person {
	int height;
	int weight;
	int age;
	String physActivity;
	char sex;
	
	public Person(int h, int w, int a, String phys, char s){
		this.height = h;
		this.weight = w;
		this.age = a;
		this.physActivity = phys;
		this.sex = s;
	}
	public Person(){
		this.height = 0;
		this.weight = 0;
		this.age = 0;
		this.physActivity = null;
		this.sex = '\0';
	}
	
}
