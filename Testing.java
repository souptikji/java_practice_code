/**
 * Copyright (c) 2014 CA.  All rights reserved.
 *
 * This software and all information contained therein is confidential and
 * proprietary and shall not be duplicated, used, disclosed or disseminated
 * in any way except as authorized by the applicable license agreement,
 * without the express written permission of CA. All authorized reproductions
 * must be marked with this language.
 *
 * EXCEPT AS SET FORTH IN THE APPLICABLE LICENSE AGREEMENT, TO THE EXTENT
 * PERMITTED BY APPLICABLE LAW, CA PROVIDES THIS SOFTWARE WITHOUT
 * WARRANTY OF ANY KIND, INCLUDING WITHOUT LIMITATION, ANY IMPLIED
 * WARRANTIES OF MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  IN
 * NO EVENT WILL CA BE LIABLE TO THE END USER OR ANY THIRD PARTY FOR ANY
 * LOSS OR DAMAGE, DIRECT OR INDIRECT, FROM THE USE OF THIS SOFTWARE,
 * INCLUDING WITHOUT LIMITATION, LOST PROFITS, BUSINESS INTERRUPTION,
 * GOODWILL, OR LOST DATA, EVEN IF CA IS EXPRESSLY ADVISED OF SUCH LOSS OR
 * DAMAGE.
 */
package practice1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * DOCUMENT ME!
 */
public class Testing
{
   /**
    * DOCUMENT ME!
    *
    * @param args DOCUMENT ME!
    */
   public static void main(String[] args)
   {
      //HashMap<String, Double> map = new HashMap<String, Double>();

      //TreeMap<String, Double> sorted_map = new TreeMap<String, Double>(bvc);

      HashMap<Double, Double> unsort = new HashMap<Double, Double>();
      ValueComparator bvc = new ValueComparator(unsort);
      TreeMap<Double, Double> indexdouble = new TreeMap<Double, Double>(bvc);

      /*map.put("A", 99.5);
      map.put("B", 67.4);
      map.put("C", 67.4);
      map.put("D", 67.3);*/

      System.out.println("unsorted map: " + unsort);

      indexdouble.putAll(unsort);

      System.out.println("results: " + indexdouble);
   }
}


/**
 * DOCUMENT ME!
 */
class ValueComparator
   implements Comparator<Double>
{
   Map<Double, Double> base;

   /**
    * Creates a new ValueComparator object.
    *
    * @param base DOCUMENT ME!
    */
   public ValueComparator(Map<Double, Double> base)
   {
      this.base = base;
   }

   /**
    * Note: this comparator imposes orderings that are inconsistent with equals.
    *
    * @param a DOCUMENT ME!
    * @param b DOCUMENT ME!
    *
    * @return DOCUMENT ME!
    */
   public int compare(Double a, Double b)
   {
      if (base.get(a) >= base.get(b))
      {
         return -1;
      }
      else
      {
         return 1;
      } // returning 0 would merge keys
   }
}