
package demoThuaKe;

// Lớp HinhChuNhat kế thừa từ lớp HinhHoc
// Cung cấp triển khai cụ thể cho phương thức getDienTich() và mở rộng lớp cơ sở với các thuộc tính mới
public class HinhChuNhat extends HinhHoc {
    // Thuộc tính đặc trưng cho hình chữ nhật
    private double chieuDai;
    private double chieuRong;
    
    // Getter cho thuộc tính chieuDai
    public double getChieuDai() {
        return chieuDai;
    }
    
    // Setter cho thuộc tính chieuDai
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    
    // Getter cho thuộc tính chieuRong
    public double getChieuRong() {
        return chieuRong;
    }
    
    // Setter cho thuộc tính chieuRong
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    // Constructor với tên hình, chiều dài và chiều rộng, gọi constructor của lớp cơ sở
    public HinhChuNhat(String tenHinh, double d, double r) {
        super(tenHinh);
        this.chieuDai = d;
        this.chieuRong = r;
    }
    
    // Triển khai phương thức trừu tượng từ lớp cơ sở để tính diện tích hình chữ nhật
    @Override
    public double getDienTich() {
        return getChieuDai() * getChieuRong();
    }
}
