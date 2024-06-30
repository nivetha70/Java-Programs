import java.util.*;
public class delete {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element:");
		for(int i = 0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the position:");
		int position = scanner.nextInt();
		for(int i=position;i<n-1;i++) {
			arr[i] = arr[i+1];
		}
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
