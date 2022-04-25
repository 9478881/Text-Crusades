/*****************************************  
* Authors: Justin Mcleod
* Date :04/17/22
* Assignment: This does everything for the player in the combat menu.
With there health, attack, healing, and defense.
*****************************************/
public class Player{

   //fields
   private String name;
   private int health;
   private int damage;
   private int defense;
   private boolean alive = true;
   
   //constructors
   //This is our Constructor for player. We call to setDamage and setDefense.
   //To allow for calling damage and defense to the combatMenu.
   public Player(String name, int health, int damage, int defense){
      this.name = name;
      this.health = health;
      setDamage(damage);
      setDefense(defense);
      
   }
   
   //methods
   public void setDamage(int dmg){
      damage = dmg;
   }
   
   //sets what defense is at.
   public void setDefense(int def){
    defense = def;
   }
   
   //If the player takes a potion, then we heal the player 
   //some health. 
   public void heal(int heal){
      health = health + heal;
   }
   
   //Very similar to the monster method. If damageTaken is greater then defense, 
   //Then in that case damageTaken is subtracted by defense.
   public void takeDamage(int damageTaken){
      if(damageTaken > 0){
         if(damageTaken > defense){
            health = health - (damageTaken - defense);
         }else{
            health = health - 1;
         }
      }else{
         health = health - 0;
      }      
   }
   
   //returns name.
   public String getName(){
   return name;
   }
   
   //returns health.
   public int getHealth(){
   return health;
   }
   
   //returns damage.
   public int getDamage(){
   return damage;
   }
   
   //returns defense.
   public int getDefense(){
   return defense;
   }
   
   //returns if alive or not.
   public boolean getAlive(){
   return alive;
   }
   //If health is <= 0 then we use System.out.exit(1); to stop the game 
   //Then say game is over.
   public void checkAlive(){
   if(health <= 0)
      alive = false;
   }
}
