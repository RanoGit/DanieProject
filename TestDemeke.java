import java.util.Scanner;

public class TestDemeke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="AnnA";
		System.out.print(palandrom(name));
}
	
	public static boolean palandrom(String paland){
		StringBuilder front=new StringBuilder();
		StringBuilder back=new StringBuilder();
		String frontStr = null;
		String backStr = null;
		int lenght=paland.length();
		System.out.println(lenght);
		for(int i=0;i<lenght;i++){
			frontStr=front.append(paland.charAt(i)).toString();
		};
		System.out.println(frontStr);
		//(int i = anyString.length()-1; i>=0; i--)
		for(int i=lenght-1;i>=0;i--){
			backStr=back.append(paland.charAt(i)).toString();
		};
		System.out.println(backStr);
		if(frontStr.equals(backStr)){
			return true;
		}
		return false;
	}
}
