/**
 * OOPSBannerApp
 * UC6: Render OOPS Banner using Static Methods
 *
 * @author YourName
 * @version 6.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[7];

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", o[i], o[i], p[i], s[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Pattern for letter O
    public static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Pattern for letter P
    public static String[] getPPattern() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Pattern for letter S
    public static String[] getSPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}