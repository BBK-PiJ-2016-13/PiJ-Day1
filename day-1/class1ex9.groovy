println "Input one number please "
String str1 = System.console().readLine()
int x = Integer.parseInt(str1)
int y = x
boolean up = true
while (y >= 0) {
	println "Input another number please (-1 to stop)"
	String str2 = System.console().readLine()
	y = Integer.parseInt(str2)
	if (((y <= x) || (y != x + 1)) && (y > 0) && (up = true)) {
		up = false
	}
	else {x = y
	}
}
println("Was the sequence consecutively increasing? " + up)
