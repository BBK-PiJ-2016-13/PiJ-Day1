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
println "Input a letter you would like to look for "
String str2 = System.console().readLine()
count = 0
letter = 0
while (count < str1.length()) {
	if (str1[count] != str2) {
		count++;
	} else {
		letter++
		count++;
	}
}
println "The number of letter " + str2 + "'s' in the text is " + letter