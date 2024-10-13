package problem3;

public class Temperature {
	private double value ; 
	private char scale ; 
	
	public Temperature(double tempValue) {
		this.value = tempValue ; 
		this.scale = 'C'; 
	}
	public Temperature(char tempScale) {
		this.value = 0 ; 
		this.scale = tempScale ; 
	}
	public Temperature(double tempValue , char tempScale) {
		this.value = tempValue ; 
		this.scale = tempScale ;
	}
	public Temperature() {
		this.value = 0 ; 
		this.scale = 'C';
	}
	//Методы
    public int toFahrenheit(int tempValue , char unit){
        if(unit == 'C'){
            tempValue = (9 * (tempValue / 5)) + 32 ;
            this.scale = 'F'; 
        }
        return tempValue;
    }
    public int toCelsius(int tempValue , char unit){
        if(unit == 'F'){
            tempValue = 5 * (tempValue - 32) / 9 ;
            this.scale = 'C'; 
        }
        return tempValue ;
    }
    public void setValue(double t){this.value = t ;}
    public void setUnit(char x){this.scale = x ;}
    public void setTemp(double t , char x){
        value = t ;
        scale = x ;
    }
    public char getScale(){
        return scale ;
    }
}
