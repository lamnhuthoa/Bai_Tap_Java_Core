import java.util.Scanner;

public class BaiTap17_GameDoanSoNgauNhien {
	public static void main(String[] args) {
		// Scanner Class
        Scanner sc = new Scanner(System.in);
        int soNgauNhien = 1 + (int)(100* Math.random());
        int soLanChoiLai = 5;
        int i, soUserDoan;
 
        System.out.println("Một con số ngẫu nhiên đã được chọn từ 1 - 100, bạn có 5 lượt trả lời");
        for (i = 0; i < soLanChoiLai; i++) {
            System.out.print("Hãy đoán một số: ");
            soUserDoan = sc.nextInt();
            if (soNgauNhien == soUserDoan) {
                System.out.println("Bạn đã đoán đúng");
                break;
            }
            else if (soNgauNhien > soUserDoan && i != soLanChoiLai - 1) {
                System.out.println(
                    "Số chính xác lớn hơn số bạn chọn!");
            }
            else if (soNgauNhien < soUserDoan && i != soLanChoiLai - 1) {
                System.out.println(
                    "Số chính xác nhỏ hơn số bạn chọn!");
            }
        }
 
        if (i == soLanChoiLai) {
            System.out.println("Bạn đã hết lượt chơi");
            System.out.println("Số chính xác là: " + soNgauNhien);
        }
	}
}
