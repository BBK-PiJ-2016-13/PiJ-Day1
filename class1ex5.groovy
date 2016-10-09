println "Input one number please "
String str1 = System.console().readLine()
int x = Integer.parseInt(str1)
println "Input another number please "
String str2 = System.console().readLine()
int y = Integer.parseInt(str2)
counter = 1
total = 0
while (counter <=y) {
  total = total + x;
  counter ++;
}	
System.out.println("The number " + x + " times " + y + " equals " + total)

