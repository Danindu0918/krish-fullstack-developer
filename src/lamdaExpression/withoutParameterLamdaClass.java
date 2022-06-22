package lamdaExpression;

public class withoutParameterLamdaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s = () ->{
			return "I can't here u....";
		};
		
		System.out.println(s.say());

	}

}
