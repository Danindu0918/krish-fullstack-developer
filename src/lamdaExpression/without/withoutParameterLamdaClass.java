package lamdaExpression.without;

public class withoutParameterLamdaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sayable s=()->{
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }


}
