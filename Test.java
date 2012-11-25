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

     Hashtable opTable = new Hashtable();
     opTable.put('+', new Integer(1));
     opTable.put('-', new Integer(1));
     opTable.put('*', new Integer(2));
     opTable.put('/', new Integer(2));
     opTable.put('$', new Integer(0));
     int currentPrecedence = ((opTable.get('*')).hashCode());
     System.out.println("" + currentPrecedence);
    
  }
}
