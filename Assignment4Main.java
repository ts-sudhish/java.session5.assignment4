/**
 * 
 */
package sdh.java.session5;

/**
 * @author Sudhish
 * 
 */
public class Assignment4Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4Bank s = new Assignment4SBI();
		Assignment4Bank i = new Assignment4ICICI();
		Assignment4Bank a = new Assignment4AXIS();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
	}

}
