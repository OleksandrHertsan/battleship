import java.util.Scanner;

public class Game {

    private int[][] field;

    private int length;
    private int width;

    private int tries;

    public Game(int[][] field, int length, int width, int tries) {
        this.field = field;
        this.length = length;
        this.width = width;
        this.tries = tries;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int points = 0;

        for (int i = 0; i < tries; i++) {

            int first = scanner.nextInt();
            int second = scanner.nextInt();

            if (first < length && second < width && first >= 0 && second >= 0) {

                int shot = field[first][second];

                if (shot == 0) {
                    System.out.println("You miss");
                }
                else if (shot == -1) {
                    System.out.println("You shoot there dumbass");
                }
                else {

                    System.out.println("Nice shot");
                    points++;
                    field[first][second] = -1;
                }


            }
            else {
                System.out.println("Что-то куда-то не туда");
            }

        }
        System.out.println("You achived " + points + " points");
    }
}

