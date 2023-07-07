
import java.util.ArrayList;
import java.util.Random;

import java.util.Scanner;

public class SquidGame {

    private String glass = "0";
    private static final String TEMPERED_GLASS = "1";

    private int lives;
    private int[][] ladder;
    private ArrayList<Integer> selections;

    public SquidGame(int numPanels, int numLives) {
        this.lives = numLives;
        this.ladder = new int[numPanels][2];
        this.selections = new ArrayList<Integer>();

        // initialize ladder with random glass/tempered glass
        Random rand = new Random();
        for (int i = 0; i < numPanels; i++) {
            for (int j = 0; j < 2; j++) {
                ladder[i][j] = rand.nextInt(2);
            }
        }
    }

    public int getLives() {
        return lives;
    }

    public void death() {
        lives--;
    }

    public void printLadder() {
        // print start of ladder
        System.out.println("|||||| ---- Start");

        // print each panel of ladder
        for (int i = 0; i < ladder.length; i++) {
            System.out.print("|");
            for (int j = 0; j < ladder[i].length; j++) {
                if (selections.size() > i && selections.get(i) == j) {
                    // user has selected this panel
                    System.out.print("X|");
                } else if (ladder[i][j] == 0) {
                    // glass
                    System.out.print(GLASS + "|");
                } else {
                    // tempered glass
                    System.out.print(TEMPERED_GLASS + "|");
                }
            }
            System.out.println();
        }

        // print end of ladder
        System.out.println("|||||| ---- Finish");
    }

    public int getUserSelection() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your selection (R or L): ");
            String input = sc.nextLine().toLowerCase();
            if (input.equals("r")) {
                return 1;
            } else if (input.equals("l")) {
                return 0;
            } else {
                System.out.println("Invalid selection. Please enter R or L.");
            }
        }
    }

    public void playGame() {
        int currentPanel = 0;

        while (currentPanel < ladder.length) {
            // print current ladder
            printLadder();

            // get user selection
            int selection = getUserSelection();
            selections.add(selection);

            // check if selection is correct
            if (ladder[currentPanel][selection] == 1) {
                // move to next panel
                currentPanel++;
            } else {
                // decrement lives
                death();

                // check if game over
                if (lives == 0) {
                    System.out.println("You Lost!");
                    System.out.println("Total Lives: " + getLives());
                    return;
                }
            }
        }

        // reached end of ladder, print final ladder and congrats message
        printLadder();
        System.out.println("Congrats, You Won!");
    }

    public static void main(String[] args) {
        SquidGame game = new SquidGame(3, 3);
        game.playGame();
    }
}