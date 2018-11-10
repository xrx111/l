package lay;

public class Singleton {
	private static Singleton INSTANCE;
	private Singleton() {};
	
	public static synchronized Singleton getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new Singleton();
		}
		System.out.println();
		return INSTANCE;
		
	}
}
