package hw3;

public class HarekDataMaker {
    public String aggregateSingle(String name, String age, String planet){

        return "name - "+name+", age - "+ age+", planet - "+ planet;
    }
    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        String [] s = new String[3];
        for (int i = 0; i < 3; i++) {
            s[i] = aggregateSingle(names[i], Integer.toString(ages[i]), planets[i]);
        }
    return s;
    }
}
