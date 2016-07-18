/*
 * For assignments: ID: V00830514  Name:Yingchao Yu
 * Assignment 2 Doubly-Linked List implementation of PlayerList.
 * 
 *
 */

public class PlayerLinkedList implements PlayerList

{
	private PlayerNode	head;
	private PlayerNode	tail;

	private	int		count;

	public PlayerLinkedList()
	{
       head=new PlayerNode();
       tail=new PlayerNode();
       head.next=tail;
       tail.prev=head;
       count=0;
	}
	
//Add the element p at position pos in the list.

	public void addAt (Player p, int pos)
	{   
	
	   
        PlayerNode temp = new PlayerNode(p);
        PlayerNode current = head;
        PlayerNode pre=head;
//find the position where we need to insert the player.
        for (int i = 1; i < pos+1 && current.getNext() != null; i++) 
        {
            current = current.getNext();
        }

        temp.next=current.next;	
        temp.prev=current;
        current.next=temp;
        count++;
       
	}
//Add the element p to the end of the list.
	public void append (Player p)
	{
	  PlayerNode x=new PlayerNode(p);
	  PlayerNode last=tail.prev;
	  x.next=tail;
	  x.prev=last;
	  tail.prev=x;
	  last.next=x;
	  count++;
	}
//Return the number of elements in the list
	public int size()
	{
		return count;
	}
	
//Return the element at position pos in the list.
	public Player  get (int pos)
	{
	    if (pos < 0)
            return null;
 
       PlayerNode current = head.getNext();
        for (int i = 0; i < pos; i++) 
        {
            if (current.getNext() == null)
                return null;
 
            current = current.getNext();
        }
        return current.getPlayer();
	}


//	   Returns the index of the first occurrence of player p in the list.
//  	If not found returns -1.
	public int find (Player p)
	{  PlayerNode current=head;
	   int a=0;
	   
        for(int i=0;i<count;i++)
        {
        	if(current.next.p.equals(p))
        	{
        	
        	return i;
        	}
            current=current.next;
        }
		return -1;		
	}
	
	
//Remove all elements from the list.  After calling this	 
	public void clear()
	{
       head=new PlayerNode();
       count=0;
	}
	
	
//Remove the element at position pos from the list.	
	public void removeAt (int pos)
	{
		PlayerNode current;
		current = head.next;
		for(int i=0;i<pos;i++) 
		{
			current = current.next;
		}
		current.prev.next = current.next;
		current.next.prev = current.prev;
		count--;

	}
	
//Remove all instances that match player p from the list.	 
	public void remove (Player p)
	{   
	    while(find(p)!=-1)
	    {
	    
        int pos=find(p);
		PlayerNode currenta;
		currenta = head.next;
		for(int i=0;i<pos;i++) 
		{
			currenta = currenta.next;
		}
		currenta.prev.next = currenta.next;
		currenta.next.prev = currenta.prev;
		count--;
	}  
	     
    }
	
//Return a string representation of the list
	public String toString()
	{
	    PlayerNode curr = head.next;
        String output = "{";
        for(int i=0;i<count;i++,curr=curr.next)
        {
        	if(i==count-1)
        	  output+=curr.p.toString();
        	 else
        	 output+=curr.p.toString()+",";
        }
        output+="}";
        return output;
	}
	
	/*
	 * Here you see some basic testing I did before moving on to
	 * the more detailed testing provided by a2tester.java
	 *
 	 * You can run this by typing:
	 * javac PlayerArrayList.java
 	 * java PlayerArrayList
	 *
	 */
	public static void main (String[] args)
	{
	
		PlayerLinkedList l = new PlayerLinkedList();
		
		System.out.println(l);
		l.append(new Player("one"));
		l.append(new Player("two"));
		l.append(new Player("ten"));
		l.append(new Player("five"));
		System.out.println(l);
		System.out.println();
		
		l.clear();
		System.out.println(l);
		System.out.println();	
		
		l.addAt(new Player("one"),0);
		l.addAt(new Player("two"),0);
		l.addAt(new Player("ten"),0);
		l.addAt(new Player("five"),2);
		System.out.println(l);
		System.out.println();
	}


}

