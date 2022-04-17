import java.util.Scanner;

public class BaiTap2_BinaryToDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
        System.out.print("Nhập số nhị phân: ");
        int soNhiPhan = scanner.nextInt();
        int soThapPhan = 0;
        int soMu = 0;
        
        while(true) {
        	if(soNhiPhan == 0) {
        		break;
        	} else {
        		int temp = soNhiPhan % 10;
        		soThapPhan += temp*Math.pow(2, soMu);
        		soNhiPhan = soNhiPhan/10;
        		soMu++;
        	}
        }
        System.out.print("Số thập phân là: " + soThapPhan);
	}
}
