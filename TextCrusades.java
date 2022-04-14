import java.util.Scanner;


public class TextCrusades{
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      String name;
      String weapon;
      //intro to story
      try{
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
         String userName = input.nextLine();
         
         Thread.sleep(800);
         System.out.printf("%n%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n%n");
         
         System.out.println("And you quest starts, You arm yourself up with...");
         boolean weaponSelected = false;
   String selection;
         do{weaponChoice();
         
         
         selection = input.next();
         
         switch (selection){
            case "1":
               weapon = "Iron Sword";
               weaponSelected = true;
               break;
            case "2":
               weapon = "Fists";
               weaponSelected = true;
               break;
            case "3":
               weapon = "Sandwich";
               weaponSelected = true;
               break;
            case "4":
               weapon = "AK-47";
               weaponSelected = true;
               break;
            default:
               System.out.printf("Please select a valid input%n%n");
               break;
          }    
         }while (weaponSelected != true);         
          
         System.out.printf("%n... Amazing choice!%n");   
         Thread.sleep(800);
         System.out.printf("%nNow you step towards the drawbridge, ready to go on in your adventure to find the princess.%nEveryone depends on you, so you better not fail them.");
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
   }
}


