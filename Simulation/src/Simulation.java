import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Simulation {
	public static Cell[][] field;
	public static ArrayList<Predator> predators;
	public static ArrayList<Prey> preys;
	
	public static void main(String[] args){
		generateField(20,20,10,100);				//x,y,nPredators,nPreys
		int i=0;
		while(i<500){
			printField();
			turn();
			try {
			    Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			++i;
		}
		
	}
	
	public static void generateField(int x, int y, int nPredators, int nPreys){
		field = new Cell[x][y];
		for(int i=0; i<x; ++i){
			for(int j=0; j<y; ++j){
				field[i][j] = new Cell();
			}
		}
		
		int elsGenerated = 0;
		int elX = -1;
		int elY = -1;
		Predator tPredator = null;
		predators = new ArrayList<Predator>();
		while(elsGenerated<nPredators){				//predators generation
			do{								//tries x and y until position is free, then creates element
				elX = ThreadLocalRandom.current().nextInt(0, 19 + 1);
				elY = ThreadLocalRandom.current().nextInt(0, 19 + 1);
			}while(!field[elX][elY].isFree);
			tPredator = new Predator(elX,elY);
			predators.add(tPredator);
			field[elX][elY].occupy(tPredator);
			++elsGenerated;
		}
		
		Prey tPrey = null;
		preys = new ArrayList<Prey>();
		while(elsGenerated<nPreys){			//preys generation
			do{								//tries x and y until position is free, then creates element
				elX = ThreadLocalRandom.current().nextInt(0, 19 + 1);
				elY = ThreadLocalRandom.current().nextInt(0, 19 + 1);
			}while(!field[elX][elY].isFree);
			tPrey = new Prey(elX,elY);
			preys.add(tPrey);
			field[elX][elY].occupy(tPrey);
			++elsGenerated;
		}
	}

	public static void printField(){
		for(int i=0; i<20; ++i){
			for(int j=0; j<20; ++j){
				System.out.print(field[i][j].val);
			}
			System.out.print("\n");
		}
		int predsNum = 0;
		int preysNum = 0;
		for(Predator tPredator: predators){
			if(tPredator.isAlive())
				++predsNum;
		}
		for(Prey tPrey: preys){
			if(tPrey.isAlive())
				++preysNum;
		}
		System.out.println("Predators: "+predsNum+" | Preys: "+preysNum);
		System.out.println("\n ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
	
	public static void turn(){
		int direction = 0;					//0 to 3 (up,right,down,left)
		for(Predator tPredator: new ArrayList<Predator>(predators)){
			if(tPredator.isAlive()){
				direction = ThreadLocalRandom.current().nextInt(0, 3 + 1);
				switch(direction){
					case 0:			//up y-1
						if(tPredator.getY() - 1 >= 0){
							if(field[tPredator.getX()][tPredator.getY()-1].isFree()){
								field[tPredator.getX()][tPredator.getY()].free();
								tPredator.moveUp();
								field[tPredator.getX()][tPredator.getY()].occupy(tPredator);
								tPredator.increaseHunger();
							}
							else if(field[tPredator.getX()][tPredator.getY()-1].isTherePrey()){
								field[tPredator.getX()][tPredator.getY()].free();
								tPredator.moveUp();
								field[tPredator.getX()][tPredator.getY()].occupy(tPredator);
								for (int i = 0; i < preys.size(); i++) {				//kill prey
									if(preys.get(i).getX() == tPredator.getX() && preys.get(i).getY() == tPredator.getY()){
										preys.get(i).kill();
									}
								}
								tPredator.resetHunger();
							}
							else {
								tPredator.increaseHunger();
							}
						}
						break;
					case 1:			//right x+1
						if(tPredator.getX() + 1 <= 19){
							if(field[tPredator.getX()+1][tPredator.getY()].isFree()){
								field[tPredator.getX()][tPredator.getY()].free();
								tPredator.moveRight();
								field[tPredator.getX()][tPredator.getY()].occupy(tPredator);
								tPredator.increaseHunger();
							}
							else if(field[tPredator.getX()+1][tPredator.getY()].isTherePrey()){
								field[tPredator.getX()][tPredator.getY()].free();
								tPredator.moveRight();
								field[tPredator.getX()][tPredator.getY()].occupy(tPredator);
								for (int i = 0; i < preys.size(); i++) {				//kill prey
									if(preys.get(i).getX() == tPredator.getX() && preys.get(i).getY() == tPredator.getY()){
										preys.get(i).kill();
									}
								}
								tPredator.resetHunger();
							}
							else {
								tPredator.increaseHunger();
							}
						}
						break;
					case 2:			//down y+1
						if(tPredator.getY() + 1 <= 19){
							if(field[tPredator.getX()][tPredator.getY()+1].isFree()){
								field[tPredator.getX()][tPredator.getY()].free();
								tPredator.moveDown();
								field[tPredator.getX()][tPredator.getY()].occupy(tPredator);
								tPredator.increaseHunger();
							}
							else if(field[tPredator.getX()][tPredator.getY()+1].isTherePrey()){
								field[tPredator.getX()][tPredator.getY()].free();
								tPredator.moveDown();
								field[tPredator.getX()][tPredator.getY()].occupy(tPredator);
								for (int i = 0; i < preys.size(); i++) {				//kill prey
									if(preys.get(i).getX() == tPredator.getX() && preys.get(i).getY() == tPredator.getY()){
										preys.get(i).kill();
									}
								}
								tPredator.resetHunger();
							}
							else {
								tPredator.increaseHunger();
							}
						}
						break;
					case 3:			//left x-1
						if(tPredator.getX() - 1 >= 0){
							if(field[tPredator.getX()-1][tPredator.getY()].isFree()){
								field[tPredator.getX()][tPredator.getY()].free();
								tPredator.moveLeft();
								field[tPredator.getX()][tPredator.getY()].occupy(tPredator);
								tPredator.increaseHunger();
							}
							else if(field[tPredator.getX()-1][tPredator.getY()].isTherePrey()){
								field[tPredator.getX()][tPredator.getY()].free();
								tPredator.moveLeft();
								field[tPredator.getX()][tPredator.getY()].occupy(tPredator);
								for (int i = 0; i < preys.size(); i++) {				//kill prey
									if(preys.get(i).getX() == tPredator.getX() && preys.get(i).getY() == tPredator.getY()){
										preys.get(i).kill();
									}
								}
								tPredator.resetHunger();
							}
							else {
								tPredator.increaseHunger();
							}
						}
						break;
					default:
						break;
				}
				tPredator.increaseEgg();
				if(tPredator.getHunger() == 8){
					field[tPredator.getX()][tPredator.getY()].free();
					tPredator.kill();
				}
				else if(tPredator.getEgg() == 8){
					tPredator.resetEgg();
					if(tPredator.getX() + 1 <= 19 && field[tPredator.getX()+1][tPredator.getY()].isFree()){
						predators.add(new Predator(tPredator.getX()+1,tPredator.getY()));
						field[tPredator.getX()+1][tPredator.getY()].occupy(new Predator(tPredator.getX()+1,tPredator.getY()));
					}
					else if(tPredator.getX() - 1 >= 0 && field[tPredator.getX()-1][tPredator.getY()].isFree()){
						predators.add(new Predator(tPredator.getX()-1,tPredator.getY()));
						field[tPredator.getX()-1][tPredator.getY()].occupy(new Predator(tPredator.getX()-1,tPredator.getY()));
					}
					else if(tPredator.getY() + 1 <= 19 && field[tPredator.getX()][tPredator.getY()+1].isFree()){
						predators.add(new Predator(tPredator.getX(),tPredator.getY()+1));
						field[tPredator.getX()][tPredator.getY()+1].occupy(new Predator(tPredator.getX(),tPredator.getY()+1));
					}
					else if(tPredator.getY() - 1 >= 0 && field[tPredator.getX()][tPredator.getY()-1].isFree()){
						predators.add(new Predator(tPredator.getX(),tPredator.getY()-1));
						field[tPredator.getX()][tPredator.getY()-1].occupy(new Predator(tPredator.getX(),tPredator.getY()-1));
					}
				}
			}
		}
		
		for(Prey tPrey: new ArrayList<Prey>(preys)){
			if(tPrey.isAlive()){
				direction = ThreadLocalRandom.current().nextInt(0, 3 + 1);
				switch(direction){
					case 0:			//up y-1
						if(tPrey.getY() - 1 >= 0){
							if(field[tPrey.getX()][tPrey.getY()-1].isFree()){
								field[tPrey.getX()][tPrey.getY()].free();
								tPrey.moveUp();
								field[tPrey.getX()][tPrey.getY()].occupy(tPrey);
							}
						}
						break;
					case 1:			//right x+1
						if(tPrey.getX() + 1 <= 19){
							if(field[tPrey.getX()+1][tPrey.getY()].isFree()){
								field[tPrey.getX()][tPrey.getY()].free();
								tPrey.moveRight();
								field[tPrey.getX()][tPrey.getY()].occupy(tPrey);
							}
						}
						break;
					case 2:			//down y+1
						if(tPrey.getY() + 1 <= 19){
							if(field[tPrey.getX()][tPrey.getY()+1].isFree()){
								field[tPrey.getX()][tPrey.getY()].free();
								tPrey.moveDown();
								field[tPrey.getX()][tPrey.getY()].occupy(tPrey);
							}
						}
						break;
					case 3:			//left x-1
						if(tPrey.getX() - 1 >= 0){
							if(field[tPrey.getX()-1][tPrey.getY()].isFree()){
								field[tPrey.getX()][tPrey.getY()].free();
								tPrey.moveLeft();
								field[tPrey.getX()][tPrey.getY()].occupy(tPrey);
							}
						}
						break;
					default:
						break;
				}
				tPrey.increaseEgg();
				if(tPrey.getEgg() == 3){
					tPrey.resetEgg();
					if(tPrey.getX() + 1 <= 19 && field[tPrey.getX()+1][tPrey.getY()].isFree()){
						preys.add(new Prey(tPrey.getX()+1,tPrey.getY()));
						field[tPrey.getX()+1][tPrey.getY()].occupy(new Prey(tPrey.getX()+1,tPrey.getY()));
					}
					else if(tPrey.getX() - 1 >= 0 && field[tPrey.getX()-1][tPrey.getY()].isFree()){
						preys.add(new Prey(tPrey.getX()-1,tPrey.getY()));
						field[tPrey.getX()-1][tPrey.getY()].occupy(new Prey(tPrey.getX()-1,tPrey.getY()));
					}
					else if(tPrey.getY() + 1 <= 19 && field[tPrey.getX()][tPrey.getY()+1].isFree()){
						preys.add(new Prey(tPrey.getX(),tPrey.getY()+1));
						field[tPrey.getX()][tPrey.getY()+1].occupy(new Prey(tPrey.getX(),tPrey.getY()+1));
					}
					else if(tPrey.getY() - 1 >= 0 && field[tPrey.getX()][tPrey.getY()-1].isFree()){
						preys.add(new Prey(tPrey.getX(),tPrey.getY()-1));
						field[tPrey.getX()][tPrey.getY()-1].occupy(new Prey(tPrey.getX(),tPrey.getY()-1));
					}
				}
			}
		}
		
	}
}