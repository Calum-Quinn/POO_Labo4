public class Main {
    public static void main(String[] args) {
        int[] argsValues = new int[args.length];

        for (int i = 0; i < args.length; ++i) {
            String arg = args[i];
            int j, power = arg.length() - 1;
            boolean isNegative = false;

            switch (arg.charAt(0)) {
                case '-':
                    isNegative = true;
                case '+':
                    j = 1;
                    --power;
                    break;
                default:
                    j = 0;
            }

            int number = 0;
            for (; j < arg.length(); ++j) {
                number += (int)((arg.charAt(j) - '0') * Math.pow(10, power));
                --power;
            }

            if (isNegative) {
                number *= -1;
            }

            argsValues[i] = number;
            System.out.println(argsValues[i]);
        }
    }
}
