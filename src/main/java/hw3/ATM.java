package hw3;

public class ATM {
    public int countBanknotes(int sum){
        int sumNominal = 0;
        int count = 0;
        int [] nominates = {500,200,100,50,20,10,5,2,1};
        while (count<nominates.length){
            sumNominal+= sum/nominates[count];
            sum%=nominates[count];
            count++;
        }
        return sumNominal;
    }
}
//public class ATM {
//    public int countBanknotes(int sum){
//        int sumNominal = 0;
//        int [] nominates = {500,200,100,50,20,10,5,2,1};
//        for (int nominal : nominates){
//            sumNominal +=  sum / nominal;
//            sum %=nominal;
//        }return sumNominal;
//    }
//}