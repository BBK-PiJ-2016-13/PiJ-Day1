println "Input some text please "
String str1 = System.console().readLine()
int count = 0
String palindrome = str1
while (count < (str1.length())) {
	print count
	palindrome = palindrome + str1[(str1.length()-1-count)]
	count++;
}
println "The text is: " + palindrome