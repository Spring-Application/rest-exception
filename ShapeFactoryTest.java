
public class ShapeFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shape = new ShapeFactory();
		Shape shape1 = shape.getShape("Circle");
		Shape shape2 = shape.getShape("Rectangle");
         shape1.draw();
         shape2.draw();
	}

}
