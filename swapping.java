import java.util.*;
public class swapping {

	public static void main(String[] args) {
		int a[] = new int[7];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array elements: ");
		for(int i = 0;i<7;i++) {
		a[i] = scanner.nextInt();
		}
		for(int i = 0;i<7;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<7-1;i++) {
			int temp = a[i];
			for(int j = i+1;j<7;j++) {
				if(a[j]<temp) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println();
	for(int i = 0;i<7;i++) {
			System.out.print(a[i]+" ");
		}
		
}
	

}
