/*************************************************************************
 *       Demonstrates hashCodes of various objects
 *
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 hashCode is computed by the following formula
 s.charAt(0) * 31n-1 + s.charAt(1) * 31n-2 + ... + s.charAt(n-1)
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 strings ""Aa" and "BB" have the same key: .
 "Aa" = 'A' * 31 + 'a' = 2112
 "BB" = 'B' * 31 + 'B' = 2112
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 The order in which elements are returned depends on their hash codes.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *************************************************************************/


import java.util.*;

public class hashCodes
{
   public static void main(String[] args)
   {
      Integer obj1 = new Integer(2009);
      System.out.println("hashCode for an integer "+ obj1+" is "+ obj1.hashCode());

      String obj2 = new String("2009");
      System.out.println("\nhashCode for a string " + obj2+" is "+ obj2.hashCode());

      StringBuffer obj3 = new StringBuffer("2009");
      System.out.println("\nhashCode for a string buffer " + obj3+" is "+ obj3.hashCode());

      ArrayList<Integer> obj4 = new ArrayList<Integer>();
      obj4.add(new Integer(2009));
      System.out.println("\nhashCode for an arraylist "+ obj4+" is " + obj4.hashCode());

      Iterator obj5 = obj4.iterator();
      System.out.println("\nhashCode for an iterator "+ obj5+" is " + obj5.hashCode());

      hashCodes obj6 = new hashCodes();
      System.out.println("\nhashCode for HashCodeDemo " + obj6+" is "+ obj6.hashCode());

      String obj7 = new String("19999999999999999");
      System.out.println("\nhashCode can be negative " + obj7+" is "+ obj7.hashCode());
   }
}
