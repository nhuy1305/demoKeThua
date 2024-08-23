package NhuY23718321;

import java.util.Scanner;

public class textHCN {
	public static void inTD() {
		for (int i = 0; i < 45; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%10s|%10s|%10s|%10s|", "chieuDai", "chieuRong", "chuVi", "dienTich");
		System.out.println();
		for (int i = 0; i < 45; i++) {
			System.out.printf("-");
		}
		System.out.println();
	}

	public static HinhChuNhat nhapMem() {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		System.out.println("Nhap chieu dai: ");
		double r = sc.nextDouble();
		System.out.println("Nhap chieu rong: ");
		HinhChuNhat h1 = new HinhChuNhat();
		h1.setChieuDai(d);
		h1.setChieuRong(r);
		return h1;
	}

	public static void main(String[] args) {
		// khoi tao doi tuong h1 HCN
		HinhChuNhat h1 = new HinhChuNhat();
		h1.setChieuDai(10);
		h1.setChieuRong(5);
		inTD();
		System.out.println(h1.toString());
		for (int i = 0; i < 45; i++) {
			System.out.printf("-");
		}
		System.out.println();
		// khoi tao do tuong co doi so
		HinhChuNhat h2 = new HinhChuNhat(70, 50);
		inTD();
		System.out.println(h2.toString());
		for (int i = 0; i < 45; i++) {
			System.out.printf("-");
		}
		System.out.println();
		nhapMem();
		inTD();

	}

}