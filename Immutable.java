
public class Immutable {
	
	public static void main(String [] args){
		
		String name="daniel";
		name.concat("haile");
		System.out.println(name);
		
		StringBuilder A =new StringBuilder();
		A.append("one");
		System.out.println(A);
		
		StringBuffer B = new StringBuffer();
		B.append("test");
		B.append("Buffer");
		System.out.println(B);
		
		char[] ch={'A','B','C'};
		System.out.println(ch);
		String test= new String(ch);
		System.out.print(test);
		
	}

}
