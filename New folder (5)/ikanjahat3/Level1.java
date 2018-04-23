import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Levels
{
    /**
     * Constructor for objects of class Level1.
     * 
     */
   // public Score score_field;
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super();
          prepare();
  }

    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    public void prepare()
    {
         Crab crab = new Crab();
        addObject(crab, 506, 668);
        Crab crab2 = new Crab();
        addObject(crab2, 657, 602);

        crab.setLocation(499, 546);
        crab2.setLocation(652, 567);
        crab.setLocation(491, 511);
        crab.setLocation(482, 501);
        
        IkanJahat hungryFish = new IkanJahat();
        addObject(hungryFish, 434, 135);
        fish fish = new fish();
        addObject(fish, 212, 262);
        fish fish2 = new fish();
        addObject(fish2, 408, 307);
        fish fish3 = new fish();
        addObject(fish3, 506, 313);
        fish fish4 = new fish();
        addObject(fish4, 517, 268);
        fish fish5 = new fish();
        addObject(fish5, 203, 89);
        fish fish6 = new fish();
        addObject(fish6, 147, 51);
        fish fish7 = new fish();
        addObject(fish7, 102, 169);
        fish fish8 = new fish();
        addObject(fish8, 94, 254);
        fish fish9 = new fish();
        addObject(fish9, 180, 320);
        fish fish10 = new fish();
        addObject(fish10, 264, 342);
        fish fish11 = new fish();
        addObject(fish11, 311, 53);
        fish fish12 = new fish();
        addObject(fish12, 519, 56);
        fish fish13 = new fish();
        addObject(fish13, 266, 217);
        fish fish14 = new fish();
        addObject(fish14, 422, 237);
        fish fish15 = new fish();
        addObject(fish15, 89, 99);
        fish fish16 = new fish();
        addObject(fish16, 57, 353);
        fish1 fish1 = new fish1();
        addObject(fish1, 154, 149);
        fish1 fish17 = new fish1();
        addObject(fish17, 259, 259);
        fish1 fish18 = new fish1();
        addObject(fish18, 25, 42);
        fish1 fish19 = new fish1();
        addObject(fish19, 40, 268);
        fish1 fish110 = new fish1();
        addObject(fish110, 417, 368);
        fish1 fish111 = new fish1();
        addObject(fish111, 524, 251);
        fish1 fish112 = new fish1();
        addObject(fish112, 317, 298);
        fish3 fish32 = new fish3();
        addObject(fish32, 259, 159);
        fish3 fish33 = new fish3();
        addObject(fish33, 40, 148);
        fish3 fish34 = new fish3();
        addObject(fish34, 530, 205);
        fish3 fish35 = new fish3();
        addObject(fish35, 242, 37);
        fish3 fish36 = new fish3();
        addObject(fish36, 145, 355);
        fish3 fish37 = new fish3();
        addObject(fish37, 174, 241);
        fish3 fish38 = new fish3();
        addObject(fish38, 553, 378);
        fish111.setLocation(443, 24);
        fish2.setLocation(574, 127);
        fish38.setLocation(347, 230);
        fish110.setLocation(528, 370);
        fish10.setLocation(395, 371);
        fish36.setLocation(408, 306);
        fish.setLocation(257, 382);
        fish17.setLocation(147, 373);
        fish37.setLocation(104, 28);
        fish33.setLocation(33, 376);
        fish32.setLocation(186, 251);
        fish34.setLocation(575, 68);
        fish38.setLocation(501, 219);
        fish3 fish39 = new fish3();
        addObject(fish39, 260, 149);
        fish3 fish310 = new fish3();
        addObject(fish310, 48, 159);
        removeObject(fish14);
        removeObject(fish39);
        removeObject(fish36);
        removeObject(fish10);
        removeObject(fish6);
        removeObject(fish12);
        removeObject(fish);
        removeObject(fish9);
        fish32.setLocation(206, 328);
        fish13.setLocation(300, 359);
        hungryFish.setLocation(425, 143);
        fish34.setLocation(415, 348);
        fish35.setLocation(544, 65);
        fish111.setLocation(215, 31);
        fish3.setLocation(267, 214);
        fish7.setLocation(433, 29);
        fish11.setLocation(200, 250);

        fish34.setLocation(249, 572);
        fish110.setLocation(727, 620);
        fish13.setLocation(934, 322);
        fish112.setLocation(368, 686);
        fish32.setLocation(147, 608);
        fish17.setLocation(597, 551);
        fish33.setLocation(39, 471);
        fish16.setLocation(270, 383);
        hungryFish.setLocation(765, 128);
        fish4.setLocation(477, 341);
        fish38.setLocation(637, 437);
        fish3.setLocation(377, 143);
        fish11.setLocation(160, 357);
        fish8.setLocation(891, 515);
        fish1.setLocation(375, 519);
        fish5.setLocation(666, 388);
        fish111.setLocation(263, 216);
        fish37.setLocation(153, 198);
        removeObject(fish7);
        removeObject(fish3);
        removeObject(fish11);
        removeObject(fish17);
        removeObject(fish13);
        removeObject(fish4);
        bubble bubble = new bubble();
        addObject(bubble, 763, 375);
       
        
     
        
     
    }

}

