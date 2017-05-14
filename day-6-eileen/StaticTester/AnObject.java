class AnObject {
  private static int i = 3;
  public static void main (String[] args) {
    System.out.println("accessing static var from class: " + i);
    AnObject ao = new AnObject();
    System.out.println("accessing static var from object: " + ao.i);
    System.out.println("calling printA from class: " + printA());
    System.out.println("calling printA from obj: " + ao.printA());
  }

  public static String printA() {
    System.out.println("Printing A from in static printA!");
    return "A";
  }

  public String printB() {
    System.out.println("Printing B from in printB!");
    return "B";
  }
}
