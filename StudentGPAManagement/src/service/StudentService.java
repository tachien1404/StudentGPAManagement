package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import entity.MonHoc;
import entity.Student;
import file.StudentFile;

public class StudentService implements IQuanLy {
	public static StudentFile file = new StudentFile();
	static Student[] arrStudent = new Student[100];

	@Override
	public void addNew() {
		System.out.println("Nhập số lượng sinh viên muốn thêm");
		int slSv = new Scanner(System.in).nextInt();
		Student[] arrSv = new Student[slSv];
		for (int i = 0; i < slSv; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1));
			Student student = new Student();
			student.inputInfo();
			arrSv[i] = student;
		}
		try {
			file.writeStudentFile("src/File/DataStudentFile", arrSv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void display() {
		try {
			file.readStudentFile("src/File/DataStudentFile");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
