package sawapp;

public class Status {
	
	private Integer[] lifePoints = new Integer[9];
	private int turn = 0;
	private int clothType = 0;
	
	public void setLifePoints(Integer[] lifePoints){
		if(lifePoints.length == 9){
			this.lifePoints = lifePoints;
		}
	}
	public int getLifePoints(int i){
		
		try{
			return lifePoints[i];
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			return 0;
		}
	}
	public void setTurn(int turn){
		if(turn >= 0 ){
			this.turn = turn;
		}
	}
	public int getTurn(){
		return turn;
	}
	public void setClothType(int clothType){
		if((clothType >= 0)&&(clothType < 4)){
			this.clothType = clothType;
		}
	}
	public int getClothType(){
		return clothType;
	}
}
