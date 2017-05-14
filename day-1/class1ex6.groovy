println "Input one number please "
String str1 = System.console().readLine()
int x = Integer.parseInt(str1)
println "Input another number please "
String str2 = System.console().readLine()
int y = Integer.parseInt(str2)
counter = 0
remainder = x
while (remainder >= y) {
  remainder = remainder - y;
  counter ++;
}	
System.out.println("The number " + x + " divided by " + y + " equals " + counter + " and remainder " + remainder)
