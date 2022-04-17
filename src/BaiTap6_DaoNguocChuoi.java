import java.util.Scanner;

public class BaiTap6_DaoNguocChuoi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một chuỗi: ");
		String input = scanner.next();
		
		StringBuilder newString = new StringBuilder(input);
		
		System.out.println(newString.reverse().toString());
	}
}
