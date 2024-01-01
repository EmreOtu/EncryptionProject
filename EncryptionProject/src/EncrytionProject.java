import java.util.ArrayList;
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
	}
	
	private void askQuestion() {}
	
	private void newKey() {}
	
	private void makeKey() {}
	
	private void encrypt() {}
	
	private void decrypt() {}
	
	private void quit() {}
}
