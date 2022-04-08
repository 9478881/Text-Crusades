public class Monster{
   
   public String name;
   
   public int damage;
   
   public int defense;
   
   public int health;
   
   public boolean alive;
   
   public Monster( String n, int d, int de, int h){
      
      name = n;
      
      damage = d;
      
      defense = de;
      
      health = h;
      
   }
   
   public int getHealth(){
   
      return health;
   }
   
   public String getName(){
   
      return name;
   }
   
   public int getDamage(){
   
      return damage;
   }
   
   public void takeDamage(int t){;
     this.health = health -t;
   }
   
   
   public boolean getAlive(){
   
      return health > 0;
   }
   
   public void checkAlive(int h){
     //error Right here. Won't allow for return inside here. 
      int health = h;
      if(health <= 0){
         System.out.println("Monster is dead");
         //Once We code Monster activities we need to figure out
         //how to stop its actions. Otherwise monster will keep attacking.
         //Maybe in the default switch statement if monsters health is zero.
         //It stops it. Then it asks you for new areas that you can travel too.
       
      }
     
   }

}
