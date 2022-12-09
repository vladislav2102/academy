package by.academy.homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Deal {
	public static void main(String[] args) {

		int n = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Сколько игроков? (от 2 до 10ти)");

		while (scan.hasNext()) {
			n = scan.nextInt();
			if (n >= 2 & n <= 10) {
				break;
			} else {
				System.out.println("Неверное количество игроков, введите еще раз:");
			}
		}

		scan.close();

		String[] deck = {"A♦", "A♥", "A♣", "A♠", "2♦", "2♥", "2♣", "2♠",
				"3♦", "3♥", "3♣", "3♠", "4♦", "4♥", "4♣", "4♠",
				"5♦", "5♥", "5♣", "5♠", "6♦", "6♥", "6♣", "6♠",
				"7♦", "7♥", "7♣", "7♠", "8♦", "8♥", "8♣", "8♠",
				"9♦", "9♥", "9♣", "9♠", "10♦", "10♥", "10♣", "10♠",
				"J♦", "J♥", "J♣", "J♠", "Q♦", "Q♥", "Q♣", "Q♠",
				"K♦", "K♥", "K♣", "K♠"};

		int[] deckHelp = new int[52];

		for (int i = 0; i < deckHelp.length; i++) {
			deckHelp[i] = i + 1;
		}

		Random random = new Random();

		for (int i = 0; i < n; i++) {
			String[] cardOnHold = new String[5];
			for (int j = 0; j < cardOnHold.length; j++) {
				boolean isOn = true;
				while (isOn) {
					int k = random.nextInt(0, deckHelp.length);
					if (deckHelp[k] != 0) {
						cardOnHold[j] = deck[k];
						deckHelp[k] = 0;
						isOn = false;
					}
				}
			}
			System.out.println("Карты " + (i + 1) + " игрока " + Arrays.toString(cardOnHold) + "\n");
		}
	}
}
