import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String []args){
		int idx = 0;
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        	System.out.println(String.format("%d %s", ++idx, in.nextLine()));
        in.close();
    }

}
