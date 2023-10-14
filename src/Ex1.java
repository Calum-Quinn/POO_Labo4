import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }

        // So as not to modify args directly
        int[] argsValues = new int[args.length];

        // Check each number individually
        for (int i = 0; i < args.length; ++i) {
            String arg = args[i];
            int j, power = arg.length() - 1; // Power is power of 10 for first digit
            boolean isNegative = false;

            switch (arg.charAt(0)) {
                case '-':
                    isNegative = true;
                case '+':
                    j = 1; // If there is a sign, the first digit will be at index 1
                    --power; // The first digit is at index 1, so the power is one less
                    break;
                default:
                    j = 0;
            }

            int number = 0;
            // Multiply each digit of the current number by the correct power of 10
            for (; j < arg.length(); ++j) {
                number += (int) ((arg.charAt(j) - '0') * Math.pow(10, power));
                --power;
            }

            // Apply sign to negative numbers
            if (isNegative) {
                number *= -1;
            }

            // Add current number to array
            argsValues[i] = number;
        }

        // Sort and then print array
        System.out.println(Arrays.toString(bubbleSort(argsValues)));
    }

    private static int[] bubbleSort(int[] values) {
        int temp;
        boolean swapped;

        for (int i = 0; i < values.length - 1; ++i) {
            swapped = false;
            // Loop on the digits that are not yet sorted
            for (int j = 0; j < values.length - i - 1; ++j) {
                if (values[j] > values[j + 1]) {
                    // Swap the values
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    swapped = true;
                }
            }
            // Breaks early if the array is already sorted
            if (!swapped) {
                break;
            }
        }

        return values;
    }
}