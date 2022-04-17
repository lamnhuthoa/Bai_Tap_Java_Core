import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap20_TachMangSoChanSoLe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Nhập vào số phần tử mảng: ");
		int number = scanner.nextInt();
		Integer[] numberArray = new Integer[number];
		for(int i = 0; i < numberArray.length; i++) {
			System.out.print("Nhập giá trị phần tử số " + (i + 1) + ": ");
			numberArray[i] = scanner.nextInt();
		}
		
		List<Integer> evenNumber = new ArrayList<Integer>(numberArray.length);
		List<Integer> oddNumber = new ArrayList<Integer>(numberArray.length);
		
		for(int i = 0; i < numberArray.length; i++) {
			if(numberArray[i] % 2 == 0) {
				evenNumber.add(numberArray[i]);
			} else {
				oddNumber.add(numberArray[i]);
			}
		}
		System.out.println("Mảng chẵn và lẻ sau khi được tách ra lần lượt là: " + evenNumber + ", " + oddNumber);
	}
}
