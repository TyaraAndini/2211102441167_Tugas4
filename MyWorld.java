import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.utill.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World{
    private int currentLevel = 1;
    
    public MyWorld()
    {    
        super(600, 400, 1); 
        prepare();
    }
    public void act() {
        // Periksa apakah level selesai
        if (currentLevel < 3) { //Ganti angka ini sesuai jumlah level
            currentLevel++;
            addObject(new LevelComplete(currentLevel), getWidth() / 2,
getHeight() / 2);
                 Greenfoot.delay(100);
                 nextLevel();
             } else {
                 showText("Game Over - You Win!", getWidth() / 2,
getHeight() / 2);
                 Greenfoot.stop();
             }
         }
     }
     public void prepare() {
         // Tambahkan inisalisasi objek dan karakter utama untuk level pertama di sini
        addObject(new Character(), getWidth() / 2, getHeight() - 30);
        addObject(new ObjectSpecial(),
Greenfoot.getRandomNumber(getWidth()),
Greenfoot.getRandomNumber(getHeight()));
     }
     
     public void nextLevel() {
         // Fungsi ini akan mempersiapkan level selanjutnya
         removeObjects(getObjects(ObjectSpecial.class));
         removeObjects(getObjects(LevelComplete.class));
         prepare();
     }
}