
public class BaiTap1_InQuocKyMy {
	public static void main(String[] args) {
		/* Bài tập: Viết chương trình in quốc kỳ Mỹ */
		
		String hang1 = "* * * * * * ==================================\n * * * * *  ==================================";
		String hang2 = "==============================================";
		
		for(int i = 0; i < 4; i++) {
			System.out.println(hang1);
		}
		System.out.println("* * * * * * ==================================");
		for(int i = 0; i < 6; i++) {
			System.out.println(hang2);
		}
	}
}
