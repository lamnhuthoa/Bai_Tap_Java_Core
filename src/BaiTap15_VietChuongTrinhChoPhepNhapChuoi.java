import java.util.Scanner;

public class BaiTap15_VietChuongTrinhChoPhepNhapChuoi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào một chuỗi bất kỳ: ");
		String user_input = scanner.nextLine();
		
		inRaDoDaiChuoi(user_input);
		inKyTuTaiViTri(user_input);
		isIncludeABCDEF(user_input);
	}
	
	//a. In ra độ dài chuỗi
	public static void inRaDoDaiChuoi(String userInput) {
		System.out.println("Độ dài chuỗi : " + userInput.length());
	}
	
	//b. In ra ký tự tại một vị trí nhất định
	public static void inKyTuTaiViTri(String userInput) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào index muốn lấy ký tự trong chuỗi: ");
		int index = scanner.nextInt();
		System.out.println("Ký tự tại vị trí " + index + " là: " + userInput.charAt(index));
	}
	
	//c. Kiểm tra xem chuỗi vừa nhập có chuỗi phụ abcdef không?
	public static void isIncludeABCDEF(String userInput) {
		if(userInput.matches("[a-zA-Z]+")) {
			System.out.println("Chuỗi trên có chứa các ký tự là alphabet");
		} else {
			System.out.println("Chuỗi trên không chứa các ký tự là alphabet");
		}
	}
}
