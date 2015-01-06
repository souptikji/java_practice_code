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

import java.util.Arrays;

/**
 * DOCUMENT ME!
 */
public class checkAddtoArray
{
   static int maxArrayLength = 30;

   /**
    * DOCUMENT ME!
    *
    * @param oldArr DOCUMENT ME!
    * @param val DOCUMENT ME!
    *
    * @return DOCUMENT ME!
    */
   public static double[] addToArray(double[] oldArr, double val)
   {
      double[] newArr;

      if (oldArr.length <= maxArrayLength - 1)
      {
         newArr = Arrays.copyOf(oldArr, oldArr.length + 1);
         newArr[newArr.length - 1] = val;
      }
      else
      {
         newArr = new double[maxArrayLength];
         System.out.println("Length exceeds");

         /*for (int i = 0; i <= maxArrayLength - 2; ++i)
         {
            newArr[maxArrayLength - 2 - i] = oldArr[oldArr.length - 1 - i];
         }*/

         for (int i = 0; i <= maxArrayLength - 2; i++)
         {
            newArr[i] = oldArr[i + 1];
         }

         newArr[maxArrayLength - 1] = val;
      }

      return newArr;
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

   /**
    * DOCUMENT ME!
    *
    * @param args DOCUMENT ME!
    */
   public static void main(String[] args)
   {
      double[] arr = new double[1];
      arr[0] = 1;

      for (int i = 0; i < 100; ++i)
      {
         arr = addToArray(arr, arr[arr.length - 1] + 1);
         print(arr);
      }
   }
}