import java.util.Scanner;

public class BaiTap11_InRaSoTuNhienLonNhatNhoHonLog2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số tự nhiên: ");
		int number = scanner.nextInt();
		double logarithm = Math.log(number)/Math.log(2);
		System.out.println("Kết quả logarithm: " + logarithm);
		if(number < 0) {
			return;
		} else if (number >= 0) {
			int max = (int) Math.floor(logarithm);
			System.out.println("Số tự nhiên lớn nhất nhỏ hơn log2(" + number + ") là: " + max);
		}
	}
}
