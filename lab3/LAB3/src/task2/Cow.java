package task2;

public class Cow implements Moved{
	final String name ; 
	private int speed ; 
	public Cow(String name , int speed) {
		this.name = name;  
		this.speed = speed;  
	}
	@Override
	public void peopleCanMove() {
		System.out.println("People can move a cow as he wants"); 
	}

	@Override
	public void canMoveItself() {
		System.out.println("Cow can move with speed : " + speed); 
		
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String info() {
		return "It is a cow , name :" + name ; 
	}
	

}
