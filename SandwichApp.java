import java.io.IOException;
import java.util.Scanner;
public class SandwichApp {

	public static void main(String[] args) throws IOException {
		Scanner key = new Scanner(System.in);
		Sandwich me = new Sandwich();
		char answer = 'y';
		String name;
		int choiceBread,choiceVeggie,choiceMeat;
		do {
			System.out.println("===Select Sandwich Bread===");
			System.out.print("1. White Bread $1.5\n"
					+ "2. Wheat Bread $1.6\n" 
					+ "3. French Bread $1.8\n"
					+ "4. Organic Bread $2.0\n"
					+ "Select a bread [1,4]\n");
			do {
				choiceBread=key.nextInt();
				if (choiceBread<1) {
					System.out.println("Error! Number must be greater than 0");
					choiceBread=key.nextInt();
				}
				else if (choiceBread>4) {
					System.out.println("Error! Number must be less than 4.");
				}
				else {
					me.setBread(choiceBread);
				}
			}while (choiceBread<1 || choiceBread>4);
			
			System.out.println("===Select Sandwich Vegetable===");
			System.out.print("1. red onions $0.05\n"
					+ "2. olives $0.10\n" 
					+ "3. pickles $0.10\n"
					+ "4. lettuce $0.20\n"
					+ "5. green peppers $0.25\n"
					+ "6. green peppers $0.30\n"
					+ "7. cheese $0.50\n"
					+ "8. Quit vegetable selection\n"
					+ "Select a vegetable [1,8]\n");
			do {
				choiceVeggie=key.nextInt();
				if(choiceVeggie<1) {
					System.out.print("Error! Number must be greater than 0.");
					choiceVeggie=key.nextInt();
				}
				else if(choiceVeggie>8) {
					System.out.println("Error! Number must be less than 8.");
					choiceVeggie=key.nextInt();
				}
				else {
					me.setVegetable(choiceVeggie);
				}
			}while(choiceVeggie!=8);
			
			System.out.println("===Select Sandwich Meat===");
			System.out.print("1. Ham $1.0\n"
					+ "2. Roasted Chicken Breast $0.10\n" 
					+ "3. Turkey Breast $1.2\n"
					+ "4. Roast Beef $1.5\n"
					+ "5. Quit meat selection\n"
					+ "Select a meat [1,5]\n");
			do {
				choiceMeat=key.nextInt();
				if(choiceMeat<1) {
					System.out.print("Error! Number must be greater than 0.");
					choiceMeat=key.nextInt();
				}
				else if(choiceMeat>5) {
					System.out.println("Error! Number must be less than 8.");
					choiceMeat=key.nextInt();
				}
				else {
					me.setMeat(choiceMeat);
				}
			}while(choiceMeat!=5);
			Order my = new Order();
			my.setSandwich(me);
			System.out.println("What name would you like on your order?");
			key.nextLine();
			name=key.nextLine();
			my.setName(name);
			System.out.println(my.orderData());
			System.out.println();
			
			SandwichIO.writeToFile(my.orderData());
			
			System.out.println("Would you like add another sandwich? (y/n)");
			answer=key.next().charAt(0);
			Character.toLowerCase(answer);
			if(answer!='y') {
				System.out.println("Done!");
			}
	}while(answer=='y');
}
}


