package Main;

import java.io.IOException;
import java.util.Scanner;

import entity.BangDiem;
import entity.MonHoc;
import entity.Student;
import file.StudentFile;
import file.SubjectFile;
import service.StudentService;
import service.SubjectService;

public class Main {
	private BangDiem[] arrBangDiem = new BangDiem[100];
	private static SubjectService subjectService = new SubjectService();
	private static StudentService studentService = new StudentService();
	private static SubjectFile subjectFile = new SubjectFile();
	private static StudentFile studentFile = new StudentFile();
	private static BangDiem bangdiem = new BangDiem();
	public static void main(String[] args) {
		showMenu();
	}

	private static void showMenu() {
		while (true) {
			int functionChoice = functionChoice();
			switch (functionChoice) {
			case 1:
				studentService.addNew();;
				break;
			case 2:
				studentService.display();	
				break;
			case 3:
				subjectService.addNew();
				break;
			case 4:
				subjectService.display();
				break;
//			case 5:
//			
//				break;
//			case 6:
//				sxTheoTen();
//				break;
//			case 7:
//				sxTheoSL();
//				break;
//			case 8:
//				tinhTienCong();
//				break;
//                case 9:
//                    System.out.println("Xin cảm ơn đã sử dụng phần mềm của chúng tôi!");
//                    return;
			}
		}
	}
	
	private static int functionChoice() {
		System.out.println(
				"\n\n_________________Phần mềm quản lý điểm sinh viên_______________\n\n");
		System.out.println("1. Nhập danh sách sinh viên mới.");
		System.out.println("2. In ra danh sách sinh viên trong hệ thống.");
		System.out.println("3. Nhập danh sách môn học mới.");
		System.out.println("4. In ra danh sách môn học trong hệ thống.");
		System.out.println("5. Lập bảng điểm cho sinh viên.");
		System.out.println("6. Xem bảng điểm của sinh viên");
		System.out.println("7. Sắp xếp bảng điểm theo họ tên sinh viên.");
		System.out.println("8. Sắp xếp bảng điểm theo tên Môn học");
		System.out.println("9. Tính điểm tổng kết trung bình cho sinh viên");
		System.out.println("10. Thoát chương trình");
		System.out.println("--------------------------------------");
		System.out.print("Xin mời nhập lựa chọn của bạn: ");
		int functionChoice = -1;
		do {
			functionChoice = new Scanner(System.in).nextInt();
			if (functionChoice >= 1 && functionChoice <= 10) {
				break;
			}
			System.out.print("Chức năng được chọn không hợp lệ, vui lòng chọn lại: ");
		} while (functionChoice > 10 || functionChoice < 1);
		return functionChoice;
	}
	
	
}
