public class TwoAndThreeDShapeFactory implements ShapeFactoryFactory {

    @Override
    public ShapeFactory getShapeFactory(int input) {
        return input == 1 ? new TwoDShapeFactory() : new ThreeDShapeFactory();
    }
}
