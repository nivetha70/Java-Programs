import java.util.Scanner;
public class checking {
public static void main(String[]args) {
	Scanner scanner  = new Scanner(System.in);
	String color = scanner.nextLine();
	if(color.equals("red")) {
		System.out.println("Stop");
	}
	else if(color.equals("yellow")) {
		System.out.println("wait");
	}
	else if(color.equals("green")) {
		System.out.println("go");
	}
}
	
}
