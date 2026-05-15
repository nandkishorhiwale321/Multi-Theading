package Aggragation_and_Composition;

public class Aggragation_01 {
	public static void main(String [] args) {
		
		
		Teacher t = new Teacher("Mahesh");
		
		School sc = new School("USS", t);
		
		sc.show();
	}

}
class Teacher {
	
	String name;
	
	Teacher(String name){
		this.name=name;
	}
	
	public void run() {
		System.out.println("Teacher name is :"+name);
	}
}
class School {
	
	String SchoolNAme;
	
	Teacher teach;
	
	
	School(String SchoolNAme ,Teacher teach){
		this.SchoolNAme=SchoolNAme;
		this.teach=teach;
	}
	
	public void show() {
		System.out.println("School NAme is :"+SchoolNAme);
		teach.run();
	}
}
