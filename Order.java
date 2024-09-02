import java.text.DateFormat;
import java.util.Date;

public class Order{
	Date now = new Date();
	DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
	String time = defaultDate.format(now);
	private String name;
	private Sandwich mySandwich;
	
	public void setName(String n) {
		name=n;
	}
	public void setSandwich(Sandwich m) {
		mySandwich=m;
	}
	public String orderData() {
		String o=time + " " + name + "\n" + mySandwich.SandwichData();
		return o;
	}
}
