package hw_6;

public class UniqueCharCounter {
    public int count(String phrase){
        String st = "";
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            String unique = phrase.substring(i, i+1);
            if (!st.contains(unique)){
                count++;
                st += unique;
            }
        }return count;
    }
}
