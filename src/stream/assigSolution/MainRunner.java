package stream.assigSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;



public class MainRunner {

	/*
	 *   Requirement (to be done by stream API only through both approach anonymous inner class & lambda expression)
	 *   1. Update email on the basis of accountNumber  
	 *   2. display Account based on maximum sumAssuredAmount
	 *   3. update premium amount of all medical policies by 10%
	 *   4. filter accounts based on following (display there accountnumber , name and phoneNumber through separate bean class) 
	 *      4.a ) state and policyname
	 *      4.b) state and premiumAmount (higher than certain amount) and total balance
	 *   
	 * */
	public static List<Account> accountList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Policy p1 = new Policy(new Random().nextInt(6000),"Medical Policy-1",2000,8888);
		Policy p2 = new Policy(new Random().nextInt(6000),"Car Policy-1",2000,9999);
		Policy p3 = new Policy(new Random().nextInt(6000),"Medical Policy-2",2500,13000);
		Policy p4 = new Policy(new Random().nextInt(6000),"Term Policy-1",2000,4000);
		
		ContactDetails c1 = new ContactDetails("123-New Delhi","Delhi",1212122,"abc@gmail.com");
		ContactDetails c2 = new ContactDetails("454-New Delhi","Delhi",45412122,"xyz@gmail.com");
		
		
		addAccount(101,"Ramesh", Arrays.asList(p1,p2,p3), 5000, c1);
		addAccount(102,"Mike", Arrays.asList(p1,p4), 15000, c2);
		displayAll();
		displayMaxsumAssuredAmount();
	}
	public static void addAccount(int accountNumber,String name,List<Policy> policyList,int balance,ContactDetails contactDetails)
	{
		
		Account a = new Account();
		a.setAccountNumber(accountNumber);
		a.setAccountHolderName(name);
		a.setBalance(balance);
		a.setPolicies(policyList);
		a.setContactDetails(contactDetails);
		accountList.add(a);
	} 
	
	public static void displayMaxsumAssuredAmount()
	{
		System.out.println("\n\n\n ------- inside max sa details ---");
		Comparator<Policy> policyMaxComprator = (pol1,pol2)->pol1.getSumAssuredAmount()-pol2.getSumAssuredAmount();
		Map<Account, Integer> maxSAMap = new HashMap<>();
		
		accountList.stream().forEach((a)->{
			Policy  maxPolicy = a.getPolicies().stream().max(policyMaxComprator).get();
			maxSAMap.put(a, maxPolicy.getSumAssuredAmount());
		});
		
		System.out.println(maxSAMap);
		Comparator<Map.Entry<Account, Integer>> saComp = (entry1,entry2)->entry1.getValue().compareTo(entry2.getValue());
		
		
		Entry<Account,Integer> entry =  maxSAMap.entrySet().stream().max(saComp).get();
		System.out.println(" Max Sum Assured Account Details ");
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		
		
	}
	
	
	public static void displayAll()
	{
		accountList.stream().forEach((a)->System.out.println(a));
	}
	
}
