println "Input a number please "
String str = System.console().readLine()
int x = Integer.parseInt(str)
y = 2
flag = false
while (flag == false && x > y) {
  if (x % y == 0) {
    flag = true;
  }
  else {
    y++;
  }
}	
if (flag == true) {
  System.out.println("The number " + x + " is not prime")
}
else {
  System.out.println("The number " + x + " is prime")
}




//for a number x, x % y = 0 where y == x, or y == 0, or y == any other int 
//between 1 and y means !prime
//so input x, check x % y where y = 2 and keep going until y == x
//if any result is zero than immediately it's !prime and can stop