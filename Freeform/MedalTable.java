import java.util.ArrayList;

public class MedalTable {
    public static void main(String[] args) {
        // initialize medal counts for each country
        int[][] counts = {
            {1, 0, 1},
            {1, 1, 0},
            {0, 0, 1},
            {1, 0, 0},
            {0, 1, 1},
            {0, 1, 1},
            {1, 1, 0}
        };
        
        // print medal table
        System.out.println("Country    Gold    Silver    Bronze  Total");
        int totalRow = counts.length;
        int totalCol = counts[0].length;
        for (int i = 0; i < totalRow; i++) {
            int rowTotal = 0;
            System.out.print("  ");
            for (int j = 0; j < totalCol; j++) {
                System.out.printf("%9d", counts[i][j]);
                rowTotal += counts[i][j];
            }
            System.out.printf("%9d", rowTotal);
            System.out.println();
        }
        
        // print medal counts
        System.out.println("          Total    Gold    Silver    Bronze   X");
        ArrayList<Integer> medalTotals = new ArrayList<>();
        for (int j = 0; j < totalCol; j++) {
            int colTotal = 0;
            for (int i = 0; i < totalRow; i++) {
                colTotal += counts[i][j];
            }
            medalTotals.add(colTotal);
            System.out.printf("%20d", colTotal);
        }
        System.out.print("X\n");
        
        // print medal totals
        System.out.print("                   ");
        for (int i = 0; i < totalCol; i++) {
            System.out.printf("%9d", medalTotals.get(i));
        }
    }
}