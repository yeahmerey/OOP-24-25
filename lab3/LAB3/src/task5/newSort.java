package task5;

public class newSort {
	static <E> void swap(E[] a , int i , int j) {
		E temp  = a[i] ; 
		a[i] = a[j];  
		a[j] = temp ; 
	}
	static <E extends Comparable<E>> void bubbleSort(E[] a) {
		int size = a.length ; 
		boolean check ; 
		for(int i = 0 ; i < size - 1 ; i ++) {
			check = false ; 
			for(int j = 0 ; j < size -1 - i ; j++) {
				if(a[j].compareTo(a[j+1]) == 1) {
					swap(a , j , j+1) ; 
				}
			}
			if(!check) {
				break ; 
			}
		}
	}
}
