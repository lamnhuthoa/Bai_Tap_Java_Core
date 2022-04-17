import java.util.Scanner;

public class BaiTap0_TinhTienKaraoke {
	public static void main(String[] args) {
		/* 
		 * Mỗi giờ hát trong 3 giờ đầu tiên có giá: 30.000 VNĐ/giờ
		 * Mỗi giờ hát tiếp theo có đơn giá bằng 30% đơn giá của 3 giờ đầu tiên
		 * Giá mỗi chai nước là 10.000 VNĐ
		 * Thời gian mở cửa: 9:00 - 24:00 (Không qua đêm)
		 * Nếu vào cửa từ lúc 9:00 - 17:00, giảm 20% trên tổng hóa đơn
		 * In ra tổng chi phí phải trả cho khách hàng 
		 */
		
		int giaHatTrong3GioDauTien = 30000;
		double giaHatSau3GioDauTien = 0.3 * 30000;
		int giaChaiNuoc = 10000;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vui lòng nhập giờ bắt đầu hát:");
		int gioBatDauHat = scanner.nextInt();
		
		System.out.println("Vui lòng nhập giờ kết thúc hát:");
		int gioKetThucHat = scanner.nextInt();
		
		double tongChiPhi = 0;
		double soTienDuocGiam = 0;
		int soGioKhachHat = gioKetThucHat - gioBatDauHat;
		
		if (gioBatDauHat >= 9) {
			if(gioKetThucHat <= 17) {
				if (soGioKhachHat <= 3) {
					tongChiPhi = soGioKhachHat * giaHatTrong3GioDauTien;
					soTienDuocGiam = 0.2 * tongChiPhi;
					tongChiPhi = tongChiPhi - soTienDuocGiam;
				} else if (soGioKhachHat - 3 != 0) {
					tongChiPhi = (soGioKhachHat - 3) * giaHatSau3GioDauTien + (3 * giaHatTrong3GioDauTien);
					soTienDuocGiam = 0.2 * tongChiPhi;
					tongChiPhi = tongChiPhi - soTienDuocGiam;
				}
			} else if (gioKetThucHat <= 24) {
				if (soGioKhachHat <= 3) {
					tongChiPhi = soGioKhachHat * giaHatTrong3GioDauTien;
				} else if (soGioKhachHat - 3 != 0) {
					tongChiPhi = (soGioKhachHat - 3) * giaHatSau3GioDauTien + (3 * giaHatTrong3GioDauTien);
				}
			}
		}
		
		System.out.println("Tong chi phi khach phai tra la: " + Math.round(tongChiPhi));
	}
}
