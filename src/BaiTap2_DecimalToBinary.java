import java.util.Scanner;

public class BaiTap2_DecimalToBinary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số hệ thập phân: ");
		int soThapPhan = scanner.nextInt();
		
		int[] mangSoBin = new int[20];
		int i = 0;
		while (soThapPhan > 0) {
			mangSoBin[i] = soThapPhan % 2;
			soThapPhan /= 2;
			i++;
		}
		
		//In mảng binary theo thứ tự ngược
		System.out.print("Hệ nhị phân: ");
		for(int j = i - 1; j >= 0; j--) {
			System.out.print(mangSoBin[j]);
		}
		System.out.print("\n");
	}
}
