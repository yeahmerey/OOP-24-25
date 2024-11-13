package task2;

public class Fridge implements Moveable{
	public Fridge() {
	}
	@Override
	public void peopleCanMove() {
		System.out.println("People can move fridge as he wants"); 
	}
	@Override
	public String info() {
		return "It is a fridge" ; 
	}
}
