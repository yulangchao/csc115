public class Patient implements Comparable<Patient>
{
	private String name;
	private int carecard;
	private int priority;
	private String initAssessment;


	public Patient ( int priority,String name, int carecard,String initAssessment)
	{
		this.name = name;
		this.carecard=carecard;
		this.priority=priority;
		this.initAssessment=initAssessment;
	}
	
	public int compareTo(Patient a){
		return (this.priority-a.priority);
	}
	
	public boolean equals(Patient a){
		return (this.carecard==a.carecard);
	}
}