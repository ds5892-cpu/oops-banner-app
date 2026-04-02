public class HelloAppUC6 {

    public static void main(String[] args) {

        // If no arguments → default
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            String result = "Hello, ";

            // enhanced for loop
            for (String name : args) {
                result += name + ", ";
            }

            // remove last comma and space using substring
            result = result.substring(0, result.length() - 2);

            System.out.println(result);
        }
    }
}
