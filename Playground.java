import java.util.ArrayList;
import java.util.Scanner;
public class Playground {
	private String Location;
	private String Playground_Name;
    private String Date;
    private String B_Hours;
    private int Prices;
    private int PlaygrpundCounter;
    ArrayList<Playground> Playground_list;
    public Playground(String Location,String Playground_Name,String Date,String B_Hours,int Prices) {
    	this.Location=Location;
    	this.Playground_Name=Playground_Name;
    	this.Date=Date;
    	this.B_Hours=B_Hours;
    	this.Prices=Prices;
    }
	public  String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getPlayground_Name() {
		return Playground_Name;
	}
	public void setPlayground_Name(String playground_Name) {
		Playground_Name = playground_Name;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getB_Hours() {
		return B_Hours;
	}
	public void setB_Hours(String b_Hours) {
		B_Hours = b_Hours;
	}
	public int getPrices() {
		return Prices;
	}
	public void setPrices(int prices) {
		Prices = prices;
	}
	public ArrayList<Playground> getPlayground_list() {
		return Playground_list;
	}
	public void setPlayground_list(ArrayList<Playground> playground_list) {
		Playground_list = playground_list;
	}
	public int getPlaygrpundCounter() {
		return PlaygrpundCounter;
	}
	public void setPlaygrpundCounter(int playgrpundCounter) {
		PlaygrpundCounter = playgrpundCounter;
	}
		
	public void AddPlayground(Playground ground) {
		   ArrayList Playground_List = new ArrayList (); 
		   Playground_List.add(getLocation());
		   Playground_List.add(getDate());
		   Playground_List.add(getB_Hours());
		   Playground_List.add(getPlayground_Name());
		   Playground_List.add(getPrices());
	}
	public ArrayList<Playground> RemovePlayground(Playground ground) {
	 Playground_list.remove(ground);
	    return (Playground_list);

	}
}
