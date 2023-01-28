import java.util.Random;

public class FieldGenerator {

    private int length;
    private int width;

    private int shipsPerField;

    public FieldGenerator(int length, int width, int shipsPerField) {
        this.length = length;
        this.width = width;
        this.shipsPerField = shipsPerField;
    }

    public int[][] generate() {
        Random random = new Random();
        int[][] field = new int[length][width];

        int countOfShips = 0;
        while (countOfShips < shipsPerField) {
            int a = random.nextInt(0, length - 1);
            int b = random.nextInt(0, width - 1);
            boolean horizontal = random.nextBoolean();

            if (horizontal) {
                if (checkCollisionHorizontal(field, a, b)) {
                    field[a][b] = 2;
                    field[a][b + 1] = 2;
                    countOfShips++;
                }
            } else {
                if (checkCollisionVertical(field, a, b)) {
                    field[a][b] = 2;
                    field[a + 1][b] = 2;
                    countOfShips++;
                }
            }

        }
        return field;
    }

//        for (int i = 0; i < 10; i++) {
//
//            int a = random.nextInt(0, 10);
//            int b = random.nextInt(0, 10);
//
//            field[a][b] = 1;
//        }






    private boolean checkCollisionHorizontal(int[][] field, int a, int b){
      return field[a][b] == 0 && field[a][b + 1] == 0;
    }

    private boolean checkCollisionVertical(int[][] field, int a, int b){
        return field[a][b] == 0 && field[a + 1][b] == 0;
    }

    }




