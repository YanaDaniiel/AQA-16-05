package utils;

public class Task_2 {

    public static String getMarks(String surname, String mark, String subject) {

        String strSur;
        String strMark;
        String strSub;

        if (surname.length() < 15) {
            strSur = surname;
        } else {
            strSur = surname.substring(0, 15);
        }

        if (mark.length() < 3) {
            strMark = mark;
        } else {
            strMark = mark.substring(0, 3);
        }

        if (subject.length() < 10) {
            strSub = subject;
        } else {
            strSub = subject.substring(0, 10);
        }

        String print = String.format("Student %s received %s on the subject %s", strSur, strMark, strSub);
        System.out.println(print);
        return print;
    }
}
