import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CaseConverter {
    public static void main(String[] args) {
        // Test
//        System.out.println(snakeToCamel(" "));
//        System.out.println(snakeToCamel("hello__world"));
        System.out.println(camelToSnake("HelloWorld"));
    }

    private static String snakeToCamel(String input) {
        /*
         * Logic
         * 1. trim all spaces.
         * 2. split everything on the base of "_".
         * 3. Start the loop.
         * 4. if first word, convert everything to lowercase.
         * 5. convert first char to upper case and append.
         */
        // Clean input once upfront — replace spaces, trim underscores
        String cleaned = input.trim().replace(" ", "");
        String[] allWords = cleaned.split("_");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < allWords.length; i++) {
            String word = allWords[i];

            if (word.isEmpty()) {
                continue;  // skip empty chunks from leading/double underscores
            }

            if (i == 0) {
                // first word stays lowercase
                result.append(word.toLowerCase());
            } else {
                // capitalize first letter, keep rest as-is
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
            }
        }

        return result.toString();
    }

    private static String camelToSnake(String input){
        /*
        * Logic
        * 1. trim all spaces
        * 2. Loop through the whole string, and check if an uppercase letter exists, change it to lowercase and add "_" before it.
        * */
        String cleaned = input.trim().replace(" ", "");
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < cleaned.length(); i++){
            char currentChar = cleaned.charAt(i);

            if(Character.isUpperCase(currentChar)){
                if(i > 0){
                    result.append("_");
                }
                result.append(Character.toLowerCase(currentChar));
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
