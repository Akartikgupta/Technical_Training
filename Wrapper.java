import java.math.BigInteger;
import java.util.LinkedList;

public class Wrapper {

    public static void main(String[] args) {
        // Integer are wrapper class
        LinkedList<Integer> list = new LinkedList<>();
        int x = 10;
        list.add(x);// Autoboxing
        // list.add(new Integer(x)) //Boxing
        int y = list.get(0);// Unboxing
        // Big Integer
        BigInteger b = new BigInteger("2324y28948237823423423423525252472");
        BigInteger c = b.add(new BigInteger("535353535353532424243454566"));
        // for adding the two biginteger it crerates the 1st linked list and 2nd list
        // and then add both the string and create another a new linked list to get the
        // sum of 2 LL
        
    }
}
