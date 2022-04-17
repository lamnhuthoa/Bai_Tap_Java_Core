import java.util.Scanner;

public class BaiTap16_KiemTraNamNhuan {
	public static void main(String[] args) {
		int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào năm cần kiểm tra:");
        year = scan.nextInt();
        boolean isLeap = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else {
            	isLeap = true;
            }
        }
        else {
            isLeap = false;
        }
        
        if(isLeap==true) {
        	System.out.println(year + " là năm nhuận.");
        } else {
            System.out.println(year + " không phải là năm nhuận.");
        }
    }
}
