package teamgen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());

        if (args.length == 2) {
            String a = args[0];
            String[] b = a.split(",");
            int c = Integer.parseInt(args[1]);

            List<String> shuffledNames = Arrays.asList(b); // Modified: Shuffle the names
            Collections.shuffle(shuffledNames);

            List<List<String>> d = new ArrayList<>();
            int e = (int) Math.ceil(shuffledNames.size() / (double) c);

            for (int f = 0; f < e; f++) {
                int g = f * c;
                int h = Math.min(g + c, shuffledNames.size());
                List<String> i = shuffledNames.subList(g, h); // Modified: Use shuffled names
                d.add(i);
            }

            for (int j = 0; j < d.size(); j++) {
                System.out.println("Team " + (j + 1) + ": " + d.get(j));
            }
        } else {
            System.out.println("인자를 정확히 두 개 입력해주세요.");
        }
    }
}
