public class TwoDShapeFactory implements ShapeFactory {
    @Override
    public Shape getShape(int input) {
        return input == 1 ? new Square() : new Circle();
    }
}
