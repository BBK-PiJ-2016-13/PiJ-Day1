class Point {
	double x;
	double y;
}
class Rectangle {
	Point upLeft;
	Point downRight;
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

Rectangle myRectangle = new Rectangle();
	myRectangle.upLeft = x1y1;
	myRectangle.downRight = x2y2;

double area = Math.abs((myRectangle.upLeft.x - myRectangle.downRight.x) * (myRectangle.upLeft.y - myRectangle.downRight.y))
println area

//doesn't matter if it's actually upper left because taking the absolute value of the product






