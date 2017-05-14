int[] testArraySmall = new int[3];
testArraySmall[0] = 1;
testArraySmall[1] = 2;
testArraySmall[2] = 3;
int[] testArrayMedium1 = new int[5];
testArrayMedium1[0] = 4;
testArrayMedium1[1] = 4;
testArrayMedium1[2] = 4;
testArrayMedium1[3] = 4;
testArrayMedium1[4] = 4;
int[] testArrayMedium2 = new int[5];
testArrayMedium2[0] = 5;
testArrayMedium2[1] = 5;
testArrayMedium2[2] = 5;
testArrayMedium2[3] = 5;
testArrayMedium2[4] = 5;
int[] testArrayBig = new int[6];
testArrayBig[0] = 9;
testArrayBig[1] = 9;
testArrayBig[2] = 9;
testArrayBig[3] = 9;
testArrayBig[4] = 9;
testArrayBig[5] = 9;

ArrayCopier xerox = new ArrayCopier();

System.out.println("Big into Small: ");
xerox.copy(testArrayBig,testArraySmall);
xerox.printArray(testArraySmall);

System.out.println("Small into Medium: ");

xerox.copy(testArraySmall,testArrayMedium1);
xerox.printArray(testArrayMedium1);

System.out.println("Same into Same: ");

xerox.copy(testArrayMedium2,testArrayMedium1);
xerox.printArray(testArrayMedium1);
