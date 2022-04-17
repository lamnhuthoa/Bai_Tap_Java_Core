
public class BaiTap3_HienThongTin {
	public static void main(String[] args) {
		String versionElements = System.getProperty("java.version");
		String runtimeVersion = System.getProperty("java.runtime.version");
		String javaHome = System.getProperty("java.home");
		String javaVendor = System.getProperty("java.vendor");
		String javaVendorUrl = System.getProperty("java.vendor.url");
		String javaClassPath = System.getProperty("java.class.path");
		
		System.out.println("Java Version: " + versionElements);
		System.out.println("Java Runtime Version: " + runtimeVersion);
		System.out.println("Java Home: " + javaHome);
		System.out.println("Java Vendor: " + javaVendor);
		System.out.println("Java Vendor URL: " + javaVendorUrl);
		System.out.println("Java Class Path: " + javaClassPath);
	}
}
