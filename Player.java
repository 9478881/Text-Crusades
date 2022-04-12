public class Player{

   //feilds
   private String name;
   private int health;
   private int damage;
   private int defense;
   private boolean alive = true;
   
   //constructors
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
   
   public void setDefense(int def){
    defense = def;
   }
   
   public void heal(int heal){
      health = health + heal;
   }
   
   public void takeDamage(int damageTaken){
      if(damageTaken > defense){
         health = health - (damageTaken - defense);
      }else{
         health = health - 1;
      }
      
   }
   
   public int getHealth(){
   return health;
   }
   
   public int getDamage(){
   return damage;
   }
   
   public int getDefense(){
   return defense;
   }
   
   public boolean getAlive(){
   return alive;
   }
   public void checkAlive(){
   if(health <= 0)
      alive = false;
   }
   

}