
package practicalactivity3;

//importing scanner and hashmap packages
import java.util.HashMap; 
import java.util.Scanner;

public class PracticalActivity3 {

    
    public static void main(String[] args) {
        
        //input of user
        Scanner input = new Scanner(System.in);
        
        HashMap <Integer,String>Items = new HashMap<Integer,String>();
        HashMap <Integer,Double>Prices = new HashMap<Integer,Double>();
        HashMap <Integer,Integer>Stocks = new HashMap<Integer,Integer>();
        
       //Item Stock inventory 
       Items.put(0, "Apples");
       Items.put(1, "Grapes");
       Items.put(2, "Pears");
       Items.put(3, "Peach");
       Items.put(4, "Tomato");
       
      //Stock numbers of each items in the inventory 
      Stocks.put(0, 50);
      Stocks.put(1, 1000);
      Stocks.put(2, 150);
      Stocks.put(3, 100);
      Stocks.put(4, 350);
      
      
      //Prices of each items in the inventory
      Prices.put(0, 0.25);
      Prices.put(1, 0.05);
      Prices.put(2, 0.10);
      Prices.put(3, 0.15);
      Prices.put(4, 0.20);
      
      
      //Intro message for user when program starts.
      System.out.println("Welcome to the Store!");
      System.out.println("Here is a list of items in out inventory");
      
      //Counter for getting items from the Hashmap
      int x = 0;
      while(x < Items.size()){
            System.out.println("product "+x + ", " + Items.get(x));
             x++;
      }
      
     //Output waiting for item input. 
     System.out.println("Please enter the product number of the item you would like to purchase or press 9 to checkout");   
     
     
     //Declaring variable Product selected into the int user inputted.
     int ProductSelected = input.nextInt();
     
     //Declaring variable TotalPrice to 0
     double TotalPrice = 0.00;
     
     //while loop that is executed when the user has not inputted 9 to checkout
     while(ProductSelected != 9){
         
         
         //Output to confirm item being added to the basket.
         System.out.println("You have selected " + Items.get(ProductSelected) + " is this correct? put 1 for yes or 0 for no");
         int ProductPicked = input.nextInt();
        
        //if statement for when user has confirmed item
        if(ProductPicked == 1){
            
            
            //output - Shows price and asks for the quantity of product.
            System.out.println("The product costs " + Prices.get(ProductSelected) + " There are " + Stocks.get(ProductSelected)+" in our inventory");
            System.out.println("How many would you like to buy? if you don't wan this product enter 0");
                
                //Variable Quantity is declared and defined as the input the user has input.
                int Quantity = input.nextInt();
                
                //if statement for when user has not confirmed the item.
                if(Quantity > 0){
                    
                    //if statement for when there is enough item in stock.
                    if(Quantity < Stocks.get(ProductSelected) ){
                        
                        //output to show the item has been added to the basket.
                        System.out.println("The item has been added to your basket");
                        
                        //The stocks in the store has been redefined after being added to the basket.
                        int newStocks = Stocks.get(ProductSelected) - Quantity;
                        Stocks.put(ProductSelected, newStocks);
                        
                        //the value of the TotalPrice is recalculated ready for checkout.
                        TotalPrice = TotalPrice + (Quantity * Prices.get(ProductSelected));     
                    }
                        
                    else{
                        //Output - For when the quantity entered is high then the stock avaialbe. Unavailable message is displayed.
                         System.out.println("You have selected an amount higher than our stock try a small amount");
                    }
                }
                        
                
                //if user doesnt want to add item to basket
                else if (Quantity == 0){
                    //Output - Message for item not being added to the basket.
                    System.out.println("The item has not been added to your basket");
                }
                                
                else{
                    //If any other input is made
                    //Output - Item not added in the basket.
                    System.out.println(" The quantity has not been entered. The item has not been added to the basket.");
                }
        }
        
        
        //If the item selected is not the item wanted
        else if(ProductPicked == 0){
            //Output - Item not added to the basket.
            System.out.println("The item has not been added to the basket.");
        }
        
        //For any other inputs
        else{
                //Output - Item not approved
                System.out.println("You did not approve the item. It has not been added to your basket");
        }
    
    //Output - Continue shopping or checkout
    System.out.println("Continue Shopping by entering another product key or press 9 to checkout");
    ProductSelected = input.nextInt();     
                        
                    }
    //When user checks out the output of total amount due is displayed.
    System.out.println("Thank you for shopping with us. Total amount due is: £"+ TotalPrice);
    }
    
}

