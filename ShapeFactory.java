
public class ShapeFactory {
   public Shape getShape(String name){
	   if(name == null){
		   return null;
	   }
	   else if(name.equalsIgnoreCase("CIRCLE")){
		   return new Circle();
	   }
	   else if (name.equalsIgnoreCase("Rectangle")){
		   return new Rectangle();
   }
	return null;
}
}
