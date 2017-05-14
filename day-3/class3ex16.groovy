println "Input a number with commas and decimal dots please "
String str1 = System.console().readLine()
int count = 0
int tempcount = 0
String half = ""
boolean carry = false
boolean dot = false
String current = ""
while (count < (str1.length())) {
	print count
	current = str1[count]
	if (current == ",") {
		half = half + current //concatenating the , to string half
		count++
		println half
	}
	else if (current ==  ".") {
		half = half + current
		count++
		dot = true //tracking the decimal place has been set
		print "setting dot to true"
		println half
	} else {
		if (Integer.parseInt(str1[count]) % 2 == 0) {
			print "halving"
			tempcount = Integer.parseInt(current)
			if (carry == true) {
				tempcount = tempcount + 10
				carry = false
			}
			tempcount = tempcount / 2
			half = half + tempcount
			count++;
			println half
		}
		else {
			print "there's a remainder"
			tempcount = Integer.parseInt(current)
			if (carry == true) {
				tempcount = tempcount + 10
				carry = false
				print "carrying the ten"
			}
			tempcount = tempcount / 2
			half = half + tempcount
			println half
			carry = true
			print "preparing to carry"
			count++;
			if ((str1.length() == count) && (dot == true)) {
				str1 = str1 + "0"
				print str1
			}
		}
	}
}
println "Half of that is: " + half