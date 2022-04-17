import java.util.Scanner;

public class BaiTap10_InRaTongSoNguyenToTu1DenN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số tự nhiên n: ");

		int number = scanner.nextInt();	
		int total = 0;
		for(int i = 0; i <= number; i++) {
			if(laSoNguyenTo(i)) {
				total += i;
			}
		}
		System.out.println("Tổng các số nguyên tố từ 1 đến " + number + " là: " + total);
	}
	
	public static boolean laSoNguyenTo(int n) {
		
		if(n < 2) {
			return false;
		}
		
		int squareRoot = (int) Math.sqrt(n);
		for(int i = 2; i <= squareRoot; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
