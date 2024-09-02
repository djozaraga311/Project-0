import java.util.ArrayList;
public class Sandwich {
	private String bread,vegetable,meat;
	private ArrayList<String> vegetables = new ArrayList<String>();
	private ArrayList<String> meats = new ArrayList<String>();
	private double sum=0;
	public void setBread(int n) {
		switch (n) {
		case 1: 
			bread="White Bread";
			sum+=1.5;
			break;
		case 2: 
			bread="Wheat Bread";
			sum+=1.6;
			break;
		case 3: 
			bread="French Bread";
			sum+=1.8;
			break;
		case 4:
			bread="Organic Bread";
			sum+=2.0;
		}
	}
	public void setVegetable(int n) {
		switch (n) {
		case 1: 
			vegetable="red onions";
			sum+=.05;
			vegetables.add(vegetable);
			break;
		case 2: 
			vegetable="olives";
			sum+=.10;
			vegetables.add(vegetable);
			break;
		case 3: 
			vegetable="pickles";
			sum+=.10;
			vegetables.add(vegetable);
			break;
		case 4: 
			vegetable="lettuce";
			sum+=.20;
			vegetables.add(vegetable);
			break;
		case 5: 
			vegetable="green peppers";
			sum+=.25;
			vegetables.add(vegetable);
			break;
		case 6: 
			vegetable="tomatoes";
			sum+=.30;
			vegetables.add(vegetable);
			break;
		case 7: 
			vegetable="cheese";
			sum+=.49;
			vegetables.add(vegetable);
			break;
		case 8:
			break;
		}
	}
	public void setMeat(int n) {
		switch(n) {
		case 1:
			meat="Ham";
			sum+=1.0;
			meats.add(meat);
			break;
		case 2:
			meat="Roasted Chicken Breast";
			sum+=1.1;
			meats.add(meat);
			break;
		case 3:
			meat="Turkey Breast";
			sum+=1.2;
			meats.add(meat);
			break;
		case 4:
			meat="Roast Beef";
			sum+=1.5;
			meats.add(meat);
			break;
		case 5: 
			break;
		}
	}

	public String SandwichData() {
		String list = "";
		list+=bread + ", ";
		for(int i=0;i<vegetables.size();i++) {
			list+=vegetables.get(i) + ", ";
		}
		for(int i=0;i<meats.size();i++) {
			list+=meats.get(i) + ", ";
		}
		list+="$" + sum;
		return list;
	}
}

