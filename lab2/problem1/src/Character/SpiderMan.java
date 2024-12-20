package Character;
import java.util.Objects ; 
public class SpiderMan extends Character{
	
	private int favouriteCharacterLevel ; 
	
	public SpiderMan(String name , int power , int level) {
		super(name , power) ;
		this.favouriteCharacterLevel = level ;  
	}
	public int getFavouriteLevel() {
		return favouriteCharacterLevel ; 
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(!super.equals(obj)) return false ; 
		SpiderMan spiderman = (SpiderMan) obj ; 
		return favouriteCharacterLevel == spiderman.favouriteCharacterLevel ; 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode() , favouriteCharacterLevel);
	}
	@Override
	public String powerDefinition() {
		return super.powerDefinition() + "to towns People.";
	}
	@Override
	public String toString() {
		return super.toString() + " Favourite Character Level : " + favouriteCharacterLevel ; 
	}
}
