package lamdaExpression;

public class withoutLamdaExpressionClass implements Drawable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int width=10;
		 int hieght =20;
		  
	        //without lambda, Drawable implementation using anonymous class  
		 Drawable d = new Drawable(){  
	            public void draw(){System.out.println("Drawing width : " +width + " , " + "Drawing hieght: " +hieght);}  
	        };  
	        d.draw();  

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}
