package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

import obj.Employee;



public class StreamDemo {
	
	public static void main(String[] args) {
			
		basicStream();

	}

	public static void basicStream()
	{
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(110);
		list.add(130);
		
		List<Integer> list2 = Arrays.asList(10,152,658,15);
		
		Stream<Integer> stream = list2.stream();
		
		
	
		// --- to print the stream ------
		
		// --- approach 1 through Any.. inner class
		stream.forEach(
				new Consumer<Integer>() {

					@Override
					public void accept(Integer t) {
						System.out.println(t);
						
					}
		
				}); // end of stream.ForEach
		
	
		// ---- approach 2 lambda 
		
		stream.forEach((t)->System.out.println(t));
		
		stream.forEach((m)->System.out.println(m));
				
		stream.max(
				new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						return o1-o2;
					}
				});
		
		stream.max((o1,o2)->
		{
			return o1-o2;
		});
		
		Stream<Integer> stream2 = Stream.of(1,25,85,96,78);
		Integer x =stream2.max((o1,o2)->o1.compareTo(o2)).get();
		
		System.out.println("MAX :- "+x);
		
		
		
	}//end of method 1
	
	

}//end class
















