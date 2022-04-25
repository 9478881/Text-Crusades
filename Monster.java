/*****************************************  
* Authors: Brigham Blackburn, Justin Mcleod
* Date :04/24/22
* Assignment: Brigham worked on a lot of the code for this. Justin
modified it so that it would work for the the combat menu we were using.
Just adding some stuff to the take Damage method and the checkAlive method.
*****************************************/
public class Monster{
   
   private String name;
   private int damage;
   private int defense;
   private int health;
   private boolean alive = true;
   
   //constructor we use for monster stats and name. Whenever we use combat menu.
   public Monster( String n, int d, int de, int h){
      
      name = n;
      damage = d;
      defense = de;
      health = h;
      
   }
   //Returns what health is.
   public int getHealth(){
      return health;
   }
   
   //returns monsters name from constructor.
   public String getName(){
      return name;
   }
   
   //returns the amount of damage.
   public int getDamage(){
      return damage;
   }
   
   //Says how much damage was dealt.
   public int getDefense(){
      return defense;
   }
   
   //Justin added all of the if else statments to get takeDamage to work.
   //Basically, if the damage the player is dealing is greater then the 
   //defense the monster has. It will deal damage to the player. Otherwise,
   //It will just subtract one health from the monster to take away the 
   //possibility of the monster gaining health from defense.
   public void takeDamage(int t){
      if(t > 0){
         if(t > defense){
            this.health = health - (t - defense);
         }else{
            health = health - 1;
         }
      }else{
         this.health = health - 0;
      }
   }
   
   //returns if the monster is alive or not.
   public boolean getAlive(){
   
      return alive;
   }
   
   //This method works into when we check with the combatMenu if the monsters
   //health is <= 0. If it is, then we run . Then we say you defeated the monster 
   //you keep going.
   public void checkAlive(){     
      if(health <= 0){
         alive = false;
       
      }
   }
 
}
