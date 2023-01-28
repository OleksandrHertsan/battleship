public class Main {
    public static void main(String[] args) {
        int length = 10;
        int width = 10;
        int tries = 3;
        double coef = 0.1;
        int shipsPerField = (int) (length * width * coef);


        FieldGenerator fieldGenerator = new FieldGenerator(length, width, shipsPerField);
        int[][] field = fieldGenerator.generate();

        Game game = new Game(field, length, width, tries);
        game.start();

        FieldPrinter fieldPrinter = new FieldPrinter(length);
        fieldPrinter.printField(field);
    }
}