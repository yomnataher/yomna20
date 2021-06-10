public class SearchPlayground {
private String Location;
private String Playground_Name;
Playground ground;
public SearchPlayground() {
	
};
public SearchPlayground(String Playground_Name,String Location) {
	this.Playground_Name=getPlayground_Name();
	this.Location="";
}
public String getLocation() {
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
public void Display() {
	for(int i=0;i<ground.Playground_list.size();i++) {
		int j=1;
		if(Playground_Name==ground.getPlayground_Name()&& Location==ground.getLocation()) {
			System.out.println(j+"Playground Name: "+ground.getPlayground_Name()+"\nLocation: "+ground.getLocation()+"\nBooking Hours: "+ground.getB_Hours());
			System.out.println("\n*******************************8");
			j++;	}
	}
}


}

