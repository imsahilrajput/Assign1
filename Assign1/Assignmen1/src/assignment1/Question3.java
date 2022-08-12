package assignment1;

import java.util.Scanner;

class Person{
	int age ;
	String name;
	String citizenship;
	public void validator(){
		if(age> 18 && citizenship.equals("Indian")) {
			System.out.println("Hello "+name+" ,you are Eligible");
		}else {
			System.out.println("Hello "+name+" ,you are not Eligible");
		}
		
	}
	
}

public class Question3 {
	public static void main(String[] args) {
		Person obj =new Person();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your name");
		obj.name = scanner.nextLine();
		System.out.println("Please Enter your age");
		obj.age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please Enter your Citizeship");
		obj.citizenship = scanner.nextLine();
		obj.validator();
		}

}
