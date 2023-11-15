
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
     Picture swan2 = new Picture("images/swan.jpg");
     Picture swan3 = new Picture("images/swan.jpg");
     Picture swan4 = new Picture("images/swan.jpg");
     Picture swan5 = new Picture("images/swan.jpg");
     Picture swan6 = new Picture("images/swan.jpg");
     Picture swan7 = new Picture("images/swan.jpg");
     swan.explore();
     Pixel[] swanpixels;
     swanpixels = swan.getPixels();
     Pixel[] swanpixels2 = swan2.getPixels();
      Pixel[]swanpixels3 = swan3.getPixels();
      Pixel[] swanpixels4 = swan4.getPixels();
     Pixel[] swanpixels5 = swan5.getPixels();
     Pixel[] swanpixels6 = swan6.getPixels();
     Pixel[] swanpixels7 = swan7.getPixels();
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
     for (Pixel spot2: swanpixels2)
     {
         int newblue = 255 - spot2.getBlue();
         int newred = 255 - spot2.getRed();
         int newgreen = 255 - spot2.getGreen();
         Color negatecolor = new Color(newred, newgreen, newblue);
         spot2.setColor(negatecolor);
     }
     swan2.explore();
     
     //greyscale
     for (Pixel spot3: swanpixels3)
     {
         int newblue = spot3.getBlue();
         int newred = newblue;
         int newgreen = newblue;
         Color greyscale = new Color(newred, newgreen, newblue);
         spot3.setColor(greyscale);
     }
     swan3.explore();
     
     //lighten
     for (Pixel spot4: swanpixels4)
     {
         int newblue = spot4.getBlue() + 50;
         int newred = spot4.getRed() + 50;
         int newgreen = spot4.getGreen() + 50;
         if (newblue > 255)
             newblue = 255;
         if (newred > 255)
             newred = 255;
         if (newgreen > 255)
             newgreen = 255;
         Color lightencolor = new Color(newred, newgreen, newblue);
         spot4.setColor(lightencolor);
     }
     swan4.explore();
     
     //darken
     for (Pixel spot5: swanpixels5)
     {
         int newblue = spot5.getBlue() - 50;
         int newred = spot5.getRed() - 50;
         int newgreen = spot5.getGreen() - 50;
         if (newblue < 0)
             newblue = 0;
         if (newred < 0)
             newred = 0;
         if (newgreen < 0)
             newgreen = 0;
         Color darkencolor = new Color(newred, newgreen, newblue);
         spot5.setColor(darkencolor);
     }
     swan5.explore();
     
     //adjustred
     for (Pixel spot7: swanpixels7)
     {
         int newblue = spot7.getBlue();
         int newred = spot7.getRed() - 50;
         int newgreen = spot7.getGreen();
         if (newred < 0)
             newred = 0;
         Color adjustred = new Color(newred, newgreen, newblue);
         spot7.setColor(adjustred);
     }
     swan7.explore();
     
     /*changecolors
     for (Pixel spot7: swanpixels)
     {
         int newblue = 67;
         int newred = 23;
         int newgreen = 56;
         Color changecolor = new Color(newred, newgreen, newblue);
         spot7.setColor(changecolor);
     }
     swan.explore();*/
     
     //blueify
     for (Pixel spot8: swanpixels6)
     {
         int blue = spot8.getBlue();
         int red = spot8.getRed();
         int green = spot8.getGreen();
         if (red > 150)
         {    
            int newblue = 255;
            int newred = 0;
            int newgreen = 0;
            Color blueify = new Color(newred, newgreen, newblue);
            spot8.setColor(blueify);
        }
     }
     swan6.explore();
  }//main
}//class

