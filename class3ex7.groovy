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

Rectangle myRectangle1 = new Rectangle();
	myRectangle1.upLeft = upperLeft;
	myRectangle1.downRight = lowerRight;

println "Input an x-coordinate please "
str1 = System.console().readLine()
x1 = Double.parseDouble(str1)
println "Input a y-coordinate please"
str2 = System.console().readLine()
y1 = Double.parseDouble(str2)

println "Input an x-coordinate please "
str1 = System.console().readLine()
x2 = Double.parseDouble(str1)
println "Input a y-coordinate please"
str2 = System.console().readLine()
y2 = Double.parseDouble(str2)

Point upperLeft2 = new Point();
	upperLeft2.x = x1;
	upperLeft2.y = y1;

Point lowerRight2 = new Point();
	lowerRight2.x = x2;
	lowerRight2.y = y2;

//upperleft test and reassign points if necessary

if (x1 <= x2) {
	upperLeft2.x = x1;
	lowerRight2.x = x2;
	} else {
	upperLeft2.x = x2;
	lowerRight2.x = x1;
	}

 if (y1 >= y2) {
	upperLeft2.y = y1;
	lowerRight2.y = y2;
	} else {
	upperLeft2.y = y2;
	lowerRight2.y = y1;
	}

Rectangle myRectangle2 = new Rectangle();
	myRectangle2.upLeft = upperLeft2;
	myRectangle2.downRight = lowerRight2;

println "Input an x-coordinate please "
str1 = System.console().readLine()
double x3 = Double.parseDouble(str1)
println "Input a y-coordinate please"
str2 = System.console().readLine()
double y3 = Double.parseDouble(str2)
Point x3y3 = new Point();
	x3y3.x = x3;
	x3y3.y = y3;

//is x3y3 within the first rectangle?

boolean insiderect = false

if (((myRectangle1.upLeft.x <= x3y3.x)
	    && (x3y3.x <= myRectangle1.downRight.x))
	&& ((myRectangle1.upLeft.y >= x3y3.y)
	    && (x3y3.y >= myRectangle1.downRight.y))) {
	insiderect = true
	println "The fifth point lies within the first rectangle."
}
else {
	println "The fifth point is not within the first rectangle."
}

//is x3y3 within the second rectangle?

if (((myRectangle2.upLeft.x <= x3y3.x)
	    && (x3y3.x <= myRectangle2.downRight.x))
	&& ((myRectangle2.upLeft.y >= x3y3.y)
	    && (x3y3.y >= myRectangle2.downRight.y))) {
	println "The fifth point lies within the second rectangle."
}
else {
	insiderect = false
	println "The fifth point is not within the second rectangle."
}

if (insiderect == true) {
	println "The fifth point is within both rectangles."
} else {
	println "The fifth point is not within both rectangles."
}


