package Title;

public class VerifyTitle extends Library{

	public VerifyTitle() {
		super();
	}
	
	public static void main(String[] args) {
		Library li=new Library();
		
	li.enterUrl("https://www.facebook.com");
		 
		li.compare(title, "Facebook – log in or sign up");
		
	
	}

}
