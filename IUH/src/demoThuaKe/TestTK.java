package demoThuaKe;

public class TestTK {
	public static void main(String[] args) {
		//Khởi tạo đối tượng h1 có kiểu dữ liệu class HinhHoc
		HinhHoc h1 = new HinhVuong("Hinh vuong 1", 20.5);
		System.out.println("Dien tich hinh vuong: "+h1.getDienTich());
		//Khởi tạo đối tượng h2 có kiểu dữ liệu class HinhHoc
		HinhHoc h2 = new HinhChuNhat("Hinh Chu Nhat 1", 45, 30);
		//Tính đa hình
		//h1 h2 có cùng kiểu dữ liệu HinhHoc nhưng thể hiện 2 hình thái khác nhau HinhVuong, HinhChuNhat
		System.out.println("Dien tich HCN: "+h2.getDienTich());
	}
}
