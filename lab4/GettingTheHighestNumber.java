package lab4;

public class GettingTheHighestNumber {

	public static void main(String[] args) {
		//find the greatest value in the 3 number
		int num1 = 10;
		int num2 = 20;
		int num3 = 50;
		
		if (num1 >= num2 && num1 >=num3) {
			System.out.println("the hightest number is = " +num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("the highest number is = " + num2);
		}else {
			System.out.println("the highest number is = " + num3);
		}

	}

}
