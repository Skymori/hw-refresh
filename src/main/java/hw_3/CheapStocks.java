package hw_3;

public class CheapStocks {
    public String getCheapStocks(String[] stocks){
        String[] newSplit;
        String res = "";
        for (String st : stocks){
            newSplit = st.split(" ");
            if (Integer.valueOf(newSplit[1]) < 200){
                if (res.equals("")) res += newSplit[0];
                else res += " " + newSplit[0];
            }
        }return res;
    }
}
