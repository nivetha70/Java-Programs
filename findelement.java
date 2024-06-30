import java.util.Scanner;
 public class findelement {
public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size:");
	int n = scanner.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the element:");
	for(int i = 0;i<n;i++) {
		a[i] = scanner.nextInt();
	}
	System.out.print("input array:");
	for(int i = 0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("reversed number:");
	for(int i=n-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
}
 }
//	System.out.println("Enter the number to check:");
//	int check = scanner.nextInt();
//	int flag = 0;
//	for(int i = 0;i<n;i++) {
//		if(a[i] == check) {
//			flag = 1;
//		}
//	}
//	if(flag == 1) {
//		System.out.println("present");
//	}else {
//		System.out.println("not present");
//	}
