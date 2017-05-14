println "Input one number please "
String str1 = System.console().readLine()
int x = Integer.parseInt(str1)
println "Input another number please "
String str2 = System.console().readLine()
int y = Integer.parseInt(str2)
println "Input another number please "
String str3 = System.console().readLine()
int z = Integer.parseInt(str3)
if (x < y && x < z) {
    if (y < z) {
        print x + " " + y + " " + z
    } else {
        print x + " " + z  + " " + y
    }
} else if (y < x && y < z) {
	if (x < z) {
		print y + " " + x + " " + z
	} else {
		print y + " " + z + " " + x
	}
} else {
	if (y < x) {
		print z + " " + y + " " + x
	} else {
		print z + " " + x + " " + y
	}
}

//x > y, y > z, then x > z