package personalproject;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while(run){
	      Scanner input = new Scanner(System.in);
	      int a;
	      int b;
	      int c;
	      System.out.println("What would you like to do?"
	      		+ "\nSay \"add\" to add"
	      		+ "\nSay \"subtract\" to subtract"
	      		+ "\nSay \"multiply\" to multiply"
	      		+ "\nOr say \"divide\" to divide");
	      String i = input.nextLine();
	      if(i.equals("add")){
	    	  System.out.println("Please enter a number that you want to add.");
	    	  a = input.nextInt();
	    	  input.nextLine();
	    	  System.out.println("Please enter the number that you want to add to the first.");
		      b = input.nextInt();
		      input.nextLine();
		      c = a+b;
		      System.out.println("Here is the answer: " + c);
	      }
	      else if (i.equals("subtract")){
	    	  System.out.println("Please enter the number that you want to subtract from.");
	    	  a = input.nextInt();
	    	  input.nextLine();
	    	  System.out.println("Please enter a number that you want to subtract.");
		      b = input.nextInt();
		      input.nextLine();
		      c = a-b;
		      System.out.println("Here is the answer: " + c);
	      }
	      else if (i.equals("multiply")){
	    	  System.out.println("Please enter a number that you want to multiply.");
	    	  a = input.nextInt();
	    	  input.nextLine();
	    	  System.out.println("Please enter another number that you want to multiply.");
		      b = input.nextInt();
		      input.nextLine();
		      c = a*b;
		      System.out.println("Here is the answer: " + c);
	      }
	      else if (i.equals("divide")){
	    	  System.out.println("Please enter a number that you want to divide.");
	    	  a = input.nextInt();
	    	  input.nextLine();
	    	  System.out.println("Please enter the number that you want to divide by.");
		      b = input.nextInt();
		      input.nextLine();
		      c = a/b;
		      System.out.println("Here is the answer: " + c);
	      }
	      else{
	    	  System.out.println("Please enter a correct input.");
	      }
		}
	}
}