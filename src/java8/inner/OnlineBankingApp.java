package java8.inner;

import java.util.*;

interface SecurityCheck {
public boolean verify(String username,String password);
} 


public class OnlineBankingApp {
	static Map<String, String> userdetails;

	public OnlineBankingApp() {
		userdetails = new HashMap<>();
		userdetails.put("Ramesh", "abc");
		userdetails.put("Suresh", "xyz");
	}

	public static void main(String[] args) {
		
		OnlineBankingApp app = new OnlineBankingApp();
		
		boolean verification = app.login("Rameshdf", "abc");
		System.out.println("Login "+verification);
	}

	public boolean login(String username,String password) {
		SecurityCheck sc=new SecurityCheck() {
			public boolean verify(String username,String password) {
				
				String savePassword=userdetails.get(username);
				System.out.println("===>> saved Password "+savePassword);
				if(savePassword != null & savePassword.equals(password)) 
					return true;
				
				else 
					return false;
				
			}
			
		};
		boolean result = sc.verify(username, password);
		return result;
	}

} 