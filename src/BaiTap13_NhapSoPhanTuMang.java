import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BaiTap13_NhapSoPhanTuMang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào số phần tử mảng: ");
		int number = scanner.nextInt();
		int[] numberArray = new int[number];
		for(int i = 0; i < numberArray.length; i++) {
			System.out.print("Nhập giá trị phần tử số " + (i + 1) + ": ");
			numberArray[i] = scanner.nextInt();
		}

		System.out.println("-----------------------------------------");
	    tinhTrungBinh(numberArray);
	    timMaxVaMin(numberArray);
	    timMaxNegativeVaMinNegative(numberArray);
	    timMaxPositiveVaMinPositive(numberArray);
	    timPhanTuChanLe(numberArray);
		themPhanTuTheoIndex(numberArray);
		xoaPhanTuTheoIndex(numberArray);
	}
	
	//a. Tính giá trị trung bình
	public static void tinhTrungBinh (int[] intArray) {
		int tong = 0;
		int trungBinhCong = 0;
		for(int i = 0; i < intArray.length; i++) {
			tong += intArray[i];
			trungBinhCong = tong / intArray.length;
		}
		System.out.println("Giá trị trung bình: " + trungBinhCong);
	}
	
	//b. Tìm phần tử nhỏ nhất lớn nhất
	public static void timMaxVaMin (int[] intArray) {
		int max = intArray[0];
		int min = intArray[0];
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] > max) {
				max = intArray[i];
			}
			if(intArray[i] < min) {
				min = intArray[i];
			}
		}
		System.out.println("Giá trị lớn nhất và giá trị nhỏ nhất của mảng lần lượt là: " + max + ", " + min);
	}
	
	//c. Tìm phần tử âm nhỏ nhất lớn nhất
	public static void timMaxNegativeVaMinNegative (int[] intArray) {
		int maxNegative = intArray[0];
		int minNegative = intArray[0];
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] < 0) {
				if(intArray[i] < maxNegative) {
					maxNegative = intArray[i];
				}
				if(intArray[i] > maxNegative) {
					minNegative = intArray[i];
				}
			}
		}
		System.out.println("Giá trị âm lớn nhất và nhỏ nhất của mảng lần lượt là: " + maxNegative + ", " + minNegative);
	}
		
	//d. Tìm phần tử dương nhỏ nhất lớn nhất
	public static void timMaxPositiveVaMinPositive (int[] intArray) {
		int maxPositive = intArray[0];
		int minPositive = -1;
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] >= 0) {
				if(intArray[i] > maxPositive) {
					maxPositive = intArray[i];
				}

				if((minPositive == -1 || minPositive > intArray[i]) && intArray[i] >= 0) {
					minPositive = intArray[i];
				}
			}
		}
		System.out.println("Giá trị dương lớn nhất và nhỏ nhất của mảng lần lượt là: " + maxPositive + ", " + minPositive);
	}
	
	//e. Tìm phần tử chẵn lẻ
	public static void timPhanTuChanLe (int[] intArray) {
		List<Integer> evenNumber = new ArrayList<Integer>(intArray.length);
		List<Integer> oddNumber = new ArrayList<Integer>(intArray.length);
		
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] % 2 == 0) {
				evenNumber.add(intArray[i]);
			} else {
				oddNumber.add(intArray[i]);
			}
		}
		System.out.println("Giá trị chẵn và lẻ của mảng lần lượt là: " + evenNumber + ", " + oddNumber);
	}
	
	//f. Thêm một phần tử theo index
	public static void themPhanTuTheoIndex (int[] intArray) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào vị trí index muốn thêm phần tử: ");
		int index = scanner.nextInt();
		System.out.print("Nhập giá trị của phần tử muốn thêm vào mảng: ");
		int newNumber = scanner.nextInt();
		List<Integer> newArray = new ArrayList<Integer>();
		for(int number : intArray) {
			newArray.add(number);
		}
		newArray.add(index, newNumber);
		System.out.println("Mảng sau khi thêm phần tử tại index số " + index + " với giá trị " + newNumber + " là: " + newArray);
	}
	
	//f. Thêm một phần tử theo index
	public static void xoaPhanTuTheoIndex (int[] intArray) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào vị trí index của phần tử muốn xóa: ");
		int index = scanner.nextInt();
		List<Integer> newArray = new ArrayList<Integer>();
		for(int number : intArray) {
			newArray.add(number);
		}
		newArray.remove(index);
		System.out.println("Mảng sau khi xóa phần tử tại index số " + index + " là: " + newArray);
	}
}
