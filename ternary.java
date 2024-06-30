import java.util.Scanner;
public class ternary {
public static void main(String[]args) {
	//variable name = (condition)? valueIfTrue:valueIfFalse;
	System.out.println("Enter the character: ");
	Scanner scanner = new Scanner(System.in);
	char character = scanner.next().charAt(0);
	switch(character) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("Vowels");
		break;
		default:
		System.out.println("consonent");
}
}
}
