package Interfaces;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String Logg) {
		// TODO Auto-generated method stub
		System.out.println("***"+ Logg + "***");
	}

	@Override
	public void Error(String err) {
		// TODO Auto-generated method stub
		System.out.println("**********");
		System.out.println("***"+ "ERROR:"+ err + "***");
		System.out.println("**********");
	}

}
