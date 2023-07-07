public class HashPattern {
    public static void main(String[] args) 
    {
        

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= hc.getCount()) {
                    System.out.print(hc);
                }
            }
            if (i <= 4) {
                hc.incrementCount();
            } else {
                hc.incrementCount(-1);
            }
            System.out.println();
        }
    }
}
