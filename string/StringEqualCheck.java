package string;

public class StringEqualCheck {

    // ==  operator to check memory location or address of two objects (relation operator)
    // .equals()  compare content  (Object class method)

    public static void main(String[] args) {
        String s1 = new String("HELLO"); //creates two objects(heap & SCP) and one reference variable
        String s2 = new String("Hello");
        String s = s1; // SCP  String Constant Pool
        String s3 = "HELLO";

        /*
        Each time you create a string literal, the JVM checks the "string constant pool" first.
        If the string already exists in the pool, a reference to the pooled instance is returned.
        If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
         */

        System.err.println("---------------------------------------");
        System.err.println(s1 == s);  // compare reference
        System.err.println(s1.equals(s)); // compare content
        System.err.println("-----------------------------");
        System.err.println(s1 == s2);
        System.err.println(s1.equals(s2));
        System.err.println("-----------------------------");
        System.err.println(s1 == s3);
        System.err.println(s1.equals(s3));
    }
}
