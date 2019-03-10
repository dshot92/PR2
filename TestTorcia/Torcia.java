public class Torcia{
    
	boolean status = false;

    public void accendi(){
        this.status = true;
    }
    
	public void spegni(){
        this.status = false;
    }
    
    public String getAccesa(){
        if(this.status) return "accesa";
        else return "spenta";
    }
    
}
