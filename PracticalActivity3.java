
package practicalactivity3;

//importing scanner and hashmap packages
import java.util.HashMap; 
import java.util.Scanner;

public class PracticalActivity3 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        HashMap <Integer,String>Items = new HashMap<Integer,String>();
        HashMap <Integer,Double>Prices = new HashMap<Integer,Double>();
        HashMap <Integer,Integer>Stocks = new HashMap<Integer,Integer>();
        
        
       Items.put(0, "Apples");
       Items.put(1, "Grapes");
       Items.put(2, "Pears");
       Items.put(3, "Peach");
       Items.put(4, "Tomato");
       
       
      Stocks.put(0, 50);
      Stocks.put(1, 1000);
      Stocks.put(2, 150);
      Stocks.put(3, 100);
      Stocks.put(4, 350);
      
      Prices.put(0, 0.25);
      Prices.put(1, 0.05);
      Prices.put(2, 0.10);
      Prices.put(3, 0.15);
      Prices.put(4, 0.20);
      
      
      System.out.println("Welcome to the Store!");
      System.out.println("Here is a list of items in out inventory");
      
      int x = 0;
      while(x < Items.size()){
            System.out.println("product "+x + ", " + Items.get(x));
             x++;
      }
     System.out.println("Please enter the quanitity of this item or press 9 to checkout");   
     
     
     int ProductSelected = input.nextInt();
     double TotalPrice = 0.00;
     while(ProductSelected != 9){
         
         System.out.println("You have selected " + Items.get(ProductSelected) + " is this correct? put 1 for yes or 0 for no");
            int ProductPicked = input.nextInt();
            
            if(ProductSelected ==1){
                
                System.out.println("The product costs " + Prices.get(ProductSelected) + " There are  " + storeQuantity.get(ProductSelected)+"in our inventory");
                System.out.println("How many would you like to buy? if you don't wan this product enter 0");
                
                    int Quantity = input.nextInt();
                    if(Quantity > 0){
                        
                            if(Quantity < Stocks.get(ProductSelected) ){
                                System.out.println("The item has been added to your basket");
                                int newStocks = Stocks.get(ProductSelected) - Quantity;
                                Stocks.put(ProductSelected, newStocks);
                                TotalPrice = TotalPrice + (Quantity * Prices.get(ProductSelected));     
                            }
                        
                            else{
                                System.out.println("You have selected an amount higher than our stock try a small amount");
                        }
                    }
                        
                        
                    else if (Quantity == 0){
                        System.out.println("The item has not been added to your basket");
                    }
                                
                    else{
                    System.out.println(" The quantity has not been entered. The item has not been added to the basket.");
                    }
            }
            
        else if(ProductSelected == 0){
            System.out.println("The item has been sucessfully added to the basket");
        }
                
        else{
                System.out.println("You did not approve the item. It has not been added to your basket");
        }
        
    System.out.println("Continue Shopping by entering another product key or press 9 to checkout");
    ProductSelected = input.nextInt();     
                        
                    }
     
    System.out.println("Thank you for shopping with us total amount due is: £"+ TotalPrice);
    }

}
    
