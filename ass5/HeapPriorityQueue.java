/*
 * HeapPriorityQueue.java
 *
 * An implementation of a PriorityQueue using a heap.
 * based on the implementation in "Data Structures and Algorithms
 * in Java", by Goodrich and Tamassia
 *
 * This implementation will throw a Runtime, HeapEmptyException 
 *	if the heap is empty and removeHigh is called.
 *
 * This implementation will throw a Runtime, HeapFullException 
 *	if the heap is full and insert is called.
 * 
 */
 
public class HeapPriorityQueue implements PriorityQueue 
{
	protected final static int DEFAULT_SIZE = 10000;
	
	protected Comparable[] storage;
	protected int currentSize;
			
	public HeapPriorityQueue () 
	{
		this(DEFAULT_SIZE);
	}

	public HeapPriorityQueue(int size)
	{
        currentSize=0;
        storage=new Comparable[size+1];
	}
	
	public int size ()
	{
		return currentSize;
	}
	
	public boolean isEmpty ( )
	{
		return currentSize==0;
	}

	public boolean isFull ( )
	{
		return currentSize==10000;
	}
	
	public Comparable removeHigh () throws HeapEmptyException
	{   Comparable a= storage[0];
        storage[0]=storage[currentSize-1];
        currentSize--;
        int child;
        int h=0;
        Comparable b=storage[h];
        while ((h+1)*2<=currentSize){
        	child=h*2+1;
        	if(storage[child].compareTo(b)>0||storage[child+1].compareTo(b)>0){
        		if(storage[child+1].compareTo(storage[child])>=0){
        			storage[h]=storage[child+1];
        			storage[child+1]=b;
        			child++;
        		}else{
        			storage[h]=storage[child];
        			storage[child]=b;
        		}
        		
        	}else{
        		break;
        	}
        
        	h=child;
        }
  
		return a;
	}
	
	public void insert ( Comparable k  ) throws HeapFullException
	{	
        int h=currentSize;
        storage[h]=k;
        currentSize++;
        int p=(h-1)/2;
        while(h>0&&k.compareTo(storage[p])>0) {
        
        	storage[h]=storage[p];
        	storage[p]=k;
        	h=p;
        	p=(p-1)/2;
        }      
       
        
	}
		
	protected void bubbleUp ( ) 
	{
	
	}

	protected void bubbleDown() 
	{

	}	
	
	protected void swapElement ( int p1, int p2 )
	{

	}
	
	protected int parent ( int pos )
	{
		return -1;
	}
	
	protected int leftChild ( int pos )
	{
		return -1;
	}
	
	protected int rightChild ( int pos )
	{	
		return -1;
	}
	
	protected boolean hasLeft ( int pos )
	{
		return false;
	}
	
	protected boolean hasRight ( int pos )
	{
		return false;
	}


}
