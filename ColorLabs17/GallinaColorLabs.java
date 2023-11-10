
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class GallinaColorLabs
{
    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
     Picture swan = new Picture("images/swan.jpg");
     swan.explore();
     Pixel[] swanpixels;
     swanpixels = swan.getPixels();
     
     //doublefactor
     for (Pixel spot1: swanpixels)
     {
         int factorblue = (int)(spot1.getBlue()*0.25);
         int factorred = (int)(spot1.getRed()*0.5);
         int factorgreen = (int)(spot1.getGreen()*1.5);
         Color factorcolor;
         if (factorgreen <= 255)
             factorcolor = new Color(factorred, factorgreen, factorblue);
         else
             factorcolor = new Color(factorred, 255, factorblue);
         spot1.setColor(factorcolor);
     }
     swan.explore();
     
     //negate
     for (Pixel spot1: swanpixels)
     {
         int newblue = 255 - spot1.getBlue();
         int newred = 255 - spot1.getRed();
         int newgreen = 255 - spot1.getGreen();
         Color negatecolor = new Color(newred, newgreen, newblue);
         spot1.setColor(negatecolor);
     }
     swan.explore();
  }//main
}//class
