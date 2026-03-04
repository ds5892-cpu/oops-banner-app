import java.util.HashMap;
import java.util.Map;

public class BannerAppUC8 {

    static Map<Character, String[]> patternMap = new HashMap<>();

    // function to load patterns
    public static void loadPatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "*****  ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    // function to render banner
    public static void renderBanner(String word) {

        int height = patternMap.get('O').length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);
                line.append(pattern[i]).append("  ");

            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        loadPatterns();
        renderBanner("OOPS");

    }
}
