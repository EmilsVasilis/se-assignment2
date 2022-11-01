public class Main {

   public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
//		input = "2*((2+4)+(5+4))"
		String expression = input.next();
        System.out.println(calculate(expression));
    }

}
