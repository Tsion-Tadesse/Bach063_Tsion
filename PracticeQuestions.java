public class PracticeQuestions {
    public static void main(String[] args) {
        System.out.println("Test");
        int a = biggerNum(2, 3);
        System.out.println(a);
        swapNumbers(56, 67);
        swapNums(9, 4);

        String b = evaluateEvenOdd(4);
        System.out.println(b);

        int big = biggestNum(3, 5, 2);
        System.out.println("The biggest number is: " + big);

        isVowelOrConsonant('a');
        isVowelOrConsonant('b');
    }

    // DS1.3. Find Bigger number among two
    public static int biggerNum(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    // Swap two number
    public static void swapNumbers(int num1, int num2) {
        System.out.println("Origionally 1st Var: " + num1);
        System.out.println("Origionally 2nd Var: " + num2);
        int valueHolder;
        valueHolder = num1;
        num1 = num2;
        num2 = valueHolder;

        System.out.println("After swap 1st Var: " + num1);
        System.out.println("After swap 2nd Var: " + num2);
    }

    // Swap two numbers without using extra variable
    public static void swapNums(int num1, int num2) {
        System.out.println("Origionally 1st Var: " + num1);
        System.out.println("Origionally 2nd Var: " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swap 1st Var: " + num1);
        System.out.println("After swap 2nd Var: " + num2);
    }
    // Check number is even or odd using ternary operator

    public static String evaluateEvenOdd(int n) {
        String isEven = (n % 2 == 0) ? "Even" : "Odd";
        return isEven;
    }

    // Find Bigger number among three numbes
    public static int biggestNum(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }

    // Find a character is vowel or consonant
    public static void isVowelOrConsonant(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(c + " is a vowel");
        } else {
            System.out.println(c + " is a consonant");
        }
    }
}
