import java.util.Arrays;
import java.util.Scanner;

public class BaiTap4_NhapVaInTongChuSo {
	public static void main(String[] args) {
		int number, balance;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập một số tự nhiên: ");
		number = scanner.nextInt();
		
		while (number <= 0) {
			System.out.print("Số nhập phải lớn hơn 0. Mời bạn nhập lại: ");
			number = scanner.nextInt();
		}
		
		while (number > 0) {
			balance = number % 10;
			sum += balance;
			number /= 10;
		}
		
		System.out.println("Tổng các chữ số là: " + sum);
	}
}
