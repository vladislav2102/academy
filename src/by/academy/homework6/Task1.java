package by.academy.homework6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) throws IOException {

		File dir = new File("src/by/academy/homework6/homework6file");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		File file1 = new File(dir, "Task1.txt");

		if (!file1.exists()) {
			file1.createNewFile();
		}

		try (FileWriter fos = new FileWriter(file1); Scanner scanner = new Scanner(System.in)) {
			System.out.println("Введите текст");
			while (scanner.hasNextLine()) {
				String s = scanner.nextLine();
				if(s.equals("stop")) {
					System.out.println("Запись завершена");
					return;
				} else {
					fos.write(s + "\n");
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
