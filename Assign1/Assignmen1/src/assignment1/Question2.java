package assignment1;
class Student{
	int roll;
	String name;
	Long phoneNumber;
	
	public void display() {
		System.out.println("Name:"+name+" Roll: "+ roll +" Phone: "+phoneNumber);
	}
}

public class Question2 {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.roll=10;
		obj.name="Sahil";
		obj.phoneNumber=1234567890l;
		obj.display();
	}

}
