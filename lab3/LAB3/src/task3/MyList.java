package task3;
import java.util.* ; 
public class MyList<E> implements MyCollection<E> {
	private ArrayList<E> list ; 
	
	public MyList() {
		list = new ArrayList<>() ; 
	}
	@Override
	public void add(E element) {
		list.add(element); 	
	}
	@Override
	public void remove(E element) {
		list.remove(element) ; 
	}
	@Override
	public boolean contains(E element) {
		return list.contains(element); 
	}
	@Override
	public int size() {
		return list.size() ; 
	}
	@Override
	public boolean isEmpty() {
		return (list.size() == 0) ? true : false;  
	}
	@Override
	public void clear() {
		list.clear();
	}
	@Override
	public E get(int index) {
		return list.get(index); 
	}
	@Override
	public E set(int index, E element) {
		return list.set(index, element); 
	}
}
