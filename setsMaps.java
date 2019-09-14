/*************************************************************************
 *       Demonstrates working with Sets and Maps
 *
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 The following are some of the HashMap methods:

map.get(key) -- returns the value associated with that key. If the map does not associate any value with that key then it returns null. Referring to "map.get(key)" is similar to referring to "A[key]" for an array A.
map.put(key,value) -- adds the key-value pair to the map. This is similar to "A[key] = value" for an array A.
map.containsKey(key) -- returns true if the map has that key.
map.containsValue(value) -- returns true if the map has that value.
map.keySet() -- returns a set of all keys
map.values() -- returns a collection of all value

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
HashSet and HashMap will be printed in no particular order.
If the order of insertion is important in your application, you should use LinkeHashSet and/or LinkedHashMap classes. If you want to print dtata in sorted order, you should use TreeSet and or TreeMap classes

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Output:
Anmols-MacBook-Pro:leetcode anmolrastogi$ javac setsMaps.java
Anmols-MacBook-Pro:leetcode anmolrastogi$ java setsMaps
Hash  set: [as, looks, nothing, is, it, easy]

Tree set: [as, easy, is, it, looks, nothing]

Linked set: [nothing, is, as, easy, it, looks]

6 distinct words detected:

Hash map: {as=2, looks=1, nothing=1, is=1, it=1, easy=1}

Tree map: {as=2, easy=1, is=1, it=1, looks=1, nothing=1}

Linked map: {nothing=1, is=1, as=2, easy=1, it=1, looks=1}

Anmols-MacBook-Pro:leetcode anmolrastogi$
*************************************************************************/

import java.util.*;

public class setsMaps
{
   public static void main(String[] args)
   {
      String[] data = new String("nothing is as easy as it looks").split(" ");

      HashSet<String> hs = new HashSet<String>();
      LinkedHashSet<String> lhs = new LinkedHashSet<String>();
      TreeSet<String> ts = new TreeSet<String>();

      HashMap<String, Integer> m = new HashMap<String, Integer>();
      TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
      LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();

      for (String x : data)
      {
         Integer freq = m.get(x);
         m.put(x, freq == null ? 1 : freq + 1);
         tm.put(x, freq == null ? 1 : freq + 1);
         lhm.put(x, freq == null ? 1 : freq + 1);

         hs.add(x);
         ts.add(x);
         lhs.add(x);
      }

      /* this prints the HashSet */
      System.out.println("Hash  set: " + hs);
      System.out.println();

      /* this prints the hashtable in sorted order*/
      System.out.println("Tree set: " + ts);
      System.out.println();

      /* this prints the hashtable in the order items were inserted */
      System.out.println("Linked set: " + lhs);
      System.out.println();

      System.out.println(m.size() + " distinct words detected:");
      System.out.println();

      System.out.println("Hash map: " + m);
      System.out.println();

      System.out.println("Tree map: " + tm);
      System.out.println();

      System.out.println("Linked map: " + lhm);
      System.out.println();
   }
}
