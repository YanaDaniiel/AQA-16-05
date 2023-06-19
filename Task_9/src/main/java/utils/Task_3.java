package utils;

public class Task_3 {

    public static String findMinString(String symbols) {
        String[] stringWords = symbols.split(" ");
        String minWord = "";
        int minCount = Integer.MAX_VALUE;
        for (String word : stringWords) {
            int count = countUniqueSymbols(word);
            if (count < minCount) {
                minCount = count;
                minWord = word;
            }
        }
        System.out.println(minWord);
        return minWord;
    }

    public static int countUniqueSymbols(String word) {
        String[] uniqueChars = new String[word.length()];
        String[] stringSplit = word.split("r?");
        uniqueChars[0] = stringSplit[0];
        int counter = 0;
        for (String symbol : uniqueChars) {
            if (symbol != null) {
                for (int j = 0; j < word.length(); j++) {
                    if (!symbol.contains(stringSplit[j])) {
                        uniqueChars[j] = stringSplit[j];
                    }
                }
                counter++;
            }
        }
        return counter;
    }
}

