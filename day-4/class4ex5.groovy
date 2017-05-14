class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double distanceTo(Point point) {
		return ((((point.x - this.x)**2) + ((point.y - this.y)**2))**0.5);
	}

	double distanceToOrigin() {
		Point origin = new Point (0,0);
		return distanceTo(origin);
	}

	void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}

	void moveTo(Point point) {
		this.x = point.x;
		this.y = point.y;
	}

	Point clone() {
		Point clonedPoint = new Point (this.x, this.y)
	}

	Point opposite() {
		Point oppPoint = new Point (this.x * - 1 , this.y * -1)
	}
}
println "Enter an x-coordinate: "
String str1 = System.console().readLine()
int x1 = Integer.parseInt(str1)
println "Enter a y-coordinate: "
str1 = System.console().readLine()
int y1 = Integer.parseInt(str1)
Point startingPoint = new Point(x1,y1);
println "Select an option: "
println "1: Calculate the distance to another point"
println "2: Calculate the distance to origin"
str1 = System.console().readLine()
int z1 = Integer.parseInt(str1)
switch (z1) {
	case 1: println "Enter an x-coordinate: "
		str1 = System.console().readLine()
		int x2 = Integer.parseInt(str1)
		println "Enter a y-coordinate: "
		str1 = System.console().readLine()
		int y2 = Integer.parseInt(str1)
		Point fartherPoint = new Point(x2,y2);
		println startingPoint.distanceTo (fartherPoint)
		break
	case 2: println startingPoint.distanceToOrigin();
		break
	default: println "Invalid option. Please try again."

}

