import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * UC8: Use Map for Character Patterns
 *
 * @author YourName
 * @version 8.0
 */

public class OOPSBannerApp {

    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patterns.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patterns.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return patterns;
    }

    public static void printBanner(String word) {

        Map<Character, String[]> patterns = createPatternMap();

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(patterns.get(c)[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        printBanner("OOPS");

    }
}