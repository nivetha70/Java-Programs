import java.util.*;
public class sortingg {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size : ");
	int n = scanner.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the elements : ");
	for(int i=0;i<n;i++) {
		a[i] = scanner.nextInt();
	}
	for(int i = 0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
	for(int i=0;i<n-1;i++) {
		int temp = a[i];
		for(int j=i+1;j<n;j++) {
			if(a[j]>temp) {
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				}
			}
	}
	System.out.println();
	for(int i = 0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
}	
	}