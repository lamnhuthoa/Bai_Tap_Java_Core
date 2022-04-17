import java.util.Scanner;

public class BaiTap5_TinhDoDaiDoanThangAB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập tọa độ điểm A");
		System.out.print("xA = ");
		int xA = scanner.nextInt();
		System.out.print("yA = ");
		int yA = scanner.nextInt();
		
		System.out.println("Nhập tọa độ điểm B");
		System.out.print("xB = ");
		int xB = scanner.nextInt();
		System.out.print("yB = ");
		int yB = scanner.nextInt();
		
		double doDaiAB = Math.sqrt((xB - xA)*(xB - xA) + (yB - yA)*(yB - yA));
		
		System.out.print("Độ dài đoạn thẳng AB = " + doDaiAB);
	}
}
