
public class Game {
	Player player;
	
	public Game(Player player){
		this.player = player;
	}
	public Game(){
		player = null;
	}
	
	public int attackPlayer(Alien alien){
		if(isPlayerAlive()){
			player.setHp(player.getHp() - alien.getDamage());
			return player.getHp(); 
		}
		else {
			return -1;			//-1 counts as an error code for player already dead
		}
	}
	
	public boolean isPlayerAlive(){
		return (player.hp > 0)?true:false;
	}
}
