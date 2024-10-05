import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    
  Food jacob = new Food();
  Food Jacoby = new Food("test", 10.99, true, false);

  //System.out.println(jacob);
  System.out.println("-------");
 // System.out.println(Jacoby);
  System.out.println("-------");
  Spaghetti test = new Spaghetti();
  //System.out.println(test);

    
System.out.println("Welcome to Jollibee! Please select your order: \n1. ChickenJoy\n2. Spaghetti");
    int choice = input.nextInt();
  if(choice == 1){ //If user chooses ChickenJoy
    System.out.println("What Size? \n1. 4 Piece\n2. 6 Piece");
    int i1 = input.nextInt();
    String name1 = "";
    boolean fries = false;
    boolean takeOut = false;
    boolean gravy = false;
    int amount;
    if(i1 == 1){ //User chooses 1 if they want a 4 piece
      name1 = "4 Piece";
      
    }else{ //User chooses 2 if they want a 6 piece
      name1 = "6 Piece";
    }
    System.out.println("Do you want fries? \n1. Yes\n2. No");
    if(input.nextInt() == 1){
      fries = true;
    }
    System.out.println("For Here or To Go? \n1. Eat in\n2. Take Out");
    if(input.nextInt() == 2){
      takeOut = true;
    }
    System.out.println("Gravy? \n1. Yes\n2. No");
    if(input.nextInt() == 1){
      gravy = true;
    }
    if(name1 == "4 Piece"){
      amount = 4;
    }else{
      amount = 6;
    }
    ChickenJoy Q = new ChickenJoy(name1, 0.00, takeOut, fries, amount, gravy);
    System.out.println("---------------------\nYour order: " + Q + "\n---------------------"); 
    
  } else if(choice == 2){ //If User chooses Spaghetti
    String name2 = "";
    boolean fries = false;
    boolean takeOut = false;
    String size = "Normal";
    boolean cheese = true;
    boolean hotdog = true;
    System.out.println("What size do you want?\n1. Normal\n2. Family\n3. Party");
    int in1 = input.nextInt();
    if(in1 == 1){
      name2 = "Normal size";
    }else if(in1 == 2){
      name2 = "Family size";
      size = "Family";
    } else if(in1 == 3){
      name2 = "Party size";
      size = "Party";
    }
    System.out.println("Cheese? \n1. Yes \n2. No");
    int in2 = input.nextInt();
    if(in2 == 1){
      cheese = true;
    }else{
      cheese = false;
    }
    System.out.println("Hotdog? \n1. Yes \n2. No");
    if(input.nextInt() == 1){
      hotdog = true;
    }else{
      hotdog = false;
    }

    
    Spaghetti Q = new Spaghetti(name2, 0.00, takeOut, fries, size, cheese, hotdog);
    System.out.println("---------------------\nYour order: " + Q + "\n---------------------"); 
  }

    
    // Closes the Scanner object
    input.close();
    
  }
}