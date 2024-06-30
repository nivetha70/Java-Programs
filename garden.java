import java.util.*;
public class garden {
	int apple_price = 20;
	int apple_count = 5;
	void multiple() {
		System.out.print(apple_price*apple_count);		
	}
	public static void main(String[]args) {
		garden gar = new garden();
		gar.multiple();
}
}
