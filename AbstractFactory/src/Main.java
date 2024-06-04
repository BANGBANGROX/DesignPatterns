public class Main {
    public static void main(String[] args) {
        ShapeFactoryFactory twoAndThreeDShapeFactory = new TwoAndThreeDShapeFactory();
        ShapeFactory twoDFactory = twoAndThreeDShapeFactory.getShapeFactory(1);
        ShapeFactory threeDFactory = twoAndThreeDShapeFactory.getShapeFactory(2);

        twoDFactory.getShape(1).draw(); // prints Square
        twoDFactory.getShape(2).draw(); // prints Circle
        threeDFactory.getShape(1).draw(); // prints Cube
        threeDFactory.getShape(2).draw(); // prints Sphere
    }
}
