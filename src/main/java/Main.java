import Genericclass.Book;
import Genericclass.DeliveryServiceWithGenerics;
import Genericclass.Electronics;
import Genericclass.Grocery;
import Genericmethod.Utility;

import java.util.HashMap;
import java.util.Stack;

public class Main {
  public static void main(String[] args){


    /**1. GENERIC CLASS
     * create a new instance of DeliveryServiceWithGenerics class
     * pass in the data type of the packageItem in this case Book
     * set the packageItem to a new instance of Book class
     */
    //Delivery service for books
//    DeliveryServiceWithGenerics<Book> bookDelivery = new DeliveryServiceWithGenerics<>();
//    bookDelivery.setPackageItem(new Book("Java Programming"));
//    System.out.println("Delivered: " + bookDelivery.getPackageItem());
//
//    //Delivery service for electronics
//    DeliveryServiceWithGenerics<Electronics> electronicsDelivery = new DeliveryServiceWithGenerics<>();
//    electronicsDelivery.setPackageItem(new Electronics("Computer Science"));
//    System.out.println("Delivered: " + electronicsDelivery.getPackageItem());
//
//    //Delivery service for grocery
//    DeliveryServiceWithGenerics<Grocery> groceryDelivery = new DeliveryServiceWithGenerics<>();
//    groceryDelivery.setPackageItem(new Grocery("Vegetables"));
//    System.out.println("Delivered: " + groceryDelivery.getPackageItem());

    /**2. GENERIC METHOD
     * call the printPackage method from the Utility class
     * pass in the data
     * the method will print out the data
     */
//    Utility.printPackage(new Book("Java Programming"));
//    Utility.printPackage(new Electronics("Computer Science"));
//    Utility.printPackage(new Grocery("Vegetables"));

    /**3 Generic---> HashMap and Stack
     * var map = new HashMap<>();
     * or it can be written as:
     * HashMap<String, String> map = new HashMap<>(); for example
     * the data type of the key and value can be any data type
     * and cannot be primitive data type e.g., int, double, char
     * //
     * Primitive vs. Wrapper Classes:
     * ---
     * Primitive Types: Java also has primitive types like int, char, etc.,
     * which are not objects and are more efficient in terms of memory and performance.
     * ---
     * Wrapper Classes: Integer, Character, and String are wrapper
     * classes or object types that provide additional functionality
     * and are used when objects are required (e.g., in collections like ArrayList).
     */
    HashMap<String, String> map1 = new HashMap<>();
    HashMap<String, Integer> map2 = new HashMap<>();
    HashMap<Character, String> map3 = new HashMap<>();
    Stack<String> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

  }
}
