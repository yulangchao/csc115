public class Player
{
	private String name;
	private int battingAvg;

	// Purpose:
	// 	Initialize this instance of Player
	// 	set the battingAvg to be 0
	//
	public Player (String name)
	{
       this.name=name;
	   this.battingAvg=0;
	}

	// Purpose:
	//	Initialize this instance of Player
	//
	public Player (String name, int battingAvg)
	{
       this.name=name;
	   this.battingAvg=battingAvg;
		
	}

	// Purpose:
	// 	Change the name associated with this Player
	// 	to be newname
	//
	public void setName (String newName)
	{
      this.name=newName;
	}

	// Purpose:
	//	Return the name associated with this Player
	//
	public String getName()
	{
		return this.name;
	}

	// Purpose:
	//	Change the battingAvg associated with this Player 
	//	to be newbattingAvg
	//	
	public void setBattingAvg (int newBattingAvg)
	{
     this.battingAvg=newBattingAvg;
	}

	// Purpose:
	//	Return the battingAvg associated with this Player
	//
	public int getBattingAvg()
	{
        return this.battingAvg;
	}

	// Purpose:
	//	Compare this instance of Player to other
	//	return true if they are the same.
	//	
	//	We consider two Players to be equal if
	//	their name are the same.  We do NOT consider
	//	the battingAvg.
	//
	// Pre-conditions:
	//	other is not null
	//
	// Returns:
	//	true	if this instance's name are the same as
	//		other's name
	//	false	otherwise
	//
	// Examples:
	//
	//	Player p = new Player("Derek Jeter", 265);
	//	Player q = new Player("Derek Jeter", 300);
	//	Player r = new Player("Jose Bautista", 400);
	//	
	//	p.equals(q)	- returns true
	//	p.equals(r)	- returns false
	public boolean equals (Player other)
	{
	   if(other.getName()!=null&&other.getName()!=""){    //it doesnt work!
	   
	   
	   if(this.name.equals(other.getName())){
	   return true;
	   }   
	   }
		return false;
	}

	// Purpose:
	//	Return a String representation of this Player
	// 
	// Returns:
	//	name: battingAvg
	//	
	// Examples:
	// 	Player p = new Player("Derek Jeter", 265);
	//	
	//	p.toString() returns	Derek Jeter:265
	//
	public String toString()
	{
			return this.name+":"+this.battingAvg;
	}
}
