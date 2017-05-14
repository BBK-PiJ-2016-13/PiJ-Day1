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

println "Input an x-coordinate please "
str1 = System.console().readLine()
double x2 = Double.parseDouble(str1)
println "Input a y-coordinate please"
str2 = System.console().readLine()
double y2 = Double.parseDouble(str2)

Point upperLeft = new Point();
	upperLeft.x = x1;
	upperLeft.y = y1;

Point lowerRight = new Point();
	lowerRight.x = x2;
	lowerRight.y = y2;

//upperleft test and reassign points if necessary

if (x1 <= x2) {
	upperLeft.x = x1;
	lowerRight.x = x2;
	} else {
	upperLeft.x = x2;
	lowerRight.x = x1;
	}

 if (y1 >= y2) {
	upperLeft.y = y1;
	lowerRight.y = y2;
	} else {
	upperLeft.y = y2;
	lowerRight.y = y1;
	}

Rectangle myRectangle = new Rectangle();
	myRectangle.upLeft = upperLeft;
	myRectangle.downRight = lowerRight;

println "Input an x-coordinate please "
str1 = System.console().readLine()
double x3 = Double.parseDouble(str1)
println "Input a y-coordinate please"
str2 = System.console().readLine()
double y3 = Double.parseDouble(str2)
Point x3y3 = new Point();
	x3y3.x = x3;
	x3y3.y = y3;

//is x3y3 within the rectangle?

if (((myRectangle.upLeft.x <= x3y3.x)
	    && (x3y3.x <= myRectangle.downRight.x))
	&& ((myRectangle.upLeft.y >= x3y3.y)
	    && (x3y3.y >= myRectangle.downRight.y))) {
	println "The third point lies within the rectangle."
}
else {
	println "The third point is not within the rectangle."
}






