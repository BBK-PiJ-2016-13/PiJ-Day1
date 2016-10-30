println "Input one number please "
String str1 = System.console().readLine()
double x = Double.parseDouble(str1)
println "Input another number please"
String str2 = System.console().readLine()
double y = Double.parseDouble(str2)
println "Select a number for an operation 1. + 2. - 3. * 4. /"
String s = System.console().readLine()
Integer choice = Integer.parseInt(s)
BigDecimal answer = null
switch (choice) {
case 1:
	answer = x + y;
	println answer;
	break;
case 2:
	answer = x - y;
	println answer;
	break;
case 3:
	answer = x * y;
	println answer;
	break;
case 4:
	answer = x / y;
	println answer;
	break;
default:
	println "That operation is not recognised."
	break;
}
