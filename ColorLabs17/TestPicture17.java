
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
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /**/
     //String fileName = FileChooser.pickAFile();
     //Picture pictObj = new Picture(fileName);
     //pictObj.explore();

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     //relative path
     Picture apic = new Picture("images\\beach.jpg");
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     Picture ferris2 = new Picture("images/2000 ferris wheel2.jpg");
     Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");
     Picture blueM1 = new Picture("images/blue-mark.jpg");
     
     blueM1.explore();
     apic.explore();
     ferris1.explore();
     
     //makes an array of pixels
     Pixel[] bMpixels;
     //gets pixels from picture and assigns to pixels array
     bMpixels = blueM1.getPixels();
     
    
     /*how many pixels or how large array
    System.out.println("This is a large array" + pixels.length  );


    
        //access each index
    System.out.println(pixels[17]);
    //access each pixel
    Pixel spot = ferris1.getPixel(100,100);
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
    Color mycolor = new Color(46, 139, 87);
    pixels[17].setColor(Color.yellow);
    spot.setColor(mycolor);
    ferris1.explore();*/
    Color aqua = new Color(0, 255, 255);
    //for each loop process the entire array
    for (Pixel spot1: bMpixels)
    {
        if (spot1.getRed() > 187 && spot1.getRed() < 210)
        {
            spot1.setColor(aqua);
        }
    }
    blueM1.explore();

    blueM1.write("images/blue-mark2.jpg");
//access each pixel
    /*Pixel spot = ferris1.getPixel(100,100);
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
    spot.setColor(Color.red);
    ferris1.explore();
    Pixel myspot = ferris1.getPixel(800,200);
    System.out.println(pixels[17].getColor());
    System.out.println(myspot);
    System.out.println(pixels[17]);
//access each pixel
    //Pixel spot = ferris1.getPixel(100,100);
    System.out.println(pixels[17].getColor());
    System.out.println(myspot);
    myspot.setColor(Color.blue);
    ferris1.explore();
/*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();
/*
   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    for (Pixel spot : pixels)
    System.out.println( spot );


   
 /**/

 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           
            
        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file
    ferris1.write("images/ferris11.jpg");

    /**/
  }//main
}//class
