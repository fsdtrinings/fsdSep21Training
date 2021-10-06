package threads.assign;

// Class handles the user traffic and book the seat
// 1st use case :-  each user one seat
// 2nd use case :-  each user max 6 seats
public class BookingAppController {

	Seat arr[];
	
	public BookingAppController() {
		arr = new Seat[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = new Seat(i++, false);
		}
	}
	
	public void bookSeat(String username)
	{
		// generate random seat number
		// code to book the seat
		// print ticket
		
	}
}
