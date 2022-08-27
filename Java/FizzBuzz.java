public class FizzBuzz {
    public static void main(String[] args) throws Exception {

        int[] numbersToCheckFor = { 3, 5 };
        String[] textToPrint = { "Fizz", "Buzz" };
        int startNumber = 1;
        int targetNumber = 100;

        for (int numberToPrint = startNumber; numberToPrint <= targetNumber; numberToPrint++) {
            boolean printedForChecked = false;
            for (int indexOfNumberToCheckFor = 0; indexOfNumberToCheckFor < numbersToCheckFor.length; indexOfNumberToCheckFor++) {
                if (numberToPrint % numbersToCheckFor[indexOfNumberToCheckFor] == 0) {
                    printedForChecked = true;
                    System.out.print(textToPrint[indexOfNumberToCheckFor]);
                }
            }
            System.out.println(printedForChecked ? "" : numberToPrint);
        }
    }
}
