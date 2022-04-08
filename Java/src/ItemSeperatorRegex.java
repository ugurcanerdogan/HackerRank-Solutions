import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class ItemSeparator {
    public String name = "";
    public double price = 0.0;
    public int quantity = 0;
    
    public ItemSeparator(String rawInput)
    {
        String words[] = rawInput.split("(\\$\\$##)");
        this.name = words[0];
        this.price =  Double.parseDouble(words[1]);
        this.quantity = Integer.valueOf(words[2]);
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;

    }
    public int getQuantity(){
        return quantity;

    }
    
}

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        ItemSeparator itemData = new ItemSeparator(sub);
        System.out.println("Item Name: " + itemData.getName());
        System.out.println("Item Price: " + itemData.getPrice());
        System.out.println("Item Quantity: " + itemData.getQuantity());
    }
}