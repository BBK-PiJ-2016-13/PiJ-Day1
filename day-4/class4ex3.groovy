class Converter {

	int power(int b, int e) {
		return b ** e;
	}

	int power2(int e) {
		return power(2, e);
	}

	String binary2decimal(String binary) {
		int sum = 0;
		for (int i = 0; i < binary.length(); i++) {
			int x2 = Integer.parseInt(binary[i])
			sum = sum + x2*power2(binary.length()-i-1);
		}
		return sum
	}

	String decimal2binary(int decimal) {
		String binary = ""
		int remainder = 0
		int total = decimal
		while (total > 0) {
			remainder = total % 2	
			total = total / 2
			binary = remainder + binary
		}
		return binary
	}
}
Converter converter = new Converter();
println "Select an option: "
println "1: Convert a binary number to decimal"
println "2: Convert a decimal number to binary"
String str1 = System.console().readLine()
int x1 = Integer.parseInt(str1)
switch (x1) {
	case 1: println "Input the number: "
		String str2 = System.console().readLine()
		println converter.binary2decimal (str2)
		break
	case 2: println "Input the number: "
		String str2 = System.console().readLine()
		int x2 = Integer.parseInt(str2)
		println converter.decimal2binary (x2)
		break
	default: println "Invalid option. Please try again."

}

