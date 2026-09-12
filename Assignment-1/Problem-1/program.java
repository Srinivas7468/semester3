import java.util.*;

public class RockPaperScissors {

    // Method to determine the result of one round
    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Win";
        }

        return "Loss";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int wins = 0;
        int losses = 0;
        int draws = 0;

        int N = 5;

        String[][] results = new String[N][4];

        for (int i = 0; i < N; i++) {

            System.out.println("\nRound " + (i + 1));
            System.out.print("Enter your move (Rock/Paper/Scissors): ");

            String playerMove = sc.nextLine();

            // Generate computer move randomly
            String computerMove = moves[random.nextInt(3)];

            // Determine result
            String result = playRound(playerMove, computerMove);

            // Store round details
            results[i][0] = String.valueOf(i + 1);
            results[i][1] = playerMove;
            results[i][2] = computerMove;
            results[i][3] = result;

            // Count results
            if (result.equals("Win")) {
                wins++;
            } else if (result.equals("Loss")) {
                losses++;
            } else {
                draws++;
            }

            System.out.println("Computer Move: " + computerMove);
            System.out.println("Result: " + result);
        }

        // Display summary table
        System.out.println("\n========== FINAL SCOREBOARD ==========");

        System.out.printf("%-8s %-15s %-17s %-10s%n",
                "Round", "Player Move", "Computer Move", "Result");

        System.out.println("------------------------------------------------");

        for (int i = 0; i < N; i++) {
            System.out.printf("%-8s %-15s %-17s %-10s%n",
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    results[i][3]);
        }

        // Calculate win percentage
        double winPercentage = ((double) wins / N) * 100;

        System.out.println("\n========== SCORE SUMMARY ==========");
        System.out.println("Wins   : " + wins);
        System.out.println("Losses : " + losses);
        System.out.println("Draws  : " + draws);
        System.out.printf("Win Percentage : %.2f%%%n", winPercentage);

        sc.close();
    }
}
