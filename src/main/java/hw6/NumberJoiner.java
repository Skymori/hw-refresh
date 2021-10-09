package hw6;

public class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);
        }
        return result.toString();
    }
}
