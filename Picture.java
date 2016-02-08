/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square house;
    private Triangle roof;
    private Person person1, person2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        house = new Square();
        house.makeVisible();

        roof = new Triangle();
        roof.moveHorizontal(129);
        roof.moveVertical(-80);
        roof.makeVisible();

        person1 = new Person();
        person1.changeColor("black");
        person1.moveVertical(-55);
        person1.makeVisible();
        
        person2 = new Person();
        person2.changeColor("black");
        person2.moveVertical(-55);
        person2.moveHorizontal(-35);
        person2.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (house != null)   // only if it's painted already...
        {
            house.changeColor("black");
            roof.changeColor("black");
            person1.changeColor("black");
            person2.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (house != null)   // only if it's painted already...
        {
            house.changeColor("red");
            roof.changeColor("green");
            person1.changeColor("black");
            person2.changeColor("black");
        }
    }
}
