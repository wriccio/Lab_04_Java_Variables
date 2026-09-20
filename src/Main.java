//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      int intOperandA = 1;
      int intOperandB = 5;
      int intSum = 13;
      int intProduct = 24;
      int intDifference = 42;
      int intQuotient = 7;
      int intModulo = 11;

      double doubleOperandA = 3.50;
      double doubleOperandB = 1.25;
      double doubleSum = 8.75;
      double doubleProduct = 15.60;
      double doubleDifference = 4.10;
      double doubleQuotient = 2.50;

        // Addition
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        // Subtraction
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        // Multiplication
        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        // Division
        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        // Modulo (Remainder)
        intModulo = intOperandA % intOperandB;
        System.out.println("The remainder using ints of " + intOperandA + " divided by " + intOperandB + " is " + intModulo);

        // Addition
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        // Subtraction
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        // Multiplication
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        // Division
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        // The number of kids in your family:
        int familyKidsCount = 4;

        // The answer to is it raining?:
        boolean isRaining = false;

        // The price of a gallon of gas:
        double gasPricePerGallon = 3.29;

        // Your favorite number:
        int favoriteNumber = 41;

        // Your shoe size: (doubles account for half-sizes like 9.5)
        double shoeSize = 13;

        // Your birth month:
        String birthMonth = "June";


        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}