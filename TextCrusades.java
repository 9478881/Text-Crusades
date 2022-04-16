import java.util.Scanner;

public class TextCrusades{
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      String name = "Bob";
      String weapon = "AK-47";
      //intro to story
      try{
         /*
         Thread.sleep(1500); //Delay. Time in milliseconds 
         System.out.printf("It was a beautiful morning... %n");
         Thread.sleep(1500);
         System.out.printf("The birds were singing %n");
         Thread.sleep(1500);
         System.out.printf("The sky was blue %n");
         Thread.sleep(1500);
         System.out.printf("And your village was getting raided by monsters");
         Thread.sleep(1500);
         System.out.printf("%n%nWAIT WHAT!? %n%n");
         Thread.sleep(1500);
         System.out.printf("Yes, your village is getting raided by monsters and everything is in complete chaos.");
         Thread.sleep(1500);
         System.out.printf("%n%n[King]: THE PRINCESS HAS BEEN KIDNAPPED");
         Thread.sleep(2000);
         System.out.printf("%n%nThe monsters leave with the princess, and with the king completely devastated %nby his daughter's kidnapping. You, as the second in charge, must go and save %nthe princess from the hands of the evil monsters. ");
         Thread.sleep(4000);
         System.out.printf("%n%n%n");
         Thread.sleep(1000);
         System.out.printf("%n%n%n");
         Thread.sleep(1000);
         System.out.printf("%n%n%n");
         Thread.sleep(1000);
         System.out.printf("%n%n%n");
         Thread.sleep(1000);
         System.out.printf("%n%n%n");
         Thread.sleep(1000);
         System.out.printf("%n%n%n");
         Thread.sleep(1000);
         System.out.printf(" _    _      _                            _          _____         _     _____                          _         %n");
         Thread.sleep(800);
         System.out.printf("| |  | |    | |                          | |        |_   _|       | |   /  __ \\                        | |        %n");
         Thread.sleep(800);
         System.out.printf("| |  | | ___| | ___ ___  _ __ ___   ___  | |_ ___     | | _____  _| |_  | /  \\/_ __ _   _ ___  __ _  __| | ___  __%n");
         Thread.sleep(800);
         System.out.printf("| |/\\| |/ _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\    | |/ _ \\ \\/ / __| | |   | '__| | | / __|/ _` |/ _` |/ _ \\/ __|%n");
         Thread.sleep(800);
         System.out.printf("\\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) |   | |  __/>  <| |_  | \\__/\\ |  | |_| \\__ \\ (_| | (_| |  __/\\__ \\%n");
         Thread.sleep(800);
         System.out.printf(" \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/    \\_/\\___/_/\\_\\\\__|  \\____/_|   \\__,_|___/\\__,_|\\__,_|\\___||___/");
         System.out.printf("%n%n%n");
         Thread.sleep(1000);
         System.out.printf("%n%n%n");
         Thread.sleep(1000);
         System.out.printf("%n%n%n");
         Thread.sleep(1000);
         System.out.printf("%n%n%n");
         Thread.sleep(1000);
         System.out.printf("%n%n%n");
         Thread.sleep(1000);
         System.out.printf("%n%n%n%n");
         System.out.printf("Enter your User name: ");
         name = input.nextLine();
         
         Thread.sleep(800);
         System.out.printf("%n%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n%n");
         
         System.out.println("And you quest starts, You arm yourself up with...");
         */boolean Select = false;
         String selection;/*    
         do{weaponChoice();
         
         
         selection = input.next();
         
         switch (selection){
            case "1":
               weapon = "Iron Sword";
               Select = true;
               break;
            case "2":
               weapon = "Fists";
               Select = true;
               break;
            case "3":
               weapon = "Sandwich";
               Select = true;
               break;
            case "4":
               weapon = "AK-47";
               Select = true;
               break;
            default:
               System.out.printf("Please select a valid input%n%n");
               break;
          }    
         }while (Select != true);         
         System.out.printf("%n... Amazing choice!%n");   
         Thread.sleep(800);
         System.out.printf("%nNow you step towards the drawbridge, ready to go on in your adventure to find the queen.%nEveryone depends on you, so you better not fail them.");
         Thread.sleep(3500);
         System.out.printf("%n%n%nlooser%n%n");
         Thread.sleep(1000);
         System.out.printf("As  you walk down the path you see a figure in the distance. You pull out your weapon, ready to fight.");
         Thread.sleep(3500);
         System.out.printf("%n%nAnd BAM! It jumps at you.%n");
         Thread.sleep(1000);
         System.out.printf("%nYou get scared but quickly realize… It's just a squirrel! As you sigh a breath of release. You hear a branch break%n");
         Thread.sleep(3500);
         System.out.printf("%nCRACK!%n");
         Thread.sleep(1000);
         System.out.printf("%nYou quickly turn around and see you are being ambushed by a goblin.%n"); 
         Thread.sleep(3500);
         System.out.printf("%n[Goblin]: Give me all your gold!%n");
         Thread.sleep(1500);
         System.out.printf("%nA fight scene starts%n");
         Thread.sleep(3000);
         //tutorial
         System.out.printf("%n============================Quick-Tutorial==============================%n");
         System.out.printf(" Your stats will be displayed at the left side of the screen. Your enemy%n"); 
         System.out.printf(" stat's will be displayed on the right. You will be provided with 4%n");
         System.out.printf(" options underneath the stats. Press your keyboard buttons (1,2,3,4) that%n"); 
         System.out.printf(" corresponds to each option to select them.%n Good Luck!");
         System.out.printf("%n========================================================================%n");                    
         Thread.sleep(5000);
         //fight
         
         
         Thread.sleep(100);
         System.out.printf("%n%nYou defeated the goblin. He is now dead. You continue walking down the forest %n");
         System.out.printf("and you stumble upon two different paths. One of the paths looks spooky and dark,%n");
         System.out.printf("the other trail looks well kept. Which trail would you like to take?%n%n");
         Thread.sleep(4000);
         */
         String path = "neither";
         Select = false;
         do{pathChoice();
         selection = input.next();
         switch (selection){
            case "1":
               Select = true;
               path = "DarkPath";
               break;
            case "2":
               Select = true;
               break;
            default:
               System.out.printf("Please select a valid input%n%n");
               break;
          }    
         }while (Select != true); 
         
         if(path == "DarkPath"){
            System.out.printf("%n%nAs you walk down the dark trail, it gets very muddy and you can see the moon rising overhead.%n");
            System.out.printf("You hear an owl hooting in the distance. You walk up a hill and see a cabin far off. Since it's%n");
            System.out.printf("getting late now you need to find a place to sleep. Are you going into the cabin or are you going%n");
            System.out.printf("to sleep outside?%n%n");
            Thread.sleep(4000);
            String sleep = "neither";
            Select = false;
            do{sleepChoice();
            selection = input.next();
            switch (selection){
               case "1":
                  Select = true;
                  sleep = "inside";
                  break;
               case "2":
                  Select = true;
                  break;
               default:
                  System.out.printf("Please select a valid input%n%n");
                  break;
            }    
            }while (Select != true);
            if(sleep == "inside"){
               System.out.printf("You chose the cabin. You knock on the cabin door and an old man opens the door with a crossbow in his hand");
               Thread.sleep(2500);
               System.out.printf("%n%n[Unkown man]: Who on earth are you?");
               Thread.sleep(2000);
               System.out.printf("%n%n[%s]: My business is my own", name);
               Thread.sleep(2000);
               System.out.printf("%n%n[Unkown man]: Whatever, you will have to pay 100 gold pieces to stay the night.%n%n");
               Thread.sleep(3000);
               if(weapon == "AK-47"){
                  String useweapon = "neither";
                  Select = false;
                  do{useweapon();
                  selection = input.next();
                  switch (selection){
                     case "1":
                        Select = true;
                        useweapon = "AK-47";
                        break;
                     case "2":
                        Select = true;
                        useweapon = "nomoney";
                        break;
                     case "3":
                        Select = true;
                        break;
                     default:
                        System.out.printf("Please select a valid input%n%n");
                        break;
                  }    
                  }while (Select != true);
                  if(useweapon == "AK-47"){
                     System.out.printf("%n%nYou pulled out your gun. And threaten to shoot the man");
                     Thread.sleep(3000);
                     System.out.printf("%n%n[%s]: Put your crossbow down...", name);
                     Thread.sleep(3000);
                     System.out.printf("%n%nYou pulled the trigger, but... you don't have bullets. It's 408 BCE anyway.");
                     Thread.sleep(3000);
                     System.out.printf("%n%nThe man shot you instead with his crossbow.");
                     Thread.sleep(3000);
                     System.out.printf("%nGame Over");
                     System.exit(1);
                  }else if(useweapon == "nomoney"){
                     Thread.sleep(3000);
                     System.out.printf("%n%n[%s]: No idot, I ain't paying that. You pulled out your weapon, threaten me, and expect me to pay? Plus, I only have 5 gold.", name);
                     Thread.sleep(3000);
                     System.out.printf("%n%n[Unkown man]: Fine, you can pay 5 gold pieces and stay the night.");
                     Thread.sleep(2500);
                     System.out.printf("%n%n[%s]: Alright, fine, here's my money.", name);
                     Thread.sleep(2500);
                     System.out.printf("%n%n[Unkown man]: You stay the night, the Unkown-man snores throughout the night so you don’t get much sleep.");
                  }else{
                     Thread.sleep(3000);
                     System.out.printf("%n%n[%s]: How about you pay me, huh?", name);
                     Thread.sleep(3000);
                     System.out.printf("%n%n[Unkown man]: Yeah... how about no");
                     Thread.sleep(3000);
                     System.out.printf("%n%nThe man shot you.");
                     Thread.sleep(2500);
                     System.out.printf("%nGame Over");
                     System.exit(1);
                  }
               }else{
                  String useweapon = "neither";
                  Select = false;
                  do{useweapon2();
                  selection = input.next();
                  switch (selection){
                     case "1":
                        Select = true;
                        useweapon = "nomoney";
                        break;
                     case "2":
                        Select = true;
                        useweapon = "hepay";
                        break;
                     default:
                        System.out.printf("Please select a valid input%n%n");
                        break;
                  }    
                  }while (Select != true);
                  if(useweapon == "nomoney"){
                     System.out.printf("%n%n[%s]: No idot, I ain't paying that. You pulled out your weapon, threaten me, and expect me to pay? Plus, I only have 5 gold.", name);
                     Thread.sleep(3000);
                     System.out.printf("%n%n[Unkown man]: Fine, you can pay 5 gold pieces and stay the night.");
                     Thread.sleep(2500);
                     System.out.printf("%n%n[%s]: Alright, fine, here's my money.", name);
                     Thread.sleep(2500);
                     System.out.printf("%n%nYou stay the night, the Unkown-man snores throughout the night so you don't get much sleep.");
                  }else{
                     System.out.printf("%n%n[%s]: How about you pay me, huh?", name);
                     Thread.sleep(2000);
                     System.out.printf("%n%n[Unkown man]: Yeah... how about no");
                     Thread.sleep(2000);
                     System.out.printf("%n%nThe man shot you.");
                     Thread.sleep(2000);
                     System.out.printf("%nGame Over");
                     System.exit(1);
                  }
               }      
            }else{
               System.out.printf("%nYou decided to sleep outside. But you got attacked by a walking-fish and died.");
               Thread.sleep(2000);
               System.out.printf("%nGame Over");
               System.exit(1);
            }
         }else{
            System.out.printf("%nYou enter the trail and start walking.");
            Thread.sleep(2000);
            System.out.printf("%n%nA nice breeze passes through, the smell of roses is in the air. You see a beautiful river by the side and deers and bunnies approach you");
            Thread.sleep(3500);
            System.out.printf("%n%nThey are really nice and you start to pet them");
            Thread.sleep(2000);
            System.out.printf("%n%nThey bring you food and birds sing for you");
            Thread.sleep(2000);
            System.out.printf("%n%nThe sun starts to set, and you see the most beautiful sunset you’ve ever seen in your life.");
            Thread.sleep(3250);
            System.out.printf("%n%n It's enough to make a grown man cry...");
            Thread.sleep(2000);
            System.out.printf("%n%nas you take a seat near a cave to spend the night, you start looking at the sky, %nthe night sky has now come out and the stars and the moon look like they have come out from a dream. ");
            Thread.sleep(4000);
            System.out.printf("%n%nBut then you look behind you");
            Thread.sleep(2000);
            System.out.printf("%n%nTurns out the cave you were going to spend the night on, is the home of a bear");
            if(weapon == "Sandwich"){
               Thread.sleep(3500);
               System.out.printf("%n%nBut you realized you have a sandwich!");
               Thread.sleep(2000);
               System.out.printf("%n%nYou give it to the bear and he invites you over for tea.");
               Thread.sleep(2500);
               System.out.printf("%n%n[Bear]: It's a nice day outside ain't it?");
               Thread.sleep(2000);
               System.out.printf("%n%n[%s]: Yeah! It's so beautiful outside.", name);
               Thread.sleep(2000);
               System.out.printf("%n%n[Bear]: I know! This is why I love spring. Hey wanna hear a joke?%n%n");
               String joke = "neither";
               Select = false;
               do{joke();
               selection = input.next();
               switch (selection){
                  case "1":
                     Select = true;
                     joke = "yes";
                     break;
                  case "2":
                     Select = true;
                     break;
                  default:
                     System.out.printf("Please select a valid input%n%n");
                     break;
               }    
               }while (Select != true);
               if(joke == "yes"){
                  System.out.printf("%n%n[Bear]: What do you call bears without ears? B's%n%n");
                  String laughornot = "neither";
                  Select = false;
                  do{laughornot();
                  selection = input.next();
                  switch (selection){
                     case "1":
                        Select = true;
                        laughornot = "yes";
                        break;
                     case "2":
                        Select = true;
                        break;
                     default:
                        System.out.printf("Please select a valid input%n%n");
                        break;
                  }    
                  }while (Select != true);
                  if(laughornot == "yes"){
                     System.out.printf("%n%n[%s]: HaHaHahaha-ha-a....", name);
                     Thread.sleep(2500);
                     System.out.printf("%n%nThe bear let you sleep in his cave. He told you a bedtime story, and gave you a good night's kiss.");
                  }else{
                     System.out.printf("%n%nYeah I would do that too...");
                     Thread.sleep(2000);
                     System.out.printf("%nGame Over");
                     System.exit(1);
                  }
               }else{
                  System.out.printf("%n%n[Bear]: :(");
                  Thread.sleep(2000);
                  System.out.printf("%n%nThe bear was mad at you the rest of the night. But he let you sleep in his cave.");
               }
            }else{
               Thread.sleep(2500);
               System.out.printf("%n%nThe bear rips you apart and eats you");
               Thread.sleep(2500);
               System.out.printf("%nGame Over");
               System.exit(1);
            }
         }
         Thread.sleep(3000);
         System.out.printf("%n%nThe next day you woke up and continued on your way to find the princess.");
         Thread.sleep(3000);
         System.out.printf("%n%n");
        
                                                                                          
                                                                                                                    
      }
      catch(InterruptedException e){
      System.err.println(e.getMessage());
      }
   }//end of main
   
   public static void weaponChoice(){
      System.out.println("         What weapon do you want?");
      System.out.println("           >Iron Sword...1         ");
      System.out.println("           >Fists........2         ");
      System.out.println("           >Sandwich.....3         ");
      System.out.println("           >AK-47........4         ");
   }//end of weapon choice
   
   public static void pathChoice(){
      System.out.println("         What path would you choose?");
      System.out.println("           >Dark Path...1         ");
      System.out.println("           >Nice Path...2         ");
   }
   public static void sleepChoice(){
      System.out.println("         Where will you sleep?");
      System.out.println("           >Inside....1         ");
      System.out.println("           >Outside...2         ");
   }
   public static void joke(){
      System.out.println("       Do you want to hear the joke?");
      System.out.println("           >Yes....1         ");
      System.out.println("           >No.....2         ");
   }
   public static void laughornot(){
      System.out.println("          Huh?");
      System.out.println("           >Laugh...........1       ");
      System.out.println("           >Unalive yourself...2       ");

   }
   public static void useweapon(){
      System.out.println("          What do you want to do?");
      System.out.println("           >Shoot him.......................1       ");
      System.out.println("           >Tell him you don't have money...2       ");
      System.out.println("           >Tell him to pay you.............3       ");
   } 
   public static void useweapon2(){
      System.out.println("          What do you want to do?");
      System.out.println("           >Tell him you don't have money...1       ");
      System.out.println("           >Tell him to pay you.............2       ");
   }
   
   
   public static void combatMenu(Player p, Monster m){
      Scanner action = new Scanner(System.in);
      Random randBouns = new Random();
      do{
         System.out.printf("%-60s        %s%n", p.getName(), m.getName());
         System.out.printf("%-60s_______________%n", "_______________");
         System.out.printf("HP: %-58d      %2s %d%n", p.getHealth(), "HP:", m.getHealth());
         System.out.printf("%-60s_______________%n", "_______________");
         System.out.printf("DEF: %-58d     %2s %d%n", p.getDefense(), "DEF:", m.getDefense());
         System.out.printf("%-60s_______________%n", "_______________");
         System.out.printf("ATK: %-58d     %2s %d%n", p.getDamage(), "ATK:", m.getDamage());
         System.out.printf("%n%n");
         System.out.printf("___________________________________________________________________________%n");
         System.out.printf("___________________________________________________________________________%n");
         System.out.printf("%-34s %-34s %-34s%n", "ATTACK", "BLOCK", "HEAL");
         System.out.printf("                            Enter 1 to ATTACK                              %n");
         System.out.printf("                            Enter 2 to BLOCK                               %n");
         System.out.printf("                            Enter 3 to HEAL                                %n");
         
         
         
         int dealDamage = p.getDamage() + (randBouns.nextInt(11) - 5);
         int takenDamage = m.getDamage() + (randBouns.nextInt(11) - 5);
         boolean progressBattle = false;
         
         do{
            String battleChoice = action.nextLine();
            switch (battleChoice){
               case "1":
                  m.takeDamage(dealDamage);
                  System.out.printf("You attack the %s for %d damage!%n", m.getName(), dealDamage);
                  p.takeDamage(takenDamage);
                  System.out.printf("the %s attack you for %d damage!%n", m.getName(), takenDamage);
                  progressBattle = true;
                  break;
                  
               case "2":
                  p.takeDamage(takenDamage - 5);
                  System.out.printf("You defend from the %s's attack!%n", m.getName());
                  progressBattle = true;
                  break;
                  
               case "3":
                  p.heal(5 + (randBouns.nextInt(11) - 5));
                  System.out.printf("You heal yourself%n");
                  p.takeDamage(takenDamage);
                  System.out.printf("the %s attack you for %d damage!%n", m.getName(), takenDamage);
                  progressBattle = true;
                  break;
                  
               default:
                  System.out.printf("Enter correct input...%n");
                  break;
            }
          }while(progressBattle == false);
          
          System.out.printf("%n%n");
          p.checkAlive();
          m.checkAlive();
          System.out.println(m.getAlive() + " " + p.getAlive());
          
      }while((m.getAlive() == true) && (p.getAlive() == true));
      
      if(m.getAlive() == false){
        System.out.printf("you Deafeated the %s", m.getName());
      }
   }
   
}


