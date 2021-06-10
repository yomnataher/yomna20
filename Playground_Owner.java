import java.util.ArrayList;
import java.util.Scanner;

public class Playground_Owner {

	private String Name;
	private String Email;
	private String Password;
	private int OwnerCounter ;
	private String Phone;
	static ArrayList<Playground_Owner> Owner_list;
	Booking B1;
	private ArrayList<Booking> Requests_List;
	public Playground_Owner() {
		
	};
	public Playground_Owner(String Name, String Email, String Password,String Phone,ArrayList<Playground_Owner> Owner_list) {
		this.Name=Name;
		this.Email=Email;
		this.Password=Password;
		this.Phone=Phone;
		this.Owner_list= new ArrayList<>();
		
		}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getPlayerCounter() {
		return OwnerCounter;
	}

	public void setPlayerCounter(int playerCounter) {
		OwnerCounter = playerCounter;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public ArrayList<Playground_Owner> getOwner_list() {
		return Owner_list;
	}

	public void setOwner_list(ArrayList<Player> Owner_list) {
		Owner_list = Owner_list;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
///////////////////////////////
	
	public Booking getB1() {
		return B1;
	}
	public void setB1(Booking b1) {
		B1 = b1;
	}
	public ArrayList<Booking> getRequests_List() {
		return Requests_List;
	}
	public void setRequests_List(ArrayList<Booking> requests_List) {
		Requests_List = requests_List;
	}
	public void Requsts() {
		for(int i=0;i<Requests_List.size();i++) {
			int j=1;
			System.out.println(j+"Playground Name: "+B1.ground.getPlayground_Name()+"\nLocation: "+B1.ground.getLocation()+"\nBooking Hours: "+B1.getB_Hours());
			System.out.println("\n*******************************");
			j++;	}
	
	
	}

}
