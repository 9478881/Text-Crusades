public class Monster{
   
   private String name;
   private int damage;
   private int defense;
   private int health;
   private boolean alive = true;
   
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
   
   public int getDefense(){
      return defense;
   }
   
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
   
   
   public boolean getAlive(){
   
      return alive;
   }
   
   public void checkAlive(){      
      if(health <= 0){
         alive = false;
       
      }
   }

}
