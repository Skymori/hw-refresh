package hw_6;

public class ObjectWorker {
    public String join(Object[] objects) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < objects.length; i++) {
            result.append(objects[i]);

            if (i != objects.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
