
public class Money {
	int amount;
	
	public Money(int a){
		this.amount = a;
	}
	public Money(){
		amount = 0;
	}
	
	public int[] getMaxChange(){
		int money = this.amount;
		int[] total = new int[9];
		int[] banknotes = {500,200,100,50,20,10,5,2,1};
		int i = 0;
		while(i < banknotes.length){
			while(money >= banknotes[i]){
				money -= banknotes[i];
				++total[i];
			}
			++i;
		}
		return total;
	}
}
