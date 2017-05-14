println "Input one number please "
String str1 = System.console().readLine()
int x = Integer.parseInt(str1)
int higher = x
int y = x
while (y >= 0) {
	println "Input another number please (-1 to stop)"
	String str2 = System.console().readLine()
	y = Integer.parseInt(str2)
	if (y > x) {
		higher = y
	}
}
println("The number " + higher + " was the highest number you typed")
