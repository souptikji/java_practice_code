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
public class practiceReplace
{
   /**
    * DOCUMENT ME!
    *
    * @param args DOCUMENT ME!
    */
   public static void main(String[] args)
   {
      String s =
         "&[page] of &[pages] || &[pages] of &[page]|| i am madd || on date is &[date] &time is &[time] || on date is &[time]  &time is &[date] ";

      s = s.replace("&[page]", "01");
      s = s.replace("&[pages]", "10");
      s = s.replace("&[date]", "19/04/1990");
      s = s.replace("&[time]", "09:53AM");
      s = s.replace("alu", "pyaaz");
      s = s.replace("&[paged]", "01");
      System.out.println(s);

      /*DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
      Date date = new Date();
      String dateTime = dateFormat.format(date);
      String currdate = dateTime.substring(0, 10);
      String currtime = dateTime.substring(11);
      System.out.println(dateTime);
      System.out.println(currdate);
      System.out.println(currtime);*/
   }
}