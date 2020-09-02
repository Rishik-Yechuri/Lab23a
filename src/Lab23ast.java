// Lab23ast.java
// This is the starting version of the "Perfect Number" program. 


import java.util.*;


public class Lab23ast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lab 23 100 Points Version\n" +
                "\n" +
                "Enter an integer in [2..10000] range ===>>  ");
        int numberToCheck = scanner.nextInt();
        System.out.println("\nAll the perfect numbers between 1 and 10000");
        ArrayList<ArrayList<String>> listOfPerfect = new ArrayList<>();
        for (int x = 1; x < numberToCheck; x++) {
            boolean isPerfect = false;
            int numberItAddsTo = 0;
            ArrayList<String> tempPerfect = new ArrayList<String>();
            for (int y = 1; y <= x/2; y++) {
                if (x % y == 0) {
                    tempPerfect.add(String.valueOf(y));
                    numberItAddsTo += y;
                }
            }
            if (numberItAddsTo == x) {
                listOfPerfect.add(tempPerfect);
            }
        }
        System.out.println("");
        for (int x = 0; x < listOfPerfect.size(); x++) {
            int reassemble = 0;
            int thingSize = listOfPerfect.get(x).size();
            for (int y = 0; y < thingSize; y++) {
                reassemble += Integer.parseInt(listOfPerfect.get(x).get(y));
                if (y == thingSize - 1) {
                    System.out.print(listOfPerfect.get(x).get(y) + " = " + reassemble);
                } else {
                    System.out.print(listOfPerfect.get(x).get(y) + " + ");
                }
            }
            System.out.println();
        }
    }

}