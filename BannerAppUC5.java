public class Main {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", " ", "B", "A", "N", " ", "*"),
                String.join("", "*", " ", "N", "E", "R", " ", "*"),
                String.join("", "*", " ", "A", "P", "P", " ", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
