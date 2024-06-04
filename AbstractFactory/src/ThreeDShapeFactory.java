public class ThreeDShapeFactory implements ShapeFactory {
    @Override
    public Shape getShape(int input) {
        return input == 1 ? new Cube() : new Sphere();
    }
}
