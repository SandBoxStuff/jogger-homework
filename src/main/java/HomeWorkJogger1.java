import java.util.*;

public class HomeWorkJogger1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String userName = null;
		String input = null;
		int daysJogged = 0;
		int x = 1;
		int hoursJogged = 0;
		int totalHoursJogged = 0;
		int avarageHoursJogged = 0;

		System.out.println("Please, enter your name?");
		userName = scanner.nextLine();

		System.out.println("Hello, " + userName + ". Welcome!");

		System.out.println(userName + ", please tell me how many days have you logged or jogged this week?");
		daysJogged = scanner.nextInt();

		System.out.println("Thanks! How many hours you have jogged or logged each day?");

		while (x <= daysJogged) {
			System.out.println("Please, enter how many hours have you spent jogging in your " + x + " day");
			hoursJogged = scanner.nextInt();
			x++;
			totalHoursJogged += hoursJogged;
			avarageHoursJogged = totalHoursJogged / daysJogged;
		}

		System.out.println("Confratulations, " + userName + "! Your total number of hours jogging this week is "
				+ totalHoursJogged);
		System.out.println("By the way, your avarage number of hours per day is " + avarageHoursJogged);

		if (totalHoursJogged < 15) {
			System.out.println("You are an Amateur for now. Please, keep working out!");
		} else if (totalHoursJogged >= 15 && totalHoursJogged < 40) {
			System.out.println("You are an Efficient Jogger. Good Job!");
		} else {
			System.out.println("You are an Extremist Jogger! Amazing!");
		}

	}

}
