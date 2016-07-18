public class Triage 
{

     private PriorityQueue q ;


	public Triage ()
	{
		this.q = new HeapPriorityQueue();
	}
	
	public void addPatient(Patient a){
		this.q.insert(a);
	}
	
	public Patient nextPatient(){
		return (Patient)this.q.removeHigh();
	}
	public int numPatientsWaiting(){
		return this.q.size();
	}
}