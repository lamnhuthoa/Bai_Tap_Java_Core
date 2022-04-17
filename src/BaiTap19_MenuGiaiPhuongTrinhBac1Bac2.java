import java.util.Scanner;

public class BaiTap19_MenuGiaiPhuongTrinhBac1Bac2 {
	public static void main(String[] args) {
		System.out.println("-----------------------Menu-----------------------");
		System.out.println("Giải phương trình bậc nhất (nhấn phím 1)");
		System.out.println("Giải phương trình bậc hai (nhấn phím 2)");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hãy chọn một trong hai hệ phương trình trên để bắt đầu tính toán: ");
		int selection = scanner.nextInt();
		
		if (selection == 1) {
			System.out.println("Phương trình bậc nhất có dạng: ax + b = 0");
			System.out.print("Nhập vào giá trị a: ");
			int a = scanner.nextInt();
			System.out.print("Nhập vào giá trị b: ");
			int b = scanner.nextInt();
			
			double x = -b*(1.0)/a;
			System.out.println("x = " + x);
		} else if(selection == 2) {
			System.out.println("Phương trình bậc nhất có dạng: ax^2 + bx + c = 0");
			System.out.print("Nhập vào giá trị a: ");
			int a = scanner.nextInt();
			System.out.print("Nhập vào giá trị b: ");
			int b = scanner.nextInt();
			System.out.print("Nhập vào giá trị c: ");
			int c = scanner.nextInt();
			
			double delta = (double) Math.sqrt(b*b - 4*a*c);
			if (delta < 0) {
				System.out.println("Vì " + delta + " < 0 nên phương trình vô nghiệm");
			} else if(delta > 0) {
				double x1 = (-b + delta)*(1.0)/(2*a);
				double x2 = (-b - delta)*(1.0)/(2*a);
				System.out.println("Phương trình có hai nghiệm phân biệt: (" + x1 + "," + x2 + ")");
			} else if (delta == 0) {
				double x = -b*(1.0)/(2*a);
				System.out.println("Phương trình có nghiệm kép: " + x);
			}
		}
	}
}
