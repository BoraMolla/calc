import java.lang.Object;
import java.util.Hashtable;

public class Test {

  public static void main(String[] args) {
    String test = "232";
    test += '1';
    int testInt = Integer.parseInt(test);
    System.out.println(testInt);
    Integer val = new Integer(5);
    System.out.println("" + val.intValue());

     Hashtable<Character,Integer> opTable = new Hashtable<Character,Integer>();
     opTable.put('+', 1);
     opTable.put('-', 1);
     opTable.put('*', 2);
     opTable.put('/', 2);
     opTable.put('$', 0);
     int currentPrecedence = ((opTable.get('*')).hashCode());
     System.out.println("" + currentPrecedence);
    
  }
}
