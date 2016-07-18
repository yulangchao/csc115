public class LLStack<T> implements Stack<T>
{
	
	private Node<T> head;
	private int count;
	public LLStack(){
		head = null;
		count=0;
	}

    public int size(){
	    return count;
	
    }
    
	public boolean empty(){
		return (head == null);
	}
    
	public void push(T element){
		Node<T> newNode = new Node<T>(element);
		newNode.setNext(head);
		head = newNode;
		count++;
	}

	public T pop() throws StackEmptyException{
		if (empty()){
		
			throw new StackEmptyException("Stack empty");
		}
		T firstItem = head.getData();
		head = head.getNext();
		count--;
		return firstItem;

	}

	public T peek() throws StackEmptyException{
		return head.getData();
	}
	
	public void makeEmpty(){
		head=null;
		count=0;
		
	}



	
	public String toString(){
		String result = "Stack:";
		Node currentNode = head;
		while (currentNode != null){
			result += " -> " + currentNode.getData();
			currentNode = currentNode.getNext();
		}
		return result;
	}

}
