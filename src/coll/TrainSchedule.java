package coll;

import java.util.TreeSet;

public class TrainSchedule {

	public static void main(String[] args) {
		TreeSet<Double> trainSchedule = new TreeSet<Double>();
		trainSchedule.add(7.0); // train time 
		trainSchedule.add(7.30);
		trainSchedule.add(8.10);
		trainSchedule.add(8.30);
		trainSchedule.add(8.50);
		trainSchedule.add(9.15); 
		trainSchedule.add(9.30);
		trainSchedule.add(10.05);
		trainSchedule.add(10.15);
		 

		System.out.println(" \n -------- Methods Apply on  TreeSet Directly ------\n");
		 System.out.println("Train Just before 8:50 : " + trainSchedule.lower(8.50));
		 System.out.println("Train Just After 8.50  : " + trainSchedule.higher(8.50));

		
		
		 TreeSet<Double> subset = new TreeSet<Double>();
		 subset = (TreeSet)trainSchedule.headSet(10.0);
		 System.out.println("\n\n\n------------SubSet collection Head Set -----------\n ");
		 System.out.println("All Trains Before 10AM \n"+subset+" No of Trains :- "+subset.size());
		 System.out.println("Train before 10AM is: " + subset.last());
		 
		 
		 
		 TreeSet<Integer> subset2 = new TreeSet<Integer>();
		 subset2 = (TreeSet)trainSchedule.tailSet(10.0);
		 System.out.println("\n\n\n------------SubSet collection  Tail Set -----------\n ");
		 System.out.println("Trains After 10 AM :\n " + subset2+" No of Trains :- "+subset2.size());
		 System.out.println("Next Trains  10 AM : " + subset2.first());
		 
		 
	
	}
}
