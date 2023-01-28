import java.util.Arrays;

public class FieldPrinter {

    private int length;

    public FieldPrinter(int length) {
        this.length = length;
    }
    public void printField(int[][] field){
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(field[i]));
        }
    }

}
