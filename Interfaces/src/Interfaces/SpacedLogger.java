package Interfaces;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String Logg) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<Logg.length();i++) {
			System.out.print(Logg.charAt(i)+" ");
		}
		//for(String t:newArr) {
		//	System.out.print(t);
		//}
		
	
		
	}

	@Override
	public void Error(String err) {
		// TODO Auto-generated method stub
		String news= "";
		
		for (int i=0;i<err.length();i++) {
			news= news+" "+ err.charAt(i);
			//System.out.print( err.charAt(i)+" ");
		}
		System.out.print("ERROR: " + news);
		
	}

}
