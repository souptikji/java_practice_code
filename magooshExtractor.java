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

import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Scanner;

/**
 * DOCUMENT ME!
 */
public class magooshExtractor
{
   /**
    * DOCUMENT ME!
    *
    * @param args DOCUMENT ME!
    *
    * @throws IOException DOCUMENT ME!
    */
   public static void main(String[] args)
      throws IOException
   {
      Path pathToFile = Paths.get("C:\\Users\\senso01\\Desktop\\magooshCommonWords.txt");
      int count = 0;

      Scanner in = new Scanner(pathToFile);

      while (in.hasNextLine())
      {
         String line = in.nextLine();
         line = line.trim();

         if (hasOneWord(line) && line.length() > 1)
         {
            System.out.println(line);
            ++count;
         }
      }

      //System.out.println(count);
   }

   /**
    * DOCUMENT ME!
    *
    * @param line DOCUMENT ME!
    *
    * @return DOCUMENT ME!
    */
   public static boolean hasOneWord(String line)
   {
      if (!line.contains(" "))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}