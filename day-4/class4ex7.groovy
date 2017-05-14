class Mortgage {
	double c //total owed at outset
	double r //percentage interest

	double getOwed() {
		return c
	}

	double getPercent() {
		return r
	}

	double setOwed(Double owed) {
		c = owed
	}

	double setRate(Double rate) {
		r = rate
	}

	double getTotal() { //total owed with interest
		return (c * (1+(r/100)))
	}

	double getPerYear(Double years) {
		return (getTotal()/years)
	}

	double whenIntPaid(Double years) {
		return ((getTotal() - c)/getPerYear(years))
	}

}

Mortgage m2 = new Mortgage();
println "Enter amount borrowed: ";
String str = System.console().readLine();
double i = Double.parseDouble(str);
m2.setOwed(i);
println "Enter percent interest: ";
str = System.console().readLine();
i = Double.parseDouble(str);
m2.setRate(i);
println "Enter the amount of time to pay back the mortgage: "
str = System.console().readLine();
i = Double.parseDouble(str);
println "The amount to pay each year for " + i + " years: " + m2.getPerYear(i)
println "This totals: " + m2.getTotal()
println "The number of years before the interest is paid and only capital remains: " + m2.whenIntPaid(i)