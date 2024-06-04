import java.util.Scanner;

public class ShapeFactory {
    private int input;

    public void setInput(int input) {
        this.input = input;
    }

    public Shape getShape() {
        return input == 1 ? new Rectangle() : input == 2 ? new Square() : input == 3 ? new Circle() : null;
    }
}
