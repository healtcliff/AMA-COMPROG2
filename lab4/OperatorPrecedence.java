package lab4;

public class OperatorPrecedence {

	public static void main(String[] args) {
		// Operator of Precedence
		String n1 = "a / b ^ c ^ d - e + f - g * h + i";
		String n2 = "3 + 10 * 2 / 15 - 2 + 4 ^ 2 ^ 2";
		String n3 = "r ^ s * t / u - v + w ^ x - y++";
		
		System.out.println("1. (a / b) ^ (c ^ d) -( e + (f - g) * (h + i))");
		System.out.println("2. (3 + 10) * ((2 / 15) - 2) + ((4 ^ 2) ^ 2)");
		System.out.println("3. (r ^(((s * t) / u) - (v + w ))^ (x - (y++))");
		
		

	}

}
