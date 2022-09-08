package entity;

import java.io.Serializable;
import java.util.Scanner;

public class MonHoc implements Serializable {
	public static final String DC = "Đại cương";
	public static final String CSN = "Cơ sở ngành";
	public static final String CN = "Chuyên ngành";
	private static int AUTO_ID = -1;

	private int maMon;
	private String tenMon;
	private int soDonViHocTrinh;
	private String loaiMon;

	public MonHoc() {
		if (AUTO_ID == -1) {
			AUTO_ID = 100;
			this.maMon = AUTO_ID;
			return;
		}
		this.maMon = ++AUTO_ID;
	}

	public int getMaMon() {
		return maMon;
	}

	public String getTenMon() {
		return tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}

	public int getSoDonViHocTrinh() {
		return soDonViHocTrinh;
	}

	public void setSoDonViHocTrinh(int soDonViHocTrinh) {
		this.soDonViHocTrinh = soDonViHocTrinh;
	}

	public String getLoaiMon() {
		return loaiMon;
	}

	public void setLoaiMon(String loaiMon) {
		this.loaiMon = loaiMon;
	}

	public MonHoc(int maMon, String tenMon, int soDonViHocTrinh, String loaiMon) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.soDonViHocTrinh = soDonViHocTrinh;
		this.loaiMon = loaiMon;
	}

	public void inputInfo() {
		System.out.println("Nhập tên môn:");
		this.tenMon = new Scanner(System.in).nextLine();
		System.out.println("Nhập số đơn vị học trình:");
		this.soDonViHocTrinh = new Scanner(System.in).nextInt();
		System.out.println("Nhập loại môn: ");
		System.out.println("1. Đại cương");
		System.out.println("2. Cơ sở ngành");
		System.out.println("3. Chuyên ngành");
		System.out.print("Xin mời nhập lựa chọn của bạn: ");
		int choice = -1;
		do {
			choice = new Scanner(System.in).nextInt();
			if (choice >= 1 && choice <= 3) {
				break;
			}
			System.out.print("Lựa chọn loại khách hàng không hợp lệ, vui lòng chọn lại: ");
		} while (choice > 3 || choice < 1);
		switch (choice) {
		case 1:
			this.loaiMon = MonHoc.DC;
			break;
		case 2:
			this.loaiMon = MonHoc.CSN;
			break;
		case 3:
			this.loaiMon = MonHoc.CN;
			break;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.maMon);
		builder.append("-");
		builder.append(this.tenMon);
		builder.append("-");
		builder.append(this.soDonViHocTrinh);
		builder.append("-");
		builder.append(this.loaiMon);

		return builder.toString();
	}

}
