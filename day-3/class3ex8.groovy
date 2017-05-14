println "Input some characters please "
String str1 = System.console().readLine()
str1 = str1 + " "
int count = 0
String strword = ""
while (count < str1.length()) {
	if (str1[count] != " ") {
		strword = strword + str1[count];
		count ++;
	} else {
		println strword;
		strword = "";
		count ++;
	}
}
