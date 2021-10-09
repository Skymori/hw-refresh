package hw3;

public class UberShop {
//    public void printPrices(float[] prices) {
//        for (int i = 0; i < prices.length; i++) {
//            System.out.println(prices[i] + " jup.");
//        }
//    }
    public void printPrices(float[] prices){
        for (float price : prices){
            System.out.println(price + " jup.");
        }
    }
    public void multiplyPrices(float[] prices){
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]< 1000){
            prices[i] *=2;
            }else prices [i] *= 1.5;
        }
        }
    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }
        int min = prices[0];
        int max = prices[0];
        for(int price: prices) {
            if (price > max) {
                max = price;
            } if (price < min) {
                min = price;
            }
        } if (min == max) {
            return new int[] {min};
        }
        return new int[] {min, max};
    }
    public int getMinPriceCount(int[] prices){
        if (prices.length == 0){
            return 0;
        } if (prices [0] == prices[1]){
            return prices.length;
        }
        int min = prices[0];
        for (int price : prices){
            if (price < min){
                min = price;
            }
        }
        int count = 0;
        for (int price : prices){
            if (min == price){
                count++;
            }
        }return count;
    }
    public int[] removePrice(int[] prices, int toRemove){
        int toRemoveCount = 0;
        for (int price : prices){
            if (price == toRemove){
                toRemoveCount++;
            }
        }
        int [] newPrices = new int[prices.length - toRemoveCount];
        int count = 0;
        for (int price : prices){
            if (price != toRemove){
                newPrices[count] = price;
                count++;
            }
        }return newPrices;
    }
    public int[] leavePrice9(int[] prices){
        int toPrice9 = 0;
        for (int price : prices){
            if (price % 10 == 9){
                toPrice9++;
            }
        }
        int [] newPrice9 = new int[toPrice9];
        int count = 0;
        for (int price : prices){
            if (price %10 == 9){
                newPrice9[count] = price;
                count++;
            }
        }return newPrice9;
    }
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks){
        String [] newMerge = new String[showcaseStocks.length+ warehouseStocks.length];
        int count = 0;
        for (String st : showcaseStocks){
            newMerge[count] = st;
            count++;
        }
        for (String st : warehouseStocks){
            newMerge[count] = st;
            count++;
        }return newMerge;
    }
    public int getPricesSum(int[] prices, int minPrice, int maxPrice){
        int sum = 0;
        for (int price : prices){
            if (price >=minPrice && price<=maxPrice){
                sum += price;
            }
        }return sum;
    }
    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        float[] prices = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices);
    }
}
