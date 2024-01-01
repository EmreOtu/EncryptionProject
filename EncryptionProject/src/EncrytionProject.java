import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class EncrytionProject {

	private Scanner scanner;
	private Random random;
	private ArrayList<Character> list;
	private ArrayList<Character> shuffledList;
	private char character;
	private String line;
	private char[] letters;
	private char[] secretLetters;

	public EncrytionProject() {
		scanner = new Scanner(System.in);
		random = new Random();
		list = new ArrayList<Character>();
		shuffledList = new ArrayList<Character>();
		character = ' ';

		newKey();
		askQuestion();
	}

	private void askQuestion() {
		while (true) {
			System.out.println("*************************************************");
			System.out.println("What do you want to do?");
			System.out.println("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrytpt, (Q)uit");

			char response = Character.toUpperCase(scanner.nextLine().charAt(0));

			decision(response);

		}
	}

	private void newKey() {

		character = ' ';
		list.clear();
		shuffledList.clear();

		for (int i = 32; i < 127; i++) {
			list.add(character);
			character++;
		}

		shuffledList = new ArrayList<Character>(list);
		Collections.shuffle(shuffledList);

		System.out.println("* A New Key is Generated! *");
	}

	private void makeKey() {
	}

	private void encrypt() {
	}

	private void decrypt() {
	}

	private void quit() {
	}

	private void decision(char response) {

		switch (response) {
		case 'N':
			newKey();
			break;
		case 'G':
			makeKey();
			break;
		case 'E':
			encrypt();
			break;
		case 'D':
			decrypt();
			break;
		case 'Q':
			quit();
			break;
		default:
			System.out.println("Not a Valid Answer :(");
		}
	}
}
