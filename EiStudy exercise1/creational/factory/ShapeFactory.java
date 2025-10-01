package creational.factory;

public class ShapeFactory {
    public static Shape createShape(String shapeType, double... dimensions) {
        if (shapeType == null) {
            return null;
        }

        switch (shapeType.toLowerCase()) {
            case "circle":
                if (dimensions.length < 1) {
                    throw new IllegalArgumentException("Circle requires radius!");
                }
                return new Circle(dimensions[0]);

            case "rectangle":
                if (dimensions.length < 2) {
                    throw new IllegalArgumentException("Rectangle requires width and height!");
                }
                return new Rectangle(dimensions[0], dimensions[1]);

            case "square":
                if (dimensions.length < 1) {
                    throw new IllegalArgumentException("Square requires side length!");
                }
                return new Square(dimensions[0]);

            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}

