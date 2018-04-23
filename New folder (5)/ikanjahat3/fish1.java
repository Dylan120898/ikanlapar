import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class fish1 extends Actor
{
    /**
     * Act - do whatever the fish1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move (4) ;
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
