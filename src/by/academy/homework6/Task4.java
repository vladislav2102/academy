package by.academy.homework6;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) throws IOException {

		File dir = new File("src/by/academy/homework6/homework6file");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		File file = new File(dir, "Task2.txt");

		if (!file.exists()) {
			file.createNewFile();
		}

		File result = new File(dir, "result_Task4.txt");

		if(!file.exists()) {
			file.createNewFile();
		}

		ArrayList<File> arrayFile = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			arrayFile.add(i, new File(dir, "Task4_" + (i + 1) + ".txt"));

			if (!arrayFile.get(i).exists()) {
				arrayFile.get(i).createNewFile();
			}
		}

		String s = "";

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String sTemp;

			while((sTemp = br.readLine()) != null) {
				s = s + sTemp + "\n";
			}
			System.out.println(s.length());
			System.out.println(s);
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try {
			Random random = new Random();
			for(int i = 0; i < arrayFile.size(); i++) {
				FileWriter fw = new FileWriter(arrayFile.get(i));
				fw.write(s.substring(0, random.nextInt(0, 575)));
				fw.close();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try (FileWriter fw = new FileWriter(result)) {
			for(File f: arrayFile) {
				FileReader fr = new FileReader(f);
				fw.write(f.getName() + " : " + f.length() + "\n");
				fr.close();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
