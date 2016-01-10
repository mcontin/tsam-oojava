
public class Player {
	String name;
	int hp;
	
	public Player(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public Player() {
		name = null;
		hp = -1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
}
