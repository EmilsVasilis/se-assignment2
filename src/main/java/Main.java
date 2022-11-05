import java.util.Scanner;

public class Main {
	static String exp;
	
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
        System.out.println("Enter expression to evaluate:");
        exp = input.next();
        System.out.println(Calculator.evaluate(exp));

    }

}
