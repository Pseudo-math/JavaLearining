import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap2Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedHashMap<String, String> peoples = new LinkedHashMap<>(n);
        HashMap<String, Integer> professionsCount = new HashMap<>(n);
        String mostFrequentProfession = "Не эта точно";
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            String name = in.next();
            String profession = in.next();
            peoples.put(name, profession);
            if (professionsCount.containsKey(profession)) {
                int currentCount = professionsCount.get(profession) + 1;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mostFrequentProfession = profession;
                }
                professionsCount.put(profession, currentCount);
            }
            else
                professionsCount.put(profession, 0);
        }
        System.out.println(mostFrequentProfession);
        for (Map.Entry<String, String> man : peoples.entrySet()) {
            String name = man.getKey();
            String profession = man.getValue();
            if (profession.equals(mostFrequentProfession))
                System.out.println(name);
        }
    }
}
