class Point {
	double x;
	double y;
}
println "Input an x-coordinate please "
String str1 = System.console().readLine()
double x1 = Double.parseDouble(str1)
println "Input a y-coordinate please"
String str2 = System.console().readLine()
double y1 = Double.parseDouble(str2)
Point x1y1 = new Point();
	x1y1.x = x1;
	x1y1.y = y1;
println "Input an x-coordinate please "
str1 = System.console().readLine()
double x2 = Double.parseDouble(str1)
println "Input a y-coordinate please"
str2 = System.console().readLine()
double y2 = Double.parseDouble(str2)
Point x2y2 = new Point();
	x2y2.x = x2;
	x2y2.y = y2;
println "Input an x-coordinate please "
str1 = System.console().readLine()
double x3 = Double.parseDouble(str1)
println "Input a y-coordinate please"
str2 = System.console().readLine()
double y3 = Double.parseDouble(str2)
Point x3y3 = new Point();
	x3y3.x = x3;
	x3y3.y = y3;
distance12 = ((x1y1.x - x2y2.x)**2 + (x1y1.y - x2y2.y)**2)**0.5
distance23 = ((x2y2.x - x3y3.x)**2 + (x2y2.y - x3y3.y)**2)**0.5
distance13 = ((x1y1.x - x3y3.x)**2 + (x1y1.y - x3y3.y)**2)**0.5
if (distance12 < distance23 && distance12 < distance13) {
	println "Points 1 and 2 are the closest."
}
else if (distance23 < distance12 && distance23 < distance13) {
	println "Points 2 and 3 are the closest."
}
else {
	println "Points 1 and 3 are the closest."
}





