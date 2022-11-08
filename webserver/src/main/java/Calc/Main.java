package Calc;

import java.util.Scanner;

public class Main {
	static String exp;

    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
        System.out.println("Enter expression to evaluate:");
        exp = input.next();
				Calculator calc = new Calculator();
        System.out.println(calc.evaluate(exp));

    }

}
