import java.util.Scanner;

public class BaiTap7_InUocSoCuaSoTuNhien {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một số tự nhiên: ");
		int input = scanner.nextInt();
		
		System.out.println("Các ước số của " + input + " là: ");
		
		for(int i = 1; i < input; i++) {
			if(input % i == 0) {
				System.out.println(i + "\t");
			}
		}
	}
}
