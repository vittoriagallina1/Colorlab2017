
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /**/
         String fileName = FileChooser.pickAFile();
         Picture pictObj = new Picture(fileName);
         pictObj.explore();
         
         //relative path
         Picture apic = new Picture("images\\selfie.jpg");
         apic.explore();
         //change with selfie picture
         Picture me = new Picture("images/selfie.jpg");
         Picture me1 = new Picture("images/selfie.jpg");
         Picture me2 = new Picture("images/selfie.jpg");
         Picture me3 = new Picture("images/selfie.jpg");
         Picture me4 = new Picture("images/selfie.jpg");
         Picture me5 = new Picture("images/selfie.jpg");
         
         Pixel[] selfie = me.getPixels();
         Pixel[] selfie1 = me1.getPixels();
         Pixel[] selfie2 = me2.getPixels();
         Pixel[] selfie3 = me3.getPixels();
         Pixel[] selfie4 = me4.getPixels();
         Pixel[] selfie5 = me5.getPixels();
         
         //method 1 change
         for (Pixel spot1: selfie)
         {
             int blue = spot1.getBlue();
             int red = spot1.getRed();
             int green = spot1.getGreen();
             int greyvalue = (blue + red + green)/3;
             if (greyvalue >= 0 && greyvalue < 64)
             {
                 int newblue = 102;
                 int newgreen = 0;
                 int newred = 0;
                 Color darkblue = new Color(newred, newgreen, newblue);
                 spot1.setColor(darkblue);
             }
             if (greyvalue >= 64 && greyvalue < 128)
             {
                 int newblue = 0;
                 int newgreen = 0;
                 int newred = 204;
                 Color redcolor = new Color(newred, newgreen, newblue);
                 spot1.setColor(redcolor);
             }
             if (greyvalue >= 128 && greyvalue < 192)
             {
                 int newblue = 255;
                 int newgreen = 178;
                 int newred = 102;
                 Color lightblue = new Color(newred, newgreen, newblue);
                 spot1.setColor(lightblue);
             }
             if (greyvalue >= 192 && greyvalue <= 255)
             {
                 int newblue = 240;
                 int newgreen = 255;
                 int newred = 255;
                 Color offwhite = new Color(newred, newgreen, newblue);
                 spot1.setColor(offwhite);
             }
         }
         me.explore();
                  
      
         //method 2 change
         int count = 0;
         int small = 0;
         int big = 0;
         for (Pixel spot2: selfie1)
         {
             int blue = spot2.getBlue();
             int red = spot2.getRed();
             int green = spot2.getGreen();
             int newvalue = (blue + red + green)/3;
             if (count == 0)
                 {
                    small = newvalue;
                    big = newvalue;
                 }
             else if (newvalue > big)
                 big = newvalue;
             else if (newvalue < small)
                 small = newvalue;
             count++;
         }
         for (Pixel spot2: selfie1)
         {
             int blue = spot2.getBlue();
             int red = spot2.getRed();
             int green = spot2.getGreen();
             int greyvalue = (blue + red + green)/3;
             if (greyvalue >= small && greyvalue < ((big-small)/4))
             {
                 int newblue = 102;
                 int newgreen = 0;
                 int newred = 0;
                 Color darkblue = new Color(newred, newgreen, newblue);
                 spot2.setColor(darkblue);
             }
             if (greyvalue >= ((big-small)/4) && greyvalue < ((big-small)/2))
             {
                 int newblue = 0;
                 int newgreen = 0;
                 int newred = 204;
                 Color redcolor = new Color(newred, newgreen, newblue);
                 spot2.setColor(redcolor);
             }
             if (greyvalue >= ((big-small)/2) && greyvalue < (3*(big-small)/4))
             {
                 int newblue = 255;
                 int newgreen = 178;
                 int newred = 102;
                 Color lightblue = new Color(newred, newgreen, newblue);
                 spot2.setColor(lightblue);
             }
             if (greyvalue >=  ((big-small)*0.75) && greyvalue <= big)
             {
                 int newblue = 240;
                 int newgreen = 255;
                 int newred = 255;
                 Color offwhite = new Color(newred, newgreen, newblue);
                 spot2.setColor(offwhite);
             }
         }
         me1.explore();
         
         //custom color palette
         for (Pixel spot2: selfie2)
         {
             int blue = spot2.getBlue();
             int red = spot2.getRed();
             int green = spot2.getGreen();
             int greyvalue = (blue + red + green)/3;
             if (greyvalue >= small && greyvalue < ((big-small)/4))
             {
                 int newblue = 114;
                 int newgreen = 42;
                 int newred = 88;
                 Color lilac = new Color(newred, newgreen, newblue);
                 spot2.setColor(lilac);
             }
             if (greyvalue >= ((big-small)/4) && greyvalue < ((big-small)/2))
             {
                 int newblue = 57;
                 int newgreen = 107;
                 int newred = 170;
                 Color pastelred = new Color(newred, newgreen, newblue);
                 spot2.setColor(pastelred);
             }
             if (greyvalue >= ((big-small)/2) && greyvalue < (3*(big-small)/4))
             {
                 int newblue = 100;
                 int newgreen = 103;
                 int newred = 34;
                 Color bluegreen = new Color(newred, newgreen, newblue);
                 spot2.setColor(bluegreen);
             }
             if (greyvalue >=  ((big-small)*0.75) && greyvalue <= big)
             {
                 int newblue = 57;
                 int newgreen = 170;
                 int newred = 170;
                 Color yellowgreen = new Color(newred, newgreen, newblue);
                 spot2.setColor(yellowgreen);
             }
         }
         me2.explore();
         
         //Revision 1
         for (Pixel spot2: selfie3)
         {
             int blue = spot2.getBlue();
             int red = spot2.getRed();
             int green = spot2.getGreen();
             int greyvalue = (blue + red + green)/3;
             if (greyvalue >= small && greyvalue < ((big-small)/4))
             {
                 int newblue = 114;
                 int newgreen = 42;
                 int newred = 88;
                 Color lilac = new Color(newred, newgreen, newblue);
                 spot2.setColor(lilac);
             }
             if (greyvalue >= ((big-small)/4) && greyvalue < ((big-small)/2))
             {
                 int newblue = 57;
                 int newgreen = 107;
                 int newred = 170;
                 Color pastelred = new Color(newred, newgreen, newblue);
                 spot2.setColor(pastelred);
             }
             if (greyvalue >= ((big-small)/2) && greyvalue < (3*(big-small)/4))
             {
                 int newblue = 57;
                 int newgreen = 170;
                 int newred = 170;
                 Color yellowgreen = new Color(newred, newgreen, newblue);
                 spot2.setColor(yellowgreen);
             }
             if (greyvalue >=  ((big-small)*0.75) && greyvalue <= big)
             {
                 int newblue = 100;
                 int newgreen = 103;
                 int newred = 34;
                 Color bluegreen = new Color(newred, newgreen, newblue);
                 spot2.setColor(bluegreen);
             }
         }
         me3.explore();
         
         //Revision 2
         for (Pixel spot2: selfie4)
         {
             int blue = spot2.getBlue();
             int red = spot2.getRed();
             int green = spot2.getGreen();
             int greyvalue = (blue + red + green)/3;
             if (greyvalue >= small && greyvalue < ((big-small)/4))
             {
                 int newblue = 100;
                 int newgreen = 103;
                 int newred = 34;
                 Color bluegreen = new Color(newred, newgreen, newblue);
                 spot2.setColor(bluegreen);
             }
             if (greyvalue >= ((big-small)/4) && greyvalue < ((big-small)/2))
             {
                 int newblue = 114;
                 int newgreen = 42;
                 int newred = 88;
                 Color lilac = new Color(newred, newgreen, newblue);
                 spot2.setColor(lilac);
             }
             if (greyvalue >= ((big-small)/2) && greyvalue < (3*(big-small)/4))
             {
                 int newblue = 57;
                 int newgreen = 107;
                 int newred = 170;
                 Color pastelred = new Color(newred, newgreen, newblue);
                 spot2.setColor(pastelred);
             }
             if (greyvalue >=  ((big-small)*0.75) && greyvalue <= big)
             {
                 int newblue = 57;
                 int newgreen = 170;
                 int newred = 170;
                 Color yellowgreen = new Color(newred, newgreen, newblue);
                 spot2.setColor(yellowgreen);
             }
         }
         me4.explore();
         
         //Revision 2
         for (Pixel spot2: selfie5)
         {
             int blue = spot2.getBlue();
             int red = spot2.getRed();
             int green = spot2.getGreen();
             int greyvalue = (blue + red + green)/3;
             if (greyvalue >= small && greyvalue < ((big-small)/4))
             {
                 int newblue = 100;
                 int newgreen = 103;
                 int newred = 34;
                 Color bluegreen = new Color(newred, newgreen, newblue);
                 spot2.setColor(bluegreen);
             }
             if (greyvalue >= ((big-small)/4) && greyvalue < ((big-small)/2))
             {
                 int newblue = 114;
                 int newgreen = 42;
                 int newred = 88;
                 Color lilac = new Color(newred, newgreen, newblue);
                 spot2.setColor(lilac);
             }
             if (greyvalue >= ((big-small)/2) && greyvalue < (3*(big-small)/4))
             {
                 int newblue = 57;
                 int newgreen = 107;
                 int newred = 170;
                 Color pastelred = new Color(newred, newgreen, newblue);
                 spot2.setColor(pastelred);
             }
             if (greyvalue >=  ((big-small)*0.75) && greyvalue <= big)
             {
                 int newblue = 240;
                 int newgreen = 232;
                 int newred = 236;
                 Color offwhite = new Color(newred, newgreen, newblue);
                 spot2.setColor(offwhite);
             }
         }
         me5.explore();
         
         me.write("images/SFtry1.jpg");
         me1.write("images/SFtry2.jpg");
         me2.write("images/SFtry3.jpg");
         me3.write("images/revision1.jpg");
         me4.write("images/revision2.jpg");
    }//main       
}//class
