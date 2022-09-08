package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import entity.MonHoc;
import file.SubjectFile;

public class SubjectService implements IQuanLy {
	private static SubjectFile file;
	private static MonHoc[] arrMonHoc = new MonHoc[100];

	@Override
	public void addNew() {
		System.out.println("Nhập số lượng môn học muốn thêm");
		int slMonHoc = new Scanner(System.in).nextInt();
		MonHoc[] arr = new MonHoc[slMonHoc];
		for (int i = 0; i < slMonHoc; i++) {
			System.out.println("Nhập thông tin cho môn học thứ " + (i + 1));
			MonHoc monHoc = new MonHoc();
			monHoc.inputInfo();
			arr[i] = monHoc;
		}
		try {
			file.writeSubjectFile("src/File/DataSubjectFile", arr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void display() {
		try {
			file.readSubjectFile("src/File/DataSubjectFile");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
