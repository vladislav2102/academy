package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {

		User user = new User("Uladzislau", "Havarushka", 21, 02, 1995,
				"vlad2102", "vlad2102", "vlad2102@mail.ru" );

		user.printUserInfo();

		Class<User> userClass = User.class;

		try{
			System.out.println(userClass.getMethod("printUserInfo"));

			System.out.println(userClass.getDeclaredMethod("printUserInfo"));

			System.out.println(Arrays.toString(userClass.getMethods()));

			System.out.println(Arrays.toString(userClass.getDeclaredMethods()));

			System.out.println(userClass.getDeclaredField("login"));

			System.out.println(Arrays.toString(userClass.getFields()));

			System.out.println(Arrays.toString(userClass.getDeclaredFields()));

			Field userFirstName = userClass.getSuperclass().getDeclaredField("firstName");
			userFirstName.setAccessible(true);
			userFirstName.set(user, "Vladislav");

			Field userLastName = userClass.getSuperclass().getDeclaredField("lastName");
			userLastName.setAccessible(true);
			userLastName.set(user, "Govorushko");

			Field userDateOfBirth = userClass.getSuperclass().getDeclaredField("dateOfBirth");
			userDateOfBirth.setAccessible(true);
			userDateOfBirth.set(user, LocalDate.of(2023, 02, 21));

			Field userAge = userClass.getSuperclass().getDeclaredField("age");
			userAge.setAccessible(true);
			userAge.set(user, 0);

			Field userLogin = userClass.getDeclaredField("login");
			userLogin.setAccessible(true);
			userLogin.set(user, "vlad210295");

			Field userEmail = userClass.getDeclaredField("email");
			userEmail.setAccessible(true);
			userEmail.set(user, "vlad210295@mail.ru");

			Method printInfo = userClass.getDeclaredMethod("printUserInfo");
			printInfo.invoke(user);

		} catch (NoSuchMethodException | NoSuchFieldException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

	}
}
