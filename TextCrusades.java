/*****************************************  
* Authors: Brigham Blackburn, Josue Amaya, and Justin Mcleod
* Date :04/17/22
* Assignment: Final Project, Josue worked on the first half of the main from lines 1-430, 
Brigham did the second half from lines 431-659 and made the monster class. Also making the game menu and putting
 in the combat scenarios into the code.Justin did the player class and the combat menu and modified the Monster
 class to work with the combat menu. Justin also got the first switch statment working which we used for a lot of the code.
*****************************************/
import java.util.Scanner;
import java.util.Random;

public class TextCrusades{
   public static void main(String[] args){
   
      //create instances
      Scanner input = new Scanner(System.in);
      Random randM = new Random();
      //Array with possible name for monsters, we will get a random name from this list to create a monster that the user will fight
      String[] names = {"Goblin", "Ghost", "devil", "skeleton", "hobgoblin", "Bugbear", "Demon","BOSS TROLL"};
      //create variables that will be used later
      String name = "Unknown";
      String weapon = "Unknown";
      //intro to story
      //try and catch are used to get the Thread.sleep command, this will allow us to create a delay between texts to make the game easier to read
      try{
         //Thread.sleep will be used to create a delay between texts, the numbers in the parenthesis is the delay in milliseconds 
         Thread.sleep(800);
         Instructions();
         Thread.sleep(800);
         String selection = "default";
         boolean Select = false;
         String main;
         //main menu     
         do{mainMenu();
         selection = input.next();
         switch (selection){
            case "1":
               main = "startGame";
               Select = true;
               break;
            case "2":
               weapon = "Credits";
               System.out.printf("AUTHORS:%n ");
               System.out.printf(" Justin McLeod%n%n");
               Thread.sleep(800);
               System.out.printf(" Josue Amaya%n%n");
               Thread.sleep(800);
               System.out.printf(" Brigham Blackburn%n%n");
               Thread.sleep(800);
               break;
            case "3":
               weapon = "Instructions";
               Instructions();
               break;
            default:
               System.out.printf("Please select the correct key.%n%n");
               
               break;
          }    
         }while (Select != true);
         //start of story 
         Thread.sleep(1500);  
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
         System.out.printf("%n%nThe monsters leave with the princess, and with the king completely devastated ");
         System.out.printf("%nby his daughter's kidnapping. You, as the second in charge, must go and save %n");
         System.out.printf("the princess from the hands of the evil monsters.");
         Thread.sleep(4500);
         System.out.printf("%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n");
         Thread.sleep(800);
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
         System.out.printf(" \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/    \\_/\\___/_/\\_\\\\__|  \\____/_|   \\__,_|___/\\__,_|\\__,_|\\___||___/ copyright(2022)");
         System.out.printf("%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n%n");
         //ask user for player name         
         System.out.printf("Enter your Username: ");
         name = input.next();
         Thread.sleep(800);
         System.out.printf("%n%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n%n");
         //first user choice. Simple, to familiarize the user with the game inputs
         System.out.println("And you quest starts, You arm yourself up with...");
         Select = false;   
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
         //continue story        
         System.out.printf("%n... Amazing choice!%n");   
         Thread.sleep(800);
         System.out.printf("%nNow you step towards the bridge, ready to go on in your adventure to find the princess.%nEveryone depends on you, so you better not fail them.");
         Thread.sleep(3500);
         System.out.printf("%n%n%nlooser%n%n");
         Thread.sleep(1000);
         System.out.printf("As you walk down the path you see a figure in the distance. You pull out your weapon, ready to fight.");
         Thread.sleep(3500);
         System.out.printf("%n%nAnd BAM! It jumps at you.%n");
         Thread.sleep(1000);
         System.out.printf("%nYou get scared but quickly realize... It's just a squirrel! As you sigh a breath of relief. You hear a branch break%n");
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
         tutorial();                   
         Thread.sleep(8000);
         System.out.printf("%n%n%n%n");
         //public Player(String name, int health, int damage, int defense)
         //create player stats/model
         Player player1;
         if(weapon == "Iron Sword"){
         player1 = new Player(name, 150, 30, 5);
         }else{
         player1 = new Player(name, 150, 20, 5);
         }
         //public Monster( String n, int d, int de, int h)
         //create monster stats/model
         Monster Monster1 = new Monster(names[0], 15,5, 75);
         //fight menu
         combatMenu(player1, Monster1);
         //continue story after fight
         Thread.sleep(100);
         System.out.printf("%n%nYou continue walking down the forest %n");
         System.out.printf("and you stumble upon two different paths. One of the paths looks spooky and dark,%n");
         System.out.printf("the other trail looks well kept. Which trail would you like to take?%n%n");
         Thread.sleep(4000);
         //ask user for path choice
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
         //if the user chooses the dark path, then this storyline will be shown
         if(path == "DarkPath"){
            System.out.printf("%n%nAs you walk down the dark trail, it gets very muddy and you can see the moon rising overhead.%n");
            System.out.printf("You hear an owl hooting in the distance. You walk up a hill and see a cabin far off. Since it's%n");
            System.out.printf("getting late now you need to find a place to sleep. Are you going into the cabin or are you going%n");
            System.out.printf("to sleep outside?%n%n");
            Thread.sleep(4000);
            //here the choices are divided again, should she player sleep inside or outside?
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
            //if the player sleeps inside, then this storyline will play
            if(sleep == "inside"){
               System.out.printf("You chose the cabin. You knock on the cabin door and an old man opens the door with a crossbow in his hand.");
               Thread.sleep(2500);
               System.out.printf("%n%n[Unknown man]: Who on earth are you?");
               Thread.sleep(2000);
               System.out.printf("%n%n[%s]: My business is my own and I would like to stay the night.", name);
               Thread.sleep(2000);
               System.out.printf("%n%n[Unknown man]: Whatever, you will have to pay 100 gold pieces to stay the night.%n%n");
               Thread.sleep(3000);
               //if the user chose a AK-47 at the begenning of the game, then they will be given the option to shoot the man
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
                  //if they choose to shoot, this storyline will play, and then they will die. (Game Over)
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
                  //if they chose to say that they don't have money, then this story line will play   
                  }else if(useweapon == "nomoney"){
                     Thread.sleep(3000);
                     System.out.printf("%n%n[%s]: No idiot, I ain't paying that. You pulled out your weapon, threaten me, and expect me to pay? Plus, I only have 5 gold.", name);
                     Thread.sleep(3000);
                     System.out.printf("%n%n[Unknown man]: Fine, you can pay 5 gold pieces and stay the night.");
                     Thread.sleep(2500);
                     System.out.printf("%n%n[%s]: Alright, fine, here's my money.", name);
                     Thread.sleep(2500);
                     System.out.printf("%n%n[Unknown man]: You stay the night, the Unknown-man snores throughout the night so you don't get much sleep.");
                  //if they chose the last option (tell them to pay you), then they die (Game over).
                  }else{
                     Thread.sleep(3000);
                     System.out.printf("%n%n[%s]: How about you pay me, huh?", name);
                     Thread.sleep(3000);
                     System.out.printf("%n%n[Unknown man]: Yeah... how about no");
                     Thread.sleep(3000);
                     System.out.printf("%n%nThe man shot you.");
                     Thread.sleep(2500);
                     System.out.printf("%nGame Over");
                     System.exit(1);
                  }
               //if the player didn't chose the AK-47 at the begenning, then they will be given the same options as before exept the "Shoot" one.
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
                  //if they chose to say that they don't have money, then this story line will play
                  if(useweapon == "nomoney"){
                     System.out.printf("%n%n[%s]: No Bro, I ain't paying that. You pulled out your weapon, threaten me, and expect me to pay? Plus, I only have 5 gold.", name);
                     Thread.sleep(3000);
                     System.out.printf("%n%n[Unknown man]: Fine, you can pay 5 gold pieces and stay the night.");
                     Thread.sleep(2500);
                     System.out.printf("%n%n[%s]: Alright, fine, here's my money.", name);
                     Thread.sleep(2500);
                     System.out.printf("%n%nYou stay the night, the Unknown-man snores throughout the night so you don't get much sleep.");
                  //if they chose the last option (tell them to pay you), then they die (Game over).
                  }else{
                     System.out.printf("%n%n[%s]: How about you pay me, huh?", name);
                     Thread.sleep(2000);
                     System.out.printf("%n%n[Unknown man]: Yeah... how about no");
                     Thread.sleep(2000);
                     System.out.printf("%n%nThe man shot you.");
                     Thread.sleep(2000);
                     System.out.printf("%nGame Over");
                     System.exit(1);
                  }
               }
            //if the player chose to sleep outside, they die.      
            }else{
               System.out.printf("%nYou decided to sleep outside. But you got attacked by a walking-fish with a bat, and died.");
               Thread.sleep(2000);
               System.out.printf("%nGame Over");
               System.exit(1);
            }
         //if the player chose the nice trail, then this storyline will play.
         }else{
            System.out.printf("%nYou enter the trail and start walking.");
            Thread.sleep(2000);
            System.out.printf("%n%nA nice breeze passes through, the smell of roses is in the air. You see a beautiful river by the side and deers and bunnies approach you");
            Thread.sleep(3500);
            System.out.printf("%n%nThey are really nice and you start to pet them");
            Thread.sleep(2000);
            System.out.printf("%n%nThey bring you food and birds sing for you");
            Thread.sleep(2000);
            System.out.printf("%n%nThe sun starts to set, and you see the most beautiful sunset you have ever seen in your life.");
            Thread.sleep(3250);
            System.out.printf("%n%nIt's enough to make a grown man cry...");
            Thread.sleep(2000);
            System.out.printf("%n%nas you take a seat near a cave to spend the night, you start looking at the sky, %nthe night sky has now come out and the stars and the moon look like they have come out from a dream. ");
            Thread.sleep(4000);
            System.out.printf("%n%nBut then you look behind you");
            Thread.sleep(2000);
            System.out.printf("%n%nTurns out the cave you were going to spend the night in, is the home of a bear");
            //if the player chose the sandwitc as a weapon at the begenning, then this storyline will play.
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
               //ask the user if they want to hear the joke or not
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
               //if they said yes, then this storyline will play
               if(joke == "yes"){
                  System.out.printf("%n%n[Bear]: What do you call bears without ears? B's%n%n");
                  //ask the player if they want to laugh at the joke or not
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
                  //if they decide to laugh at the joke, then this storyline happens
                  if(laughornot == "yes"){
                     System.out.printf("%n%n[%s]: HaHaHahaha-ha-a....", name);
                     Thread.sleep(2500);
                     System.out.printf("%n%nThe bear let you sleep in his cave. He told you a bedtime story, and gave you a good night's kiss.");
                  //if they don't laugh at the joke then they die. Game Over
                  }else{
                     System.out.printf("%n%n...");
                     Thread.sleep(2500);
                     System.out.printf("%n%nAnyway... The bear got mad at you for not lauging at his joke. So he killed you...");
                     Thread.sleep(2000);
                     System.out.printf("%nGame Over");
                     System.exit(1);
                  }
               //if the user decides not to laugh at the joke, this storyline happens
               }else{
                  System.out.printf("%n%n[Bear]: :(");
                  Thread.sleep(2000);
                  System.out.printf("%n%nThe bear was mad at you the rest of the night. But he let you sleep in his cave.");
               }
            //if the player wasn't carrying the sandwich... Game over.
            }else{
               Thread.sleep(2500);
               System.out.printf("%n%nThe bear rips you apart and eats you");
               Thread.sleep(2500);
               System.out.printf("%nGame Over");
               System.exit(1);
            }
         }
         //story continues
         Thread.sleep(3000);
         System.out.printf("%n%nThe next day you wake up and continue on your way to find the princess.");
         Thread.sleep(3000);
         System.out.printf("%n%n");
         System.out.printf("As you continue forward, you see a large green plain in front of you With a dark castle in the distance.");
         Thread.sleep(2000);
         System.out.printf("%n%n");
         System.out.printf("There is a large lake that it looks as though you will have to pass.%n%n");
         Thread.sleep(2000);
         System.out.printf("There is a forest on the left, and a hill with a ring of trees on the right%n%n");
         Thread.sleep(2000);
         System.out.printf("But there is also a rowboat that it looks like you can use to get across the lake%n%n");
         Thread.sleep(2000);
         System.out.printf("There are three ways to go, the forest, across the lake, or the hill with the ring of trees%n%n");
         //ask the player for what way to go
         Select = false;
         String location = "no choice yet";
            do{threeChoices();
               String selection2 = input.next();
               
               switch (selection2){
                  case "1":
                     Select = true;
                     location = "forest";
                     break;
                  case "2":
                     Select = true;
                     location = "lake";
                     break;
                  case "3":
                     Select = true;
                     location = "hill";
                     break;
                  default:
                     System.out.printf("Please select a valid input%n%n");
                     break;
               }    
            }while (Select != true);
            //if they choose forest, then this storyline happens
            String location1 = "no choice yet";
            if(location == "forest"){
               //create monster model
               Monster Monster3 = new Monster(names[1], 10, 5, 75);
               System.out.printf("The forest seems to drain light from it as you walk in.%n%n");
               Thread.sleep(2000);
               System.out.printf("It seems to be the fastest way however so hopefully you can make it through quickly.%n%n");
               Thread.sleep(2000);
               System.out.printf("As you continue walking, the ground starts to feel cold.%n%n");
               Thread.sleep(2000);
               System.out.printf("It was midday outside before so its strange that it was getting cold%n%n");
               Thread.sleep(2000);
               System.out.printf("In front of you there is a shadowy figure.%n%n");
               Thread.sleep(2000);
               System.out.printf("They point a finger at you and start to run at you%n%n");
               Thread.sleep(2000);
               System.out.printf("It looks like you'll have to fight your way out of this%n%n");
               Thread.sleep(2000);
               System.out.println("The fight scene begins");
               Thread.sleep(5000);
               //fight monster
               combatMenu(player1, Monster3);
            }
            //if they choose lake, then this storyline happens
            else if(location == "lake"){
               System.out.printf("As you walk towards the boat you realize how large the lake is%n%n");
               Thread.sleep(2000);
               System.out.printf("You get in the boat and start rowing%n%n");
               Thread.sleep(2000);
               System.out.printf("You notice there are some ripples in the otherwise unmoving water%n%n");
               Thread.sleep(2000);
               System.out.printf("Out of the corner of your eyes you see a flipper go underneath the boat%n%n");
               Thread.sleep(2000);
               System.out.printf("The boat starts rocking back and forth%n%n");
               Thread.sleep(2000);
               System.out.printf("All of a sudden the boat is flipped and you are drowned by merpeople%n%n");
               Thread.sleep(2000);
               System.out.printf("Game over");
               System.exit(0);
            }
            //if they choose hill, then this storyline happens
            else if (location == "hill"){
               System.out.printf("As you walk forward up the hill you hear some enchanting music%n%n");
               Thread.sleep(2000);
               System.out.printf("When you reach the top of the hill you see a potion in a bottle and music seems to be coming from it%n%n");
               Thread.sleep(2000);
               //create monster model
               Monster Monster2 = new Monster(names[2], 10, 5, 50);
               boolean Select1 = false;
               // String location1 = "no choice yet";
               //ask user if they want to take potion
               do{takePotion();
                  String selection1 = input.next();
                  switch (selection1){
                     case "1":
                        //if they chose to not take the potion then this storyline happens
                        Select1 = true;
                        location1 = "dontTake";
                        System.out.printf("You didn't take the potion. So you just continued in your way...");
                        Thread.sleep(2500);
                        break;
                     case "2":
                        //if they chose to take the potion, then this storyline happens
                        Select1 = true;
                        location1 = "take";
                        System.out.printf("As you take the potion, everything turns darker and you see%n%n");
                        Thread.sleep(2000);
                        System.out.printf("something run up the hill coming to attack you%n%n");
                        Thread.sleep(2000);
                        System.out.printf("Your going to have to fight this monster for the potion%n%n");
                        Thread.sleep(1000);
                        //fight monster
                        combatMenu(player1, Monster2);
                        break;
                     default:
                        System.out.printf("Please select a valid input%n%n");
                        break;
                  }
               }while(Select1 != true);    
          }
      //continue story
      Thread.sleep(2000);
      System.out.printf("%n%nYou have finally reached the castle%n%n");
      Thread.sleep(2000);
      System.out.printf("Is is very tall and there are two guards up front%n%n");
      Thread.sleep(2000);
      System.out.printf("You will have to fight the guards.%n%n");
      Thread.sleep(1500);
      System.out.printf("You run up to the drawbridge and pull out your weapon to start to fight them%n%n%n");
      Thread.sleep(2000);
      //create monster models
      Monster Monster4 = new Monster(names[randM.nextInt(7)], 5, 5, 50);
      Monster Monster5 = new Monster(names[randM.nextInt(7)], 5, 5, 50);
      //fight monster
      combatMenu(player1, Monster4);
      System.out.printf("%nNice job you killed one of the guards, now you have to take on the other%n%n");
      Thread.sleep(2000);
      //fight monster
      combatMenu(player1, Monster5);
      System.out.printf("%nGood job, now go find the princess in the castle.%n%n");
      Thread.sleep(2500);
      System.out.printf("You walk up the stairs and find a throne room with no one guarding it.%n%n");
      Thread.sleep(2500);
      System.out.printf("You enter the room and you see a tall troll that must be at least twice your height who is snoring loudly.%n%n");
      Thread.sleep(2500);
      System.out.printf("You see the princess in a cage in a corner who is also asleep.%n%n");
      Thread.sleep(2500);
      System.out.printf("You decide your going to try to sneak over to the princess and get her out.%n%n");
      Thread.sleep(2500);
      System.out.printf("You get over to the cage and say, princess, princess, wake up.%n%n");
      Thread.sleep(2500);
      System.out.printf("She wakes up and her eyes open.%n%n");
      Thread.sleep(2500);
      System.out.printf("[Princess]: What are you doing here?%n%n");
      Thread.sleep(2500);
      System.out.printf("[%s]: I've come to save you%n%n", name);
      Thread.sleep(2500);
      System.out.printf("[Princess]: But how? %n%n");
      Thread.sleep(2500);
      //ask the user what they will do
      System.out.printf("[%s]: I will ________%n%n",name);
      String whattosay = "neither";
      Select = false;
      do{whattosay();
         selection = input.next();
         switch (selection){
            case "1":
               Select = true;
               whattosay = "1";
               break;
            case "2":
               Select = true;
               whattosay = "2";
               break;
            case "3":
               Select = true;
               whattosay = "3";
               break;
            case "4":
               Select = true;
               whattosay = "4";
               break;
            default:
               System.out.printf("Please select a valid input%n%n");
               break;
         }    
      }while (Select != true);
      //if they user chose option 1, then this storyline happens
      if(whattosay == "1"){
         System.out.printf("[%s]: I'll fight him!%n%n", name);
         Thread.sleep(2500);
         System.out.printf("[BOSS TROLL]: You will what mate?%n%n");
         Thread.sleep(2500);
         System.out.printf("[%s]: oh oh....", name);
      //if they user chose option 2, then this storyline happens
      }else if(whattosay == "2"){
         System.out.printf("[%s]: I'll challenge him to a game of Uno!%n%n", name);
         Thread.sleep(2500);
         System.out.printf("[BOSS TROLL]: That sounds amazing!!!%n%n");
         Thread.sleep(2500);
         System.out.printf("You played Uno against the monster and won!%n%n");
         Thread.sleep(2500);
         System.out.printf("[BOSS TROLL]: NO! YOU CHEATED%n%n");
         Thread.sleep(2500);
         System.out.printf("The monster got mad at you, and now you have to fight him anyway.%n%n");
      //if they user chose option 3, then this storyline happens
      }else if(whattosay == "3"){
         System.out.printf("[%s]: ax^2 + bx + c = 0%n%n", name);
         Thread.sleep(1500);
         System.out.printf("[BOSS TROLL]: That's not even the quadratic formula%n%n");
         Thread.sleep(1500);
         System.out.printf("[%s]: yeah it is%n%n", name);
         Thread.sleep(1000);
         System.out.printf("[BOSS TROLL]: No it's not%n%n");
         Thread.sleep(1000);
         System.out.printf("[%s]: yeah it is%n%n", name);
         Thread.sleep(1000);
         System.out.printf("[BOSS TROLL]: No it's not%n%n");
         Thread.sleep(1000);
         System.out.printf("[%s]: yeah it is%n%n", name);
         Thread.sleep(1000);
         System.out.printf("[BOSS TROLL]: No it's not%n%n");
         Thread.sleep(1000);
         System.out.printf("[BOSS TROLL]: You know what. Fight me%n%n");
         Thread.sleep(1000);
         System.out.printf("[%s]: Bet...", name);
      //if they user chose option 4, then this storyline happens
      }else{
         System.out.printf("[%s]: What do you call Bears without ears?%n%n", name);
         Thread.sleep(2000);
         System.out.printf("[%s]: B's!!!%n%n", name);
         Thread.sleep(2000);
         System.out.printf("[BOSS TROLL]: I'm just dissapointed.%n%n");
      }
      //either option, the player still fights the monster. 
      Thread.sleep(2500);
      System.out.printf("FINAL BOSS FIGHT%n%n");
      //create BOSS model
      Monster Monster6 = new Monster(names[7],20,5,100);
      //if the player took the potion from earlier, then they drink it here and regen, then fight the boss
      if(location1 == "take"){
         System.out.println("Oh look, you have a potion from earlier, hurry, take it, it will increase your health");
         player1.heal(50);
         combatMenu(player1, Monster6);
      }
      //else they'll just fight the boss
      else{
         combatMenu(player1, Monster6);
      }
      //if they defeat the boss, then story continues and wraps up
      Thread.sleep(2000);
      System.out.printf("%nNow with the Boss deafeated you take the princess back to his father.");
      Thread.sleep(2000);
      System.out.printf("%n%n[Princess]: Father!");
      Thread.sleep(2000);
      System.out.printf("%n%n[King]: Daughter!");
      Thread.sleep(2000);
      System.out.printf("%n%n[King]: Thanks for bringing my daugther back safe.");
      Thread.sleep(2000);
      System.out.printf("%n%n[King]: For your amazing bravery and exausting work, %n        I will provide you with the....");
      Thread.sleep(2000);
      System.out.printf("%n%nActually we run out of budget, guess you'll never get whatever the King was going to give you.");
      Thread.sleep(2000);
      System.out.printf("%n%nGame Over. Thanks for playing!");
     }
     //end of story
      catch(InterruptedException e){
      System.err.println(e.getMessage());
      
   }//end of main
   
   //everything below here are the menus we called to create the selection screen
   }
   public static void mainMenu(){
      System.out.printf("%n%n                            =========================%n");
      System.out.printf("                                    MAIN MENU    %n%n");
      System.out.printf("                                >PLAY............1   %n%n");
      System.out.printf("                                >CREDITS.........2    %n%n");
      System.out.printf("                                >INSTRUCTIONS....3    %n");
      System.out.printf("                             =========================%n%n");
 
   
   }
   public static void weaponChoice(){
      System.out.println("         What weapon do you want?");
      System.out.println("           >Iron Sword...1         ");
      System.out.println("           >Fists........2         ");
      System.out.println("           >Sandwich.....3         ");
      System.out.println("           >AK-47........4         ");
   }
   
   public static void pathChoice(){
      System.out.println("         What path do you choose?");
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
      System.out.println("           >Laugh.....................1       ");
      System.out.println("           >Embrace the awkwardness...2       ");

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
   public static void threeChoices(){
      System.out.printf("               Which way do you want to go to get to the castle?%n%n");
      System.out.println("               >To the left to the forest........................1");
      System.out.println("               >The boat across the lake.........................2");
      System.out.println("               >To the right with the hill.......................3");
   }
   public static void tutorial(){
      System.out.printf("%n============================Quick-Tutorial==============================%n");
      System.out.printf(" Your stats will be displayed at the left side of the screen. Your enemy%n"); 
      System.out.printf(" stat's will be displayed on the right. You will be provided with 3%n");
      System.out.printf(" options underneath the stats. Press your keyboard buttons (1,2,3,) that%n"); 
      System.out.printf(" corresponds to each option to select them.%n Good Luck!");
      System.out.printf("%n========================================================================%n");                    
   }
     
   public static void takePotion(){
   System.out.println("           Would you like to take the potion? ");
   System.out.println("               No......1                          ");
   System.out.println("               Yes.....2                          ");
   }
   public static void Instructions(){
       System.out.printf("%n=============================Quick-game Instructions=================================%n");
       System.out.printf("  The games controls will be using the keyboard (1,2,3,4) to allow you to do things");
       System.out.printf("%n=====================================================================================%n");
   }
   public static void whattosay(){
      System.out.println("           What would you like to say?");
      System.out.println("               >Fight him!.........................1                          ");
      System.out.println("               >Challenge him to a game of Uno.....2                          ");
      System.out.println("               >Teach him the quadratic formula....3                          ");
      System.out.println("               >Tell him the bear joke.............4                          ");

   }//exept for this, this is the fighting menu, it works out all the logisctics and stats of players and monsters and fighting and all that
   public static void combatMenu(Player p, Monster m){
      Scanner action = new Scanner(System.in);
      Random randBouns = new Random();//a random number genrator for extra (or less) damge dealt.
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
         System.out.printf("%-34s %-33s %-32s%n", "ATTACK(1)", "BLOCK(2)", "HEAL(3)");
         //create 2 variables that take the player and monster bases damage and add a random abount between -5 and 5
         int dealDamage = p.getDamage() + (randBouns.nextInt(11) - 5);
         int takenDamage = m.getDamage() + (randBouns.nextInt(11) - 5);
         boolean progressBattle = false;//a boolean that keeps the battleChoice while loop running until it's true
         do{
            String battleChoice = action.nextLine();
            switch (battleChoice){
               case "1":
                  m.takeDamage(dealDamage);
                  System.out.printf("You attack the %s for %d damage!%n", m.getName(), dealDamage);
                  p.takeDamage(takenDamage);
                  System.out.printf("the %s attacks you for %d damage!%n", m.getName(), takenDamage);
                  progressBattle = true;
                  break;
               case "2":
                  p.takeDamage(takenDamage - 5);
                  System.out.printf("You defend from the %s's attack!%n", m.getName());
                  p.takeDamage(takenDamage);
                  System.out.printf("the %s attacks you for %d damage!%n", m.getName(), takenDamage);
                  progressBattle = true;
                  break;
               case "3":
                  p.heal(5 + (randBouns.nextInt(11) - 5));
                  System.out.printf("You heal yourself%n");
                  p.takeDamage(takenDamage);
                  System.out.printf("But the %s attacked you for %d damage!%n", m.getName(), takenDamage);
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
      }while((m.getAlive() == true) && (p.getAlive() == true));//if either the player or the monster's health runs out the combat ends
      if(m.getAlive() == false && p.getAlive() == true){
         System.out.printf("You defeated the %s", m.getName());
      }
      else{
         System.out.printf("%nYou died.%n Game Over");
         System.exit(0);
      }
   }    
}//end of code
