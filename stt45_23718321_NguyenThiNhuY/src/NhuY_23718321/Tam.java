package NhuY_23718321;

public class Tam {
	//khai  thuov tinh
	private String ten;
	private double x;
	private double y;
	//Dong goi
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) throws Exception {
		if (ten!=null) {
			this.ten = ten;
		} else {
			throw new Exception("Loi");
		}
		this.ten = ten;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Tam() {}
	//contrucstor
	public Tam(String ten, double x, double y) throws Exception {
		if (ten!=null) {
			this.ten = ten;
		} else {
			throw new Exception("Loi");
		}
		this.x = x;
		this.y = y;
	}
	//mau in
	@Override
	public String toString() {
		String s="";
		s=s+s.format("%2s(%2s,%2s)",getTen(),getX(),getY());
		return s;
	}

}
