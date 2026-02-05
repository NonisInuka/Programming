class Calculator {
   
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int square(int n) {
        return n * n;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        int step1 = myCalc.multiply(3, 4);       // 12
        int step2 = myCalc.multiply(5, 7);       // 35
        int sum1 = myCalc.add(step1, step2);     // 47
        int result1 = myCalc.square(sum1);       // 47 * 47

        System.out.println("Result of (3 * 4 + 5 * 7)^2 is: " + result1);


        int partA = myCalc.add(4, 7);            // 11
        int partB = myCalc.add(8, 3);            // 11
        int squareA = myCalc.square(partA);      // 121
        int squareB = myCalc.square(partB);      // 121
        int result2 = myCalc.add(squareA, squareB); // 242

        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 is: " + result2);
    }
}
