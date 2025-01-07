package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707)); // true
        System.out.println(isPalindrome(11212)); // false

        System.out.println("---------------------");

        System.out.println(isPerfectNumber(6)); // true
        System.out.println(isPerfectNumber(28)); // true
        System.out.println(isPerfectNumber(5)); // false
        System.out.println(isPerfectNumber(-1)); // false

        System.out.println("---------------------");

        System.out.println(numberToWords(123)); // One Two Three
        System.out.println(numberToWords(1010)); // One Zero One Zero
        System.out.println(numberToWords(-12)); // Invalid Value
    }

    public static boolean isPalindrome(int number) {
        String ogNumber = String.valueOf(Math.abs(number));
        String reverse = new StringBuilder(ogNumber).reverse().toString();
        return ogNumber.equals(reverse);
    }

    public static boolean isPerfectNumber(int number) {
        if(number < 0) {
            return false;
        }
        int topBolen = 0;
        for(int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                topBolen += i;
            }
        }
        return topBolen == number;
    }

    public static String numberToWords(int number) {
        if(number < 0) {
            return "Invalid Value";
        }

        String strNumber = String.valueOf(number);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strNumber.length(); i++) {
            char digit = strNumber.charAt(i);
            switch (digit) {
                case '0':
                    sb.append("Zero");
                    break;
                case '1':
                    sb.append("One");
                    break;
                case '2':
                    sb.append("Two");
                    break;
                case '3':
                    sb.append("Three");
                    break;
                case '4':
                    sb.append("Four");
                    break;
                case '5':
                    sb.append("Five");
                    break;
                case '6':
                    sb.append("Six");
                    break;
                case '7':
                    sb.append("Seven");
                    break;
                case '8':
                    sb.append("Eight");
                    break;
                case '9':
                    sb.append("Nine");
                    break;
            }
            if (i < strNumber.length() -1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
