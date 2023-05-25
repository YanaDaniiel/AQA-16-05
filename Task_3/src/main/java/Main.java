public class Main {
    public static void main(String[] args) {

        //Data primitives in Java - live in Stack
        char letterY = 'Y';
        System.out.println(letterY);
        byte byteValue = 126;
        System.out.println(byteValue);
        short shortValue = 32767;
        System.out.println(shortValue);
        long longValue = 9223372036854775807L;
        System.out.println(longValue);
        int intValue = 2147483647;
        System.out.println(intValue);
        float floatValue = 1.2345f;
        System.out.println(floatValue);
        double doubleValue = 2.12345678901234d;
        System.out.println(doubleValue);
        boolean boolValue = true;
        System.out.println(boolValue);

        //String - leaves in Heap
        String stringValue = "Happy Java";
        System.out.println(stringValue);

        //Operations
        //sum
        int sumFirstNumber = 10;
        int sumSecondNumber = 2;
        int sumResult = sumFirstNumber + sumSecondNumber;
        System.out.println(sumResult);

        //subtraction
        int subFirstNumber = 20;
        int subSecondNumber = 4;
        int subResult = subFirstNumber - subSecondNumber;
        System.out.println(subResult);

        //multiplication
        int mulFirstNumber = 30;
        int mulSecondNumber = 5;
        int mulResult = mulFirstNumber * mulSecondNumber;
        System.out.println(mulResult);

        //division
        int divFirstNumber = 40;
        int divSecondNumber = 4;
        int divResult = divFirstNumber / divSecondNumber;
        System.out.println(divResult);
    }
}
