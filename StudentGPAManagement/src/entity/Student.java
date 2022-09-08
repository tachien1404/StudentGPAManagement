package entity;

import java.io.Serializable;
import java.util.Scanner;


public class Student extends Person implements Serializable {
private static int AUTO_ID = -1;
private int maSv;
private String lop;

public Student() {
	if (AUTO_ID == -1) {
		AUTO_ID = 10000;
		this.maSv = AUTO_ID;
		return;
	}
	this.maSv = ++AUTO_ID;
}



public Student(int maSv,String hoTen,String diaChi,String sdt, String lop) {
	this.maSv = maSv;
	super.hoTen = hoTen;
	super.diaChi = diaChi;
	super.sdt = sdt;
	this.lop = lop;
}



public int getMaSv() {
	return maSv;
}


public String getLop() {
	return lop;
}

public void setLop(String lop) {
	this.lop = lop;
}


@Override
public void inputInfo() {
	super.inputInfo();
	System.out.println("Nhập lớp của sinh viên:");
	this.lop = new Scanner(System.in).nextLine();
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append(this.maSv);
	builder.append("-");
	builder.append(this.hoTen);
	builder.append("-");
	builder.append(this.diaChi);
	builder.append("-");
	builder.append(this.sdt);
	builder.append("-");
	builder.append(this.lop);

	return builder.toString();

}
}
