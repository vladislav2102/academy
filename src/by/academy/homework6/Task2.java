package by.academy.homework6;

import java.io.*;

public class Task2 {

	public static void main(String[] args) throws IOException {

		File dir = new File("src/by/academy/homework6/homework6file");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		File file = new File(dir, "Task2.txt");

		if(!file.exists()) {
			file.createNewFile();
		}


		File file1 = new File(dir, "result.txt");

		if (!file1.exists()) {
			file1.createNewFile();
		}

		try(BufferedReader br = new BufferedReader(new FileReader(file));
		    FileWriter fw = new FileWriter(file1)) {
			String s;
			while((s = br.readLine()) != null) {
				fw.write(s.replaceAll(" ", ""));
			}
			System.out.println("Запись с изменениями выполнена");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
