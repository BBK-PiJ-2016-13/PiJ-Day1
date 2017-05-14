println "Input some text please "
String str1 = System.console().readLine()
int count = 0
boolean palindrome = true
while (count < (str1.length()-1)) {
	print count
	if (str1[count] != str1[(str1.length()-1-count)]) { //if the counter char isn't
		println "not a palindrome"
		count++; //equal to the length minus the counter
		palindrome = false;
		break
	} else {
		println "still a palindrome"
		count++;
	}
}
println "The text is a palindrome - " + palindrome