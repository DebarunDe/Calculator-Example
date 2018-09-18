import java.util.Scanner;

class CalculatorMain {
	private static Scanner sc;

	public static void main(String[] args) 
	{
		int Number;
		Calculator calc = new Calculator();
		sc = new Scanner(System.in);
		System.out.println("Choose your Function: add(1) or subtract(2)");
		Number = sc.nextInt();
		if(Number > 1.1) {
			System.out.print(calc.subtract(2,4));
			
		}
		else {
			System.out.print(calc.add(2,4));
		}
	}
	
}
