import java.util.HashMap;
import java.util.Scanner;

public class HashMap1Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> wordsCount = new HashMap<>(n);
        String longestWord = "Что-то пошло не так";
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            String word = in.next();
            if (wordsCount.containsKey(word)) {
                int currentCount = wordsCount.get(word) + 1;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    longestWord = word;
                }
                wordsCount.put(word, currentCount);
            }
            else
                wordsCount.put(word, 1);
        }
        System.out.println(longestWord);
    }
}
