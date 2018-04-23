import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IkanJahat extends Actor
{
    public int totalPoisonEat = 0;
    public int totalFishEat = 0;

    
    public void checkScore()
    {
        if(totalPoisonEat >= 1) 
        {
            setImage("fishMainDead.png"); 
            loose alert_loose = new loose();
            getWorld().addObject(alert_loose, 370, 300);     
            Greenfoot.delay(350);
            Greenfoot.setWorld(new MenuScreen());

        }

        if(totalFishEat >= 10) 
        {
            win alert_win = new win();
            getWorld().addObject(alert_win, 370, 300);  
             Menus.titleSound.stop();
            Greenfoot.playSound("fanfare.wav");
            //Greenfoot.stop();
            Greenfoot.delay(350);
            Greenfoot.setWorld(new MenuScreen());
        }

    }
    public void keyBoardControl()
    { 

        if (Greenfoot.isKeyDown("left")  )
        {
            setImage("fishMain2left.png");        
            move (-3) ;
            if (Greenfoot.isKeyDown("down"))
                turn (-3) ;
            if (Greenfoot.isKeyDown("up"))
                turn (3);      
        }      

        if (Greenfoot.isKeyDown("right"))
        { 
            setImage("fishMain2.png");
            move (3);
            if (Greenfoot.isKeyDown("down"))
                turn (3) ;
            if (Greenfoot.isKeyDown("up"))
                turn (-3);
        }
    }

    private void hitafish()
    {
        Levels SeaWorld = (Levels) getWorld();
    }

}
        