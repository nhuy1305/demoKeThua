package NhuY_23718321;

public class HinhTron {
	private double banKinh;
	private Tam t;

	public Tam getT() {
		return t;
	}

	public void setT(Tam t) throws Exception {
		if (t != null) {
			this.t = t;
		} else {
			throw new Exception("Loi");
		}

	}

	public static final double PI = 3.1416;

	// Hang thuc
	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double bk) throws Exception {
		if (bk > 0) {
			this.banKinh = bk;
		} else {
			throw new Exception("Loi");
		}
	}
	// tao ham contrucstor
	public HinhTron () {};
	public HinhTron(double banKinh, Tam t) {
	
		this.banKinh = banKinh;
		this.t = t;
	}
	//tinh dien tich hinh chu nhat va chu vi hinh chu nhat;
	public double getDienTich() {
		return getBanKinh()*getBanKinh()*PI;
	}
	public double getChuVi() {
		return getBanKinh()*2*PI;
	}
	//mau in
	@Override
	public String toString() {
		String m="";
		m=m+m.format(", %-3s, %10s, %10s", getBanKinh(), getDienTich(), getChuVi());
		return m;
	}

}
