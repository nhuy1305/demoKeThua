package demoThuaKe;

// Lớp HinhVuong kế thừa từ lớp HinhHoc
// Cung cấp triển khai cụ thể cho phương thức getDienTich() và mở rộng lớp cơ sở với thuộc tính mới
public class HinhVuong extends HinhHoc {
    // Thuộc tính mới đặc trưng cho hình vuông
    private double canh;
    
    // Getter cho thuộc tính canh
    public double getCanh() {
        return canh;
    }
    
    // Setter cho thuộc tính canh
    public void setCanh(double canh) {
        this.canh = canh;
    }
    
    // Constructor không tham số
    public HinhVuong() {
    }

    // Constructor với tên hình, gọi constructor của lớp cơ sở
    public HinhVuong(String tenHinh) {
        super(tenHinh);
    }
    
    // Constructor với tên hình và cạnh, gọi constructor của lớp cơ sở và thiết lập giá trị cho thuộc tính canh
    public HinhVuong(String tenHinh, double canh) {
        super(tenHinh);
        this.canh = canh;
    }

    // Triển khai phương thức trừu tượng từ lớp cơ sở để tính diện tích hình vuông
    @Override
    public double getDienTich() {
        return getCanh() * getCanh();
    }
}
