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
   
   public int takeDamage(int t){
   
      int takeDamage = t;
     return health = health - damage;
   }
   
   
   public boolean getAlive(){
   
      return alive;
   }
   
   public int checkAlive(int h){
     //error Right here. Won't allow for return inside here. 
      int health = h;
     if(health <= 0){
          System.out.println("Game over");
         System.out.println("Continue?");
      }
   }

}