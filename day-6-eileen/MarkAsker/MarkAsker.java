class MarkAsker {
  private int mark = 0;
  private int numSeen = 0;
  private int numDistinction = 0;
  private int numPass = 0;
  private int numFail = 0;
  private int numInvalid = 0;

  public static void main (String[] args) {
    MarkAsker ma = new MarkAsker();
    ma.launch();
  }

  void launch() {
    System.out.println("Start entering marks (-1 to finish): ");
    do {
      mark = Integer.parseInt(System.console().readLine());
      numSeen++;
      if (70 <= mark && mark <= 100) {
        numDistinction++;
      } else if (50 <= mark && mark <= 69) {
        numPass++;
      } else if (0 <= mark && mark <= 49) {
        numFail++;
      } else {
        numInvalid++;
      }
    } while (mark != -1);
    printOut();
  }

  void printOut() {
    numSeen--;
    numInvalid--;
    System.out.println("numSeen is: " + numSeen);
    System.out.println("numDistinction is: " + numDistinction);
    System.out.println("numPass is: " + numPass);
    System.out.println("numFail is: " + numFail);
    System.out.println("numInvalid is: " + numInvalid);
  }
}
