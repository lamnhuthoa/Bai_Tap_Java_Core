import java.util.Scanner;

public class BaiTap12_InTamGiacVuong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số tự nhiên: ");
		int number = scanner.nextInt();
		
		for(int i = 1; i <= number; ++i ) {
			for(int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
