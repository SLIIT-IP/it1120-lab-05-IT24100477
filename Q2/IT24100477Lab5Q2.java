import java.util.Scanner;

public class IT24100477Lab5Q2 {
 public static void main (String[] args) {
 Scanner input = new Scanner(System.in);
 int newMembers = input.nextInt();
 System.out.print("enter the number of new members introduced: ");

 if (newMembers < 0) {
  System.out.println("input must be a number 0 or greater");
 }
 else {
  switch (newMembers) {
    case 0: System.out.print("no prize");
      break;
    case 1: System.out.print("prize is a: pen");
      break;
    case 2: System.out.print("prize is a: Umbrella"); 
      break;
    case 3: System.out.print("prize is a: Bag");
      break;
    case 4: System.out.print("prize is a: Travelling chair");
      break;
    default: System.out.print("prize is a: Headphone");
      break;
   }
  }
 }
}
   
 
    
 
 