import java.util.Scanner;

/**
 * This is a solution for Java Loops II challenge of hackerrank.com
 * 
 * @see https://www.hackerrank.com/rest/contests/master/challenges/java-loops/hackers/ricardomalnati/download_solution
 * @author ricardomalnati
 *
 */
public class JavaLoops {

	public static void reducer (int start, int constant, int exp, int index, int limit, int accumulator) {
		if (index <= limit) {
			int nextValue = exp * constant + accumulator;
			System.out.print(String.format("%d ", start + nextValue));
			reducer(start, constant, 2* exp, ++index, limit, nextValue);
		}
	}
	
	public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        	String line = in.nextLine();
        	if(! line.isEmpty() ) {
        		String[] values = line.split("\\s");
        		if ( values.length == 1 || values.length == 3 ) {
        			int start = Integer.parseInt(values[0]);
        			if ( values.length == 3 ) {
        				int constant = Integer.parseInt(values[1]);
        				int limit = Integer.parseInt(values[2]);
    					reducer(start, constant, 1, 1, limit, 0);
        			}
        		}
        	}
        }
        in.close();
    }

}
