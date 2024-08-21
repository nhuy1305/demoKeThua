package demoThuaKe;

// Lớp trừu tượng, không thể tạo đối tượng trực tiếp.
// Các lớp kế thừa phải cung cấp triển khai cho phương thức getDienTich()
public abstract class HinhHoc {

    // Đóng gói: Biến tenHinh với phạm vi protected
    protected String tenHinh;
    
    // Getter cho tenHinh.
    public String getTenHinh() {
        return tenHinh;
    }
 
    // Setter cho tenHinh.
    public void setTenhinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }
    
    // Constructor với tham số.
    public HinhHoc(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    // Phương thức trừu tượng, các lớp con phải triển khai
    
    // Constructor không tham số
    public HinhHoc() {}

    // Phương thức toString() có thể được ghi đè bởi các lớp con
    @Override
    public String toString() {
        return super.toString(); // Gọi phương thức toString() của lớp Object
    }
}
