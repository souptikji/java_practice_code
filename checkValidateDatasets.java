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

/**
 * DOCUMENT ME!
 */
public class checkValidateDatasets
{
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

      System.out.print("]");
   }

   /**
    * DOCUMENT ME!
    *
    * @param datasets DOCUMENT ME!
    *
    * @return DOCUMENT ME!
    */
   public static Boolean validateDatasets(double[]... datasets)
   {
      //check for non null
      for (double[] dataset : datasets)
      {
         if (dataset == null || dataset.length == 0)
         {
            print(dataset);
            System.out.println("is null or 0 length");

            return false;
         }
      }

      //check for same array length
      int commonLength = datasets[0].length;

      for (double[] dataset : datasets)
      {
         if (dataset.length != commonLength)
         {
            print(dataset);
            System.out.println(" is not of commonlength");

            return false;
         }
      }

      //passed both checks
      return true;
   }

   /**
    * DOCUMENT ME!
    *
    * @param args DOCUMENT ME!
    */
   public static void main(String[] args)
   {
      double[] dataset1 = new double[]{0};
      double[] dataset2 = new double[]{0};
      double[] dataset3 = new double[]{0};
      double[] dataset4 = new double[]{0};
      double[] dataset5 = new double[]{0};
      double[] dataset6 = new double[]{};
      double[] dataset7 = new double[]{0};
      double[] dataset8 = new double[]{0};

      System.out.println(validateDatasets(dataset1, dataset2, dataset3, dataset4, dataset5, dataset6));
   }
}