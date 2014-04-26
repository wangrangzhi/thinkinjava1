// typeinfo/Shapes3.java
// TIJ4 Chapter Typeinfo, Exercise 3, page 561
/* Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a Shape,
* then downcast it back to a Rhomboid. Try downcasting to a Circle and
* see what happens.'
*/
import java.util.*;

abstract class Shape {
	void draw() { System.out.println(this + ".draw()"); }
	abstract public String toString();
}

class Circle extends Shape {
	public String toString() { return "Circle"; }
}

class Square extends Shape {
	public String toString() { return "Square"; }
}

class Triangle extends Shape {
	public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape
{
	public String toString(){return "Rlh"; }
}

public class Shapes {

	public static void rotate(Shape s)
	{
		if(!(s instanceof Circle))
			System.out.println(s+"draw");
	}

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Triangle());

			for(Shape shape : shapeList)
		shape.draw();

	for(Shape shape : shapeList)
		rotate(shape);
	}







}