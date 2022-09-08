package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import entity.Student;

public class StudentFile {

	
	public static void writeStudentFile(String fileName,Student[] arrStudent) {
		try {
			FileWriter fw = new FileWriter(fileName,true);
			BufferedWriter bw = new BufferedWriter(fw);
			for(Student student: arrStudent) {
				bw.write(student.toString());
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void readStudentFile(String fileName) throws Exception{

		 FileReader fr = new FileReader(fileName);
	        BufferedReader br = new BufferedReader(fr);
	        String line = "";
	        while (true){
	            if(line == null){
	                break;
	            }
	            line = br.readLine();
	            System.out.println(line);
		
	}
}
}
