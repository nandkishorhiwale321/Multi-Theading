package Aggragation_and_Composition;

public class Composition_01 {
	public static void main (String [] args) {
		
		House h = new House("SHREE VILA");
		
		h.display();
		
	}

}
class Room {
	
	//public int RoomNo;
	
	public int number() {
		return 101;
	}
	
	
}
class House 
{
	String HouseNAme;
	Room room;
	public House(String HouseNAme){
		
		room= new Room();
		//room.number();
		this.HouseNAme=HouseNAme;
		
	}
	
	public void display() {
		
		System.out.println("House Name is :"+HouseNAme);
		System.out.println("Room No IS :"+room.number());
	}
}
