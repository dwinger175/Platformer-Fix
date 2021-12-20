import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeathWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathWorld2 extends World
{
    private GreenfootSound music = new GreenfootSound("Game_Over.mp3");    
    /**
     * Constructor for objects of class DeathWorld2.
     * 
     */
    public DeathWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    
     /**
     * 
     * Activates when started
     */
    public void act()
    {
        playMusic();

    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        GameOver gameOver = new GameOver(2);
        addObject(gameOver,413,283);
    }
    
    /**
     * 
     * Plays Music
     */
    public void playMusic()
    {
        music.playLoop(); 

    }

    /**
     * stops Music
     * 
     */
    public void stop()
    {
        music.stop();

    }
}
