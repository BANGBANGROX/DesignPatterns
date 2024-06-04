import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int input = scanner.nextInt();
            ShapeFactory shapeFactory = new ShapeFactory();

            shapeFactory.setInput(input);

            if (shapeFactory.getShape() == null) {
                break;
            } else {
                shapeFactory.getShape().draw();
            }
        }
    }
}
