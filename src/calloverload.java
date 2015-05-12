
public class calloverload {

	public static overloadtrial obj;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num3 = 6;
		int num4 = 8;
	
		float f1 = 56.7f;
		float f2 = 52.9f;		
		
		 obj = new overloadtrial(); 
		obj.add(num3,num4);

		obj.add(f1,f2);

	}

}
