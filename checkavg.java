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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * DOCUMENT ME!
 */
public class checkavg
{
   public static double[] last15 = new double[15];
   public static Queue<Double> q = new LinkedList<Double>();

   private static double modifyAverage(double val)
   {
      double avg = 0;
      int lensofar = 0;

      for (int i = 0; i < last15.length; i++)
      {
         if (last15[i] > -1)
         {
            avg += last15[i];
            ++lensofar;
         }
         else
         {
            last15[i] = val;

            break;
         }
      }

      print(last15);

      avg /= lensofar;

      System.out.println("lensofar = " + lensofar + "   avg=" + avg);

      return avg;
   }

   /**
    * DOCUMENT ME!
    *
    * @param arr DOCUMENT ME!
    */
   public static void print(double[] arr)
   {
      System.out.print("[ ");

      for (int i = 0; i < arr.length; ++i)
      {
         System.out.print(arr[i] + " ");
      }

      System.out.println("]");
   }

   private static double computeAvg(double lastval)
   {
      double avg = 0;
      //Queue<Double> q = new LinkedList<Double>();

      if (q.size() < 15)
      {
         q.add(lastval);
      }
      else
      {
         q.poll();
         q.add(lastval);
      }

      //compute the avg
      Iterator<Double> itr = q.iterator();

      while (itr.hasNext())
      {
         avg += itr.next();
      }

      avg /= q.size();

      return avg;
   }

   private static void printQueue(Queue<Double> q)
   {
      Iterator<Double> itr = q.iterator();
      System.out.print("[ ");

      while (itr.hasNext())
      {
         System.out.print(itr.next() + " ");
      }

      System.out.print("]");
   }

   /**
    * DOCUMENT ME!
    *
    * @param args DOCUMENT ME!
    */
   public static void main(String[] args)
   {
      for (int i = 0; i < 15; i++)
      {
         last15[i] = -1;
      }

      for (double val = 0; val < 30; ++val)
      {
         //modifyAverage(val);
         double avg = computeAvg(val);
         printQueue(q);
         System.out.println(" avg=" + avg);
      }
   }
}