public static void main() {
	System.out.println ("Input the first number: ");
	int str1 = System.console().readLine();
	int x1 = Integer.parseInt(str1);
	System.out.println ("Input the second number: ");
	str1 = System.console().readLine();
	int x2 = Integer.parseInt(str1);
}

calculator C = new calculator(x1,x2);
	println (C.add);
	println (C.subtract);
	println (C.multiply);
	println (C.divide);
	println (C.modulus);
}