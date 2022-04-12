import java.util.Scanner;


public class TextCrusades{
   public static void main(String[] args){
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
         System.out.printf("| |/\\| |/ _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ import java.util.Scanner;


public class TextCrusades{
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      String name;
      String weapon;
      //intro to story
      try{
         
         Thread.sleep(1500); //Delay. Time in milliseconds 
         /*
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
         */
         System.out.println("And you quest starts, You arm yourself up with...");
         int selection;
         do{
         weaponChoice();
         while(true){
         try{
         selection = input.nextInt();
         switch (selection){
            case 1: 
               weapon = "Iron Sword";
               selection = 1;
               break;
            case 2: 
               weapon = "Fists";
               selection = 1;
               break;
            case 3:
               weapon = "Sandwitch";
               selection = 1;
               break;
            case 4: 
               weapon = "AK-47";
               selection = 1; 
               break;
            default:
               System.out.printf("Please select a valid input%n%n");
               break;
          }     
         }
         catch (InputMismatchException e){
            input.next();
            System.out.printf("Please select a valid input%n%n");
         }
         }while (selection != 1);
         }
          
         System.out.println("... Amazing choice!");                                                                                          
                                                                                                                    
      }
      catch(InterruptedException e){
      System.err.println(e.getMessage());
      }
   }
   
   public static void weaponChoice(){
      System.out.println("         What weapon do you want?");
      System.out.println("           >Iron Sword...1         ");
      System.out.println("           >Fists........2         ");
      System.out.println("           >Sandwitch....3         ");
      System.out.println("           >AK-47........4         ");
   }
}_ \\    | |/ _ \\ \\/ / __| | |   | '__| | | / __|/ _` |/ _` |/ _ \\/ __|%n");
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
         Scanner input = new Scanner(System.in);
         String userName = input.nextLine();
         Thread.sleep(800);
         System.out.printf("%n%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n%n");
         Thread.sleep(800);
         System.out.printf("%n%n%n%n");
         
                                                                                                     
                                                                                                                    
      }
      catch(InterruptedException e){
      System.err.println(e.getMessage());
      }
   }
}
