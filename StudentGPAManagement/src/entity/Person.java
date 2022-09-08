package entity;

import java.util.Scanner;

public class Person {
 protected String hoTen;
 protected String diaChi;
 protected String sdt;
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public String getDiaChi() {
	return diaChi;
}
public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}
public String getSdt() {
	return sdt;
}
public void setSdt(String sdt) {
	this.sdt = sdt;
}
 
public void inputInfo() {
	System.out.println("Nhập tên sinh viên:");
	this.hoTen = new Scanner(System.in).nextLine();
	System.out.println("Nhập địa chỉ của sinh viên:");
	this.diaChi = new Scanner(System.in).nextLine();
	System.out.println("Nhập số điện thoại của sinh vien");
	this.sdt = new Scanner(System.in).nextLine();
}
}
