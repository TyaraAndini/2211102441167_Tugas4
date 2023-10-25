import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Character extends Actor
{
    private int score = 0;
    
    public Character() {
        setImage("character.png");
    }
    
    public void act()
    {
        move(3);
        checkForCollision();
    }
    
    public void checkForCollision() {
        Actor object = getOneIntersectingObject(ObjectSpecial.class);
        if (object != null) {
            increaseScore();
            getWorld().removeObject(object);
        }
    }
    
    public void increaseScore() {
        score += 10;
        getWorld().showText("Score: " + score, 50, 25);
    }
}
