println "Input total cost please in pence"
String str1 = System.console().readLine()
Double totalcost = Double.parseDouble(str1)
println "Were there any notes paid? True / False"
str1 = System.console().readLine()
Boolean currency = Boolean.parseBoolean(str1)
int total50s = 0
int total20s = 0
int total10s = 0
int total5s = 0
int total2s = 0
int total1s = 0
int total50ps = 0
int total20ps = 0
int total10ps = 0
int total5ps = 0
int total2ps = 0
int total1ps = 0
if (currency == true) {
	println "Input total number of 50 notes given please "
	str1 = System.console().readLine()
	total50s = Integer.parseInt(str1)
	println "Input total number of 20 notes given please "
	str1 = System.console().readLine()
	total20s = Integer.parseInt(str1)
	println "Input total number of 10 notes given please "
	str1 = System.console().readLine()
	total10s = Integer.parseInt(str1)
	println "Input total number of 5 notes given please "
	str1 = System.console().readLine()
	total5s = Integer.parseInt(str1)
}
println "Were there any coins paid? True / False"
str1 = System.console().readLine()
currency = Boolean.parseBoolean(str1)
if (currency == true) {
	println "Input total number of £2 coins given please "
	str1 = System.console().readLine()
	total2s = Integer.parseInt(str1)
	println "Input total number of £1 coins given please "
	str1 = System.console().readLine()
	total1s = Integer.parseInt(str1)
	println "Input total number of 50p coins given please "
	str1 = System.console().readLine()
	total50ps = Integer.parseInt(str1)
	println "Input total number of 20p coins given please "
	str1 = System.console().readLine()
	total20ps = Integer.parseInt(str1)
	println "Input total number of 10p coins given please "
	str1 = System.console().readLine()
	total10ps = Integer.parseInt(str1)
	println "Input total number of 5p coins given please "
	str1 = System.console().readLine()
	total5ps = Integer.parseInt(str1)
	println "Input total number of 2p coins given please "
	str1 = System.console().readLine()
	total2ps = Integer.parseInt(str1)
	println "Input total number of 1p coins given please "
	str1 = System.console().readLine()
	total1ps = Integer.parseInt(str1)
}

Double totalpaid = total50s * 5000 + total20s * 2000 +
total10s * 1000 + total5s * 500 + total2s * 200 + total1s +
total50ps * 50 + total20ps * 20 + total10ps * 10 +
total5ps * 5 + total2ps * 2 + total1ps
int totalchange = totalpaid - totalcost
println "The total amount of change due is " +
totalchange + " pence"

total50s = total20s = total10s = total5s = 0
total2s = total1s = total50ps = total20ps = 0
total10ps = total5ps = total2ps = total1ps = 0

while (totalchange >= 1) {
	if (totalchange / 5000 >=1) {
		totalchange = totalchange - 5000
		total50s++
	}   else if (totalchange / 2000 >=1) {
		totalchange = totalchange - 2000
		total20s++
	}	else if (totalchange / 1000 >=1) {
		totalchange = totalchange - 1000
		total10s++
	}	else if (totalchange / 500 >=1) {
		totalchange = totalchange - 500
		total5s++
	}	else if (totalchange / 200 >=1) {
		totalchange = totalchange - 200
		total2s++
	}	else if (totalchange / 100 >=1) {
		totalchange = totalchange - 100
		total1s++
	}	else if (totalchange / 50 >=1) {
		totalchange = totalchange - 50
		total50ps++
	}	else if (totalchange / 20 >=1) {
		totalchange = totalchange - 20
		total20ps++
	}	else if (totalchange / 10 >=1) {
		totalchange = totalchange - 10
		total10ps++
	}	else if (totalchange / 5 >=1) {
		totalchange = totalchange - 5
		total5ps++
	}   else if (totalchange / 2 >=1) {
		totalchange = totalchange - 2
		total2ps++
	}   else if (totalchange >=1) {
		totalchange = totalchange - 1
		total1ps++
	}
}
println "Total number of 50s " + total50s
println "Total number of 20s " + total20s
println "Total number of 10s " + total10s
println "Total number of 5s " + total5s
println "Total number of 2s " + total2s
println "Total number of 1s " + total1s
println "Total number of 50ps " + total50ps
println "Total number of 20ps " + total20ps
println "Total number of 10ps " + total10ps
println "Total number of 5ps " + total5ps
println "Total number of 2ps " + total2ps
println "Total number of 1ps " + total1ps