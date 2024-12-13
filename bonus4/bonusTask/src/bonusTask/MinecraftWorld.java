package bonusTask;
import java.util.List; 
import java.util.ArrayList;
public class MinecraftWorld {
	
	private List<List<Integer>> world; 
	private int worldSize_x ; 
	private int worldSize_y ; 
	public MinecraftWorld(int x , int y) {
		this.worldSize_x = x; 
		this.worldSize_y = y; 
		world = new ArrayList<>(); 
		for(int i = 0 ; i < worldSize_x ; i ++) {
			List<Integer> row = new ArrayList<>(); 
			for(int j = 0 ; j < worldSize_y ; j++) {
				row.add(0) ; 
			}
			world.add(row) ; 
		}
	}
	public void placeEntity(int x , int y ,  int type) {
		world.get(x).set(y, type) ; 
	}
	public boolean isFoodReachable(Slime slime , Food food) {
		int distance = Math.abs(slime.getX() - food.getX()) + Math.abs(slime.getY() - food.getY()); 	
		return distance <= slime.getExperience() ; 
	}
	public void displayWorld() {
		for(List<Integer> row : world) {
			for(int c : row) {
				System.out.print(c + " "); 
			}
			System.out.println();
		}
	}
}
	