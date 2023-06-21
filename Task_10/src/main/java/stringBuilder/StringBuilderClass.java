package stringBuilder;

public class StringBuilderClass {

    public static void getBuilder(int a, int b) {

        //Subtask_1
        StringBuilder stringBuilderSum = new StringBuilder();
        stringBuilderSum.append(a + "+" + b + "=" + (a + b));
        System.out.println(stringBuilderSum);

        StringBuilder stringBuilderDiff = new StringBuilder();
        stringBuilderDiff.append(a + "-" + b + "=" + (a - b));
        System.out.println(stringBuilderDiff);

        StringBuilder stringBuilderMul = new StringBuilder();
        stringBuilderMul.append(a + "*" + b + "=" + (a * b));
        System.out.println(stringBuilderMul);

        //Subtask_2
        stringBuilderSum.deleteCharAt(4);
        stringBuilderSum.insert(4, " равно ");
        System.out.println(stringBuilderSum);

        //Subtask_3
        stringBuilderDiff.replace(4, 5, " равно ");
        System.out.println(stringBuilderDiff);
    }
}

