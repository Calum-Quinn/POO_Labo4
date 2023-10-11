public class IntMain {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }

        Int[] argsValues = new Int[args.length];

        for (int i = 0; i < args.length; ++i) {
            String arg = args[i];
            int j, power = arg.length() - 1;
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

            Int number = new Int();
            for (; j < arg.length(); ++j) {
                int temp = number.getNum();
                temp += ((arg.charAt(j) - '0') * Math.pow(10, power));
                number.setNum(temp);
                --power;
            }

            if (isNegative) {
                number.setNum(-number.getNum());
            }

            argsValues[i] = number;
        }

        printArray(bubbleSort(argsValues));
    }

    private static Int[] bubbleSort(Int[] values) {
        int temp;
        boolean swapped;

        for (int i = 0; i < values.length - 1; ++i) {
            swapped = false;
            // Loop on the digits that are not yet sorted
            for (int j = 0; j < values.length - i - 1; ++j) {
                if (values[j].getNum() > values[j + 1].getNum()) {
                    // Swap the values
                    Int.swapIntVal(values[j],values[j+1]);
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

    private static void printArray(Int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i].toString());
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
