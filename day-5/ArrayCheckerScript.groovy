System.out.println ("Input the first number: ");
String str1 = System.console().readLine();
int x1 = Integer.parseInt(str1);
System.out.println ("Input the second number: ");
str1 = System.console().readLine();
int x2 = Integer.parseInt(str1);
System.out.println ("Input the third number: ");
str1 = System.console().readLine();
int x3 = Integer.parseInt(str1);
int[] testArray = new int[3];
testArray[0] = x1;
testArray[1] = x2;
testArray[2] = x3;

ArrayChecker theChecker = new ArrayChecker();
	if ((theChecker.isSymmetrical(testArray))==false) {
		theChecker.printArray(theChecker.reverse(testArray))
	} else {
		theChecker.printArray(testArray)
	}

