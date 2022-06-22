package lamdaExpression;

public class withSingleParameterLamdaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Lambda expression with single parameter. 
		Sayable s1 = (name) -> {
			return "Hello, " + name;
		};
		
		System.out.println(s1.say("Krish are u here me now..."));
		
		// You can omit function parentheses
		Sayable s2 = name -> {
			return "Hello, " + name;
		};
		
		System.out.println(s2.say("Krish are u here me now..."));

	}

}
