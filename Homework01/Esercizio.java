
public class Esercizio {

	static int sumPos(int[] array) {
		int sum = 0;
		for (int el : array) {
			if (el > 0)
				sum += el;
		}
		return sum;
	}

	static int sumOdd(int[] array) {
		int sum = 0;
		for (int el : array) {
			if (el % 2 != 0)
				sum += el;
		}
		return sum;
	}

	static double average(int[] array) {
		int sum = 0;
		for (int el : array) {
			sum += el;
		}
		return sum / array.length;
	}

	static int sumRange(int start, int end) {
		int sum = 0;
		for(int i=start; i<=end; ++i){
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) { // argomento passato quando si
												// chiama in console
												// java Esercizio argomenti
		/*int[] a = { 7, -32, 3, 34, -7, 778, 4, -2, 23, 2 };
		a[3] = 5;
		System.out.println(average(a));
		*/	
	}
}
