package hw2;

public class ExonNames {
    public boolean areNamesEqual(String name1, String name2){
        return name1 == name2;
    }
    public String makeFullName(String firstName, String lastName){
        return firstName.toLowerCase()+" "+lastName.toUpperCase();
    }
    public boolean isNameLucky(String name){
        return !name.contains("A")|| !name.contains("O");
    }
    public String getNameCode(String name){
        return name.substring(0,1).toUpperCase()+name.substring(name.length()-1).toUpperCase();
    }
    public boolean isMoneyName(String name){
        return name.charAt(0) >= '0' || name.charAt(name.length()-1) >= 0;
    }
    public boolean isInvisibleName(String name){
        return name.isBlank();
    }
    public String makeNamePositive(String name){
        return name.replace("no","yes")
                   .replace("No", "yes")
                   .replace("NO", "yes")
                   .replace("nO", "yes");
    }
    public String makeNameClean(String name){
        return "CLEAN"+name.strip()+"CLEAN";
    }
    public String makeHalfOfName(String name){
        return name.substring(0, name.length()/2);
    }
    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);
    }
}