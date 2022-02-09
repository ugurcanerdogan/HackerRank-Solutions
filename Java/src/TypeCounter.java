public class TypeCounter {
    public static void typeCounter(String sentence) {
        int doubleCounter = 0;
        int integerCounter = 0;
        int stringCounter = 0;
        String[] tokens = sentence.split("\\s+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            if (token.contains(".")) {
                doubleCounter++;
            } else {
                try {
                    Integer intVal = Integer.parseInt(token);
                    integerCounter++;
                } catch (NumberFormatException numberFormatException) {
                    stringCounter++;
                }
            }
        }
        System.out.println("string " + stringCounter);
        System.out.println("integer " + integerCounter);
        System.out.println("double " + doubleCounter);

    }
}
