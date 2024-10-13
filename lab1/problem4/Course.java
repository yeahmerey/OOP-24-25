package problem4;

public class Course {
	private String name ; 
	private String description ; 
	private int credits ; 
	private String prerequisite ; 
	
	public Course(String name , String description , int credits , String prerequisite) {
		this.name = name ; 
		this.description = description ; 
		this.credits = credits ; 
		this.prerequisite = prerequisite ; 
	}
	public String toString(){
        return name + " (" + description + "), credits:" + credits + ", prerequisite:" + prerequisite;
    }
}
