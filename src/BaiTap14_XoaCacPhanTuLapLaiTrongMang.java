import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class BaiTap14_XoaCacPhanTuLapLaiTrongMang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số phần tử mảng: ");
		
		int number = scanner.nextInt();
		Integer numberArray[] = new Integer[number];
		
		for(int i = 0; i < numberArray.length; i++) {
			System.out.print("Nhập giá trị phần tử số " + (i + 1) + ": ");
			numberArray[i] = scanner.nextInt();
		}

		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(Arrays.asList(numberArray));
		numberArray = hashSet.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numberArray));
	}
}
