import java.util.Scanner;
public class array {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("enter the array size");
	int n = scanner.nextInt();
	int a[] = new int[n];
	System.out.println("enter the array elements");
	for(int i=0;i<n;i++) {
		a[i] = scanner.nextInt();
	}
	int x;
	System.out.println("enter the number to check");
	 x=scanner.nextInt();
	int flag = 0;
	for(int i=0;i<n;i++) {
		if(a[i] == x) {
			System.out.println("number present");
		 flag  = 1;
			break;
		}
		}
	if(flag == 0) {
		System.out.println("number not present");
	}
	}
}
	

