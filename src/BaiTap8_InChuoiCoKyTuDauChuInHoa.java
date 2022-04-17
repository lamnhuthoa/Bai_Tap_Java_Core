import java.util.Scanner;

public class BaiTap8_InChuoiCoKyTuDauChuInHoa {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String message;
	    System.out.println("Nhập vào chuỗi: ");
	    message = scanner.nextLine();
	    char[] charArray = message.toCharArray();
	    boolean foundSpace = true;
	    for(int i = 0; i < charArray.length; i++) {
	      if(Character.isLetter(charArray[i])) {
	        if(foundSpace) {
	          charArray[i] = Character.toUpperCase(charArray[i]);
	          foundSpace = false;
	        }
	      }
	      else {
	        foundSpace = true;
	      }
	    }
	    message = String.valueOf(charArray);
	    System.out.println("Chuỗi sau khi đổi: \n" + message);
	}
}
