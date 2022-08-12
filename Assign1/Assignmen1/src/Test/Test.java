package Test;
import com.sahil.*;

import java.util.Scanner;

import com.package2.*;

public class Test extends SahilAccessModifiers {
	public static void main(String[] args) {
		C2 obj1 = new C2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the name");
		String name=scanner.nextLine();
		System.out.println("Please Enter the age");
		int age=obj1.y=scanner.nextInt();
		System.out.println("Please Enter the marks");
		int marks =obj1.x=scanner.nextInt();
		obj1.checkAge(age);		
		obj1.displayName(name);
		obj1.checkMarks(marks);

		
		
		}

}
