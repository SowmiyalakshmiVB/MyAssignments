package Week2.day1;

public class Browser {
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched succesfully");
		return browserName;
	}
		
		public void loadUrl() {
			System.out.println("Application url loaded successfully");
		}
		public static void main(String[]args) {
			Browser browseroptions=new Browser();
			browseroptions.launchBrowser("Google");
			browseroptions.loadUrl();
			
		
		}
		
	}

