
package testPackage2;


public class Security {
	public String username = "test";
	private String password = "ing" ; 
	
	//public static void main(String[] args) {
	//	Security sy = new Security();
	//	sy.login("tst","ing");
		
		
	//}
	
	public void login (String un, String pw) {
		
		if (un == username && pw == password) {
			
			System.out.println("Logged in"); 
				
			} else {
				
				System.out.println("Invalid details");
			}
			
			
		}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
	


}
