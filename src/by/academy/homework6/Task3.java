package by.academy.homework6;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) throws IIOException {

		ArrayList<User> user = new ArrayList<User>();

		user.add(new User("Walter", "Johnson", 18));
		user.add(new User("Blaze", "Chapman", 29));
		user.add(new User("Brian", "Cannon", 21));
		user.add(new User("Daniel", "McKinney", 19));
		user.add(new User("Joseph", "Harrell", 23));
		user.add(new User("Robert", "Hodge", 41));
		user.add(new User("Michael", "Sims", 32));
		user.add(new User("Adam", "Walters", 35));
		user.add(new User("Horace", "Baldwin", 26));
		user.add(new User("Sherman", "Pope", 37));

		File dir = new File("src/by/academy/homework6/users");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		for (User u : user) {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/by/academy/homework6/users/" + u.getFirstName() + "_" + u.getLastName() + ".txt"))) {
				oos.writeObject(u);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

		File[] arrayFile = dir.listFiles();

		for (File f : arrayFile) {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
				User u = (User) ois.readObject();
				System.out.println(u);
			} catch (IOException | ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
