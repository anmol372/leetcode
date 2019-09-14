/*************************************************************************
 *       Demonstrates working with Hashsets
 *
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
The following are some of the HashSet methods:
set.add(key) -- adds the key to the set.
set.contains(key) -- returns true if the set has that key.
set.iterator() -- returns an iterator over the elements
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
String[] colors = {"white", "pink", "red", "green", "red", "orange","Aa","BB"};
hashset stores red only once, but it stores both Aa and BB
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
Output:
Anmols-MacBook-Pro:leetcode anmolrastogi$ javac hashsets.java
Anmols-MacBook-Pro:leetcode anmolrastogi$ java hashsets
[red, orange, Aa, BB, pink, green, white]
Does it contain green?  true
red orange Aa BB pink green white
red orange Aa BB pink green white
Anmols-MacBook-Pro:leetcode anmolrastogi$
 *************************************************************************/
import java.util.*;

public class hashsets
{
   public static void main(String[] args)
   {
      String[] colors = {"white", "pink", "red", "green", "red", "orange","Aa","BB"};

      HashSet<String> hs = new HashSet<String>();

      for(int i = 0; i < colors.length; i++)  hs.add(colors[i]);

      System.out.println(hs);

      System.out.println("Does it contain green?  " + hs.contains("green"));

      Iterator itr = hs.iterator();

      while(itr.hasNext())
         System.out.print(itr.next()+" ");
      System.out.println();


      for(String str : hs)
         System.out.print(str +" ");
      System.out.println();
   }
}
