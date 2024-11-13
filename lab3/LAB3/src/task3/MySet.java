package task3;

import java.util.*;

public class MySet<E> implements MyCollection<E> {
	private HashSet<E> mySet ; 
	
	public MySet() {
		mySet = new HashSet<>();
	}

	@Override
	public void add(E element) {
		mySet.add(element); 
	}

	@Override
	public void remove(E element) {
		mySet.remove(element); 
	}

	@Override
	public boolean contains(E element) {
		return mySet.contains(element); 
	}

	
	@Override
	public int size() {
		return mySet.size(); 
	}

	@Override
	public boolean isEmpty() {
		return (mySet.size() == 0) ; 
	}

	@Override
	public void clear() {
		mySet.clear(); 
	}
	
	@Override
	public E get(int index) {
		throw new UnsupportedOperationException("In set doesn't getByIndex") ; 
	}
	@Override
	public E set(int index, E element) {
		throw new UnsupportedOperationException("In set doesn't setByIndex") ; 
	}
	
}
