package task3;

public class Test {
	public static void main(String[] args) {
		System.out.println(); 
		MyList<String> myList = new MyList<>() ; 
		myList.add("Apple");
		myList.add("Redmi");
		myList.add("Samsung");
		myList.add("Apple"); 
		
		System.out.println("contains apple :" + myList.contains("Apple")) ; 
		System.out.println("size of list : " + myList.size()); 
		System.out.println("Element at index 2 : " + myList.get(2)); 
		myList.set(2, "Oppo"); 
		System.out.println("Element at index 2 : " + myList.get(2)); 
		
		myList.clear();
		System.out.println("Is empty status : " + myList.isEmpty()); 
		
		System.out.println("-----------------"); 
		
		MySet<String> mySet = new MySet<>(); 
		mySet.add("Football");
		mySet.add("Volleyball"); 
		mySet.add("Basketball");
		mySet.add("Football"); 
		
		System.out.println("Contains Football in set : " + mySet.contains("Football")); 
		System.out.println("Size of set : " + mySet.size()); 
		try { 
			System.out.println("Element at index 1 : " + mySet.get(1)); 
		}catch(UnsupportedOperationException e) {
			System.err.println(e.getMessage()); 
		}
	}
}
