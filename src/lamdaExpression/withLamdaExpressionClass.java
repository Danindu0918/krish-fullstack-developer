package lamdaExpression;

public class withLamdaExpressionClass {
	
	public static void main(String[] args) {
		int width = 10;
		int hieght = 20;
		
		Drawable d2 = () ->{
			System.out.println("Drawing width : " + width + " , " + "Drawing hieght : " + hieght);
		};
		
		d2.drwa();
	}

}
