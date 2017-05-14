println "Input one number please "
String str1 = System.console().readLine()
int number = Integer.parseInt(str1)
while (number < 10) {
	println ""
	int j = 0
	while (j < number) {
		print number
		j++
	}
	number = number + 1
}