println "Input one number please "
String str1 = System.console().readLine()
int first = Integer.parseInt(str1)
int sec = first
boolean consecutive = true //consecutive is true unless anything makes it false
while (sec >= 0) {
	println "Input another number please (-1 to stop)"
	String str2 = System.console().readLine()
	sec = Integer.parseInt(str2)
	if (sec < 0) {
		println "Break!"
		break
	}
	if (sec == first) {
		consecutive = false
	}
	if (((sec >= first) &&  //fir is higher than sec, check if second is less than first
		(sec != first + 1)) && //check if second is more than one step above first
		(sec > 0) && //check second is greater than zero
		(consecutive = true)) {
		consecutive = false
		println "Up"
	}
	else if (((sec <= first) &&
		(sec != first - 1)) &&
		(sec > 0) &&
		(consecutive = true)) {
		consecutive = false
		println "Down"
	}
	else {first = sec
		println "Still consecutive"
	}
}
println("Was the sequence consecutively increasing? " + consecutive)
