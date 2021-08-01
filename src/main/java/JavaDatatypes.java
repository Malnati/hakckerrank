import java.util.Scanner;

/**
 * This is a solution for Java Datatypes challenge of hackerrank.com
 * 
 * @see https://www.hackerrank.com/rest/contests/master/challenges/java-datatypes/hackers/ricardomalnati/download_solution
 * @author ricardomalnati
 *
 */
public class JavaDatatypes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int limit = Integer.valueOf(in.nextLine());
		String[] values = new String[limit];
		for (int index = 0; index < limit; index++) {
			values[index] = in.nextLine();
		}
		for (int index = 0; index < limit; index++) {
			long number = 0L;
			String line = values[index];
			try {
				number = Long.parseLong(line);
				System.out.println(number + " can be fitted in:");
				if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE)
					System.out.println("* byte");
				if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE)
					System.out.println("* short");
				if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE)
					System.out.println("* int");
				if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE)
					System.out.println("* long");
			} catch (NumberFormatException ex) {
				System.out.println(line + " can't be fitted anywhere.");
			}
		}
		in.close();
	}

}
