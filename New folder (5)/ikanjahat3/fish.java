import greenfoot.*;

/**
 * Write a description of class fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fish extends Actor
{
    /**
     * Act - do whatever the fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public void act() 
    {
        move (2) ;
        if (Greenfoot.getRandomNumber (20) < 10)
    {
        turn (Greenfoot.getRandomNumber (50) - 20) ;
    } 
    if (getX () <= 5 || getX() >= getWorld().getWidth () - 5)
      
    {
    turn (180) ;
    }
    if (getY () <= 5 || getY() >= getWorld().getHeight () - 5)
    {
        turn (180) ;
    }
    }     
}
