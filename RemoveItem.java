import java.util.ArrayList;
class RemoveItem{

public static void main (String args[]){

	ArrayList<String> laps = new ArrayList<String>();
	laps.add("DELL");
	laps.add("Asuz");
	laps.add("Acer");
	laps.add("Lenovo");
    System.out.println("ArrayList of before removing an item(s) is: "+laps);
	laps.remove(3);
	//here i removed 4th item from the list
	System.out.println("ArrayList of after removing an item(s) is: "+laps);

}

}


