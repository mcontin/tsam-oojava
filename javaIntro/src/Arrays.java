
public class Arrays {

	public static void main(String[] args){
		int[] array = new int[10];
		array[3] = 10; //runtime  error
		
		for(int el: array){
			System.out.println(el);
		}
	}
	
}
