import java.util.*;

public class ListOperations{

	// prints a list of type T to the console with a newline 
	// after each element
	// precondtion:  type T implements the toString() method
	public static <T> void printList(List<T> l){
	
		ListIterator<T> i = l.listIterator();

		String s = "";	
		while (i.hasNext()) 
          	s+=(i.next()+ "\n");
       
       	System.out.println(s);
	}
	
	// sorts a list of type T where T is type that extends 
	// the Comparable<T> interface
	// and therefore implements the compareTo(T o) method
	// uses the selection sort algorithm 
	// with the get(int index) method of List
	public static <T extends Comparable<? super T>> void selectionSort(List<T> list){
        T temp;
    	int pos;
    	int n = list.size();
		for (int i=0; i<n-1; i++) {
			pos = i;
			for (int j=i+1; j<n; j++) {
				if(list.get(j).compareTo(list.get(pos)) < 0) {
					pos = j;
				}
			}
			if(pos != i){
				temp = list.get(i);
				list.set(i, list.get(pos));
				list.set(pos, temp);
	     	}
		}
	}
	
	// sorts a list of type T where T is type that extends 
	// the Comparable<T> interface
	// and therefore implements the compareTo(T o) method
	// uses the bubblesort algorithm 
	// with the get(int index) method of List
	public static <T extends Comparable<? super T>> void bubbleSort(List<T> list){
 
       T temp;
       int n=list.size();
       for(int i=0;i<n-1;i++)
       {
       for(int j=i+1;j<n;j++)
       {
       if(list.get(i).compareTo(list.get(j))>0)
       {
       temp = list.get(i);
       list.set(i,list.get(j));
       list.set(j,temp);
       }
       }
       }
   	}

	// sorts a list of type T where T is type that extends 
	// the Comparable<T> interface
	// and therefore implements the compareTo(T o) method
	// uses the bubblesort algorithm 
	// with the listIterator() method of List
	public static <T extends Comparable<? super T>> void bubbleSortI(List<T> list){
       T temp;
       int n=list.size();
       for(int i=0;i<n-1;i++)
       {
       for(int j=i+1;j<n;j++)
       {
       if(list.get(i).compareTo(list.get(j))>0)
       {
       temp = list.get(i);
       list.set(i,list.get(j));
       list.set(j,temp);
       }
       }
       }
	}
	
	// sorts a list of type T where T is type that extends 
	// the Comparable<T> interface
	// and therefore implements the compareTo(T o) method
	// uses the quicksort algorithm 
	// with the get(int index) method of List
	public static <T extends Comparable<? super T>> void quicksort(List<T> list){
		quickSort(list, 0, list.size()-1);
	}
	
	// private helper method that can be used to implement quicksort recursively
	private static <T extends Comparable<? super T>> void quickSort(List<T> list, int lo, int hi){
		if(lo<hi){
			int n=partition(list,lo,hi);
			quickSort(list,lo,n-1);
			quickSort(list,n+1,hi);
		}
		
}		
    public static <T extends Comparable<? super T>> int partition(List<T> list, int lo, int hi){
		T key=list.get(lo);
		while(lo<hi){
			while(lo<hi&&list.get(hi).compareTo(key)>=0){
			 hi--;
			 }
			 list.set(lo,list.get(hi)); 
			
			while(lo<hi&&list.get(lo).compareTo(key)<=0){
		     lo++;
		     }
		     list.set(hi,list.get(lo));		
				
		}
		list.set(lo,key);
		return lo;
		
}

	// sequentially searches a list of type T for element e of type T 
	// where T is a type that extends the Comparable<T> interface and
	// therefore implements the compareTo(T o) method
	// This method uses the get(int index) method of List
	// 
	// if found returns the position at which e is stored, else returns -1
	public static <T extends Comparable<? super T>> int seqSearch(List<T> list, T e){
		int n=list.size();
		for(int i=0;i<n;i++){
			if(list.get(i).compareTo(e)==0){
				return i;
			}
		}
		return -1;
	
	}
	
	// sequentially searches a list of type T for element e of type T 
	// where T is a type that extends the Comparable<T> interface and 
	// therefore implements the compareTo(T o) method
	// This method uses iterators from  List
	// 
	// if found returns the position at which e is stored, else returns -1
	public static <T extends Comparable<? super T>> int seqSearchI(List<T> list, T e){
		int k=0;
		ListIterator<T>	i=list.listIterator();
        while(i.next().compareTo(e)!=0){
        	k++;
    
        }
        if(k<list.size()){
        	return k;
        }
		return -1;
	}
	
	// searches a list of type T for element e of type T where T is  
	// a type that extends the Comparable<T> interface and therefore 
	// implements the compareTo(T o) method using the binary search method
	//
	// precondtion:  list is in sorted order
	// 
	// if found returns the position at which e is stored, else returns -1
	public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T e){
        int a=binarySearch(list,e,0, list.size()-1);
		return a;
	}
	
	// private helper method that can be used to implement binary search recursively
	private static <T extends Comparable<? super T>> int binarySearch(List<T> list, T e, int left, int right){
		while(left<=right){
			int mid=(left+right)/2;
			if(e.compareTo(list.get(mid))<0){
				right=mid-1;
				}else if(e.compareTo(list.get(mid))>0){
					left=mid+1;
				}else{
					return mid;
				}
		}
		
		return -1;
		
	}
	


}