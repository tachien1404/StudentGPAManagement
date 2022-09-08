package entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BangDiem {
	private Student student;
	private MonHoc[] monHoc;
	private double[] diem;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public MonHoc[] getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(MonHoc[] monHoc) {
		this.monHoc = monHoc;
	}

	public double[] getDiem() {
		return diem;
	}

	public void setDiem(double[] diem) {
		this.diem = diem;
	}



}
