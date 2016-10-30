println "Input some characters please "
String str1 = System.console().readLine()
int count = 0
int letter = 0
while (count < str1.length()) {
	if (str1[count] != "e") {
		count++;
	} else {
		letter++
		count++;
	}
}
println "The number of letter e's in the text is " + letter
