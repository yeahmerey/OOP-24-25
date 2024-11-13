package task3;

import java.util.* ;  
interface MyCollection<E>{
	//add remove contains size isEmpty() , clear , get(ind) , get(ind , el) ; 
	
	void add(E element); 
	void remove(E element); 
	boolean contains(E element) ;
	int size() ; 
	boolean isEmpty(); 
	void clear() ; 
	E get(int index); 
	E set(int index , E element); 
}
