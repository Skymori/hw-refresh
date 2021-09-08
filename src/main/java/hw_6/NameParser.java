package hw_6;

public class NameParser {
    public String parse(String[] names) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < names.length; i++) {
            String firstName = names[i].split(" ")[0];

            result.append(firstName);
            if (i != names.length - 1) {
                result.append(", ");
            }
        }

        return result.toString();
    }
}