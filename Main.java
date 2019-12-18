import java.util.Scanner;
class Main
{   
    //variables
    public static int input;
    public static int lives =2;
    public static void main(String[] args) 
    {
    startPlay();
    if(lives == -1)
    {
         System.out.print("!");
    }
    if(lives>0) 
    {
      Q1();
      Q2();
    }
    if(lives>0)
    {
      Q3();
    }
    if(lives>0)
    {
      Q4();
    }
    if(lives>0)
    {
      Q5();
    }
    if(lives>0)
    {
      Q6();
    }
    if(lives>0)
    {
      Q7();
    }
    if(lives>0)
    {
      Q8();
    }
    if(lives>0)
    {
      Q9();
    }
    if(lives>0)
    {
      Q10();
    }
    
    if(lives>0)
    {
      Q12();
    }
    if(lives>0)
    {
      Q13();
    }
    }//end of main method
    
    
    
    static String startPlay()
    {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter 1 for yes and 0 for no. Do you want to play?: ");
    input = keyboard.nextInt();
    Message msg0;
    // prompts the user again if they did not answer 1 or 0
    while(input<0||input>1)
    {
        System.out.println("Enter 1 or 0: ");
        input = keyboard.nextInt();
    }// end of while loop
    if(input == 0)
    {
        msg0 = new Message (13,"Scaredy Cat!");
        System.out.println(msg0.getMessage());
        lives =-1;
    }
    else if(input == 1)
    {
        Challenge chal0;
        chal0 = new Challenge("What is 2+2?: ", 4);
        msg0 = new Message(13, "You have 2 lives and each answer wrong loses you one. You are on floor 13 and have to escape. The only way to floor 12 is to solve this equation. " + chal0.getQuestion());
        System.out.println(msg0.getMessage());
        input = keyboard.nextInt();
    }// end of if statement
    else
    {
        msg0 = new Message(0,"Enter 1 or 0");
    }
    return msg0.getMessage();
  }
  static String Q1() // method for question 1
  {
    // create objects
    Message msg1;  
    Challenge chal1;
    chal1 = new Challenge("What is 27+18?: ",45); //creates question and answer
    if(input==4)
    {
        Scanner keyboard = new Scanner(System.in);
        msg1 = new Message(12,"Good job! You make your way to the 12th floor. Oh no there's a vampire! The only way to kill it is with a stake! To acquire it answer this problem correctly. " + chal1.getQuestion());
        System.out.println(msg1.getMessage());
        input = keyboard.nextInt();
    }
    else
    {
      Scanner keyboard = new Scanner(System.in);
      msg1 = new Message(12,"-1 life. The answer was 4. You make your way to the 12th floor. Oh no there's a vampire! The only way to kill it is with a stake! To acquire it answer this problem correctly. " + chal1.getQuestion());
      msg1.livesMinus(2);
      System.out.println(msg1.getMessage());
      input = keyboard.nextInt();
    }// end of if statement
    return msg1.getMessage();
  }
   static String Q2() // method for question 2
  {
    // create objects
      Message msg2;
      Challenge chal2;
      Equip equip2;
      chal2 = new Challenge("What is 60-8?: ",52); //creates question and answer
      if(input==45)
      {   
        Scanner keyboard = new Scanner(System.in);
        equip2 = new Equip("Stake",true);
        msg2 = new Message(11, "Correct! "+equip2.getWeapon() + " acquired. With the stake you kill the vampire and make your way to floor 11. You notice on floor 11 a weird doll dressed in all red. Annabel? Suddenly it lunges at you! Answer this question to kill it! "+ chal2.getQuestion());
        System.out.println(msg2.getMessage());
        input = keyboard.nextInt();
      }
    else
    {
      Scanner keyboard = new Scanner(System.in);
      msg2 = new Message(11,"-1 life. The answer was 45. You end up losing your arms and barely make it to floor 11. You notice on floor 11 a weird doll dressed in all red. Annabel? Suddenly it lunges at you! Answer this question to kill it!" + chal2.getQuestion());
      System.out.println(msg2.getMessage());
      input = keyboard.nextInt();
    }// end of if statement
    return msg2.getMessage();
  }
    static String Q3() // method for question 3
    {
    // create objects
      Message msg3;
      Challenge chal3;
      chal3 = new Challenge("What is 82-45?: ",37); //creates question and answer
        if(input==52)
    {
        Scanner keyboard = new Scanner(System.in);
        msg3 = new Message(10,"Good job! You kick the doll in the face and it despawns! You go to floor 10 and see a zombie! To kill it answer this equation: " + chal3.getQuestion());
        System.out.println(msg3.getMessage());
        input = keyboard.nextInt();
    }
    else
    {
      Scanner keyboard = new Scanner(System.in);
      msg3 = new Message(10,"-1 life. The answer was 52. The doll's attack was very effective and you lost your legs! You barely make it to floor 10 and you find a zombie! To kill it answer this equation: " + chal3.getQuestion());
      msg3.livesMinus(2);
      System.out.println(msg3.getMessage());
      input = keyboard.nextInt();
    }// end of if statement
    return msg3.getMessage();
  }
    static String Q4() // method for question 4
  {
    // create objects
    Message msg4;
    Challenge chal4;
    chal4 = new Challenge("What is 3*12?: ",36); //creates question and answer
      if(input==37)
    {
        Scanner keyboard = new Scanner(System.in);
        msg4 = new Message(9,"Correct! You punch the zombie to its death and move down to level 8. Everything seems fine but you can't help but feel something EeRIEee. What is it? BAM! A ghost appears right in front of you! You need a ghost vacuum! To obtain it, answer this question: "+ chal4.getQuestion());
        System.out.println(msg4.getMessage());
        input = keyboard.nextInt();
    }
    else
    {
      Scanner keyboard = new Scanner(System.in);
      msg4 = new Message(9,"-1 life. The answer was 37. You fail to stop the zombie and it bit off your arms!! You run past it down to floor 8 and you see... nothing? Everything seems fine but you can't but feel something EeRIEee. What is it? BAM! A ghost appears right in front of you and is about to attack you! You need a ghost vacuum! To obtain it, answer this question: "+ chal4.getQuestion());
      msg4.livesMinus(2);
      System.out.println(msg4.getMessage());
      input = keyboard.nextInt();
    }// end of if statement
    return msg4.getMessage();
  }
  static String Q5() // method for question 5
  {
    // create objects
    Equip equip5;
    Message msg5;
    Challenge chal5;
    chal5 = new Challenge("what is 11*11?: ",121); //creates question and answer
      if(input==36)
    {
        equip5 = new Equip("ghost vacuum", true); 
        Scanner keyboard = new Scanner(System.in);
        msg5 = new Message(8,"Good job! The ghost comes to attack you but luckily you grab the "+equip5.getWeapon()+" and suck the ghost away! You quickly run to floor 7 only to find Mr.Coopersmith?!! The only way to pass him is to answer his math quesiton! He asks you "+ chal5.getQuestion());
        System.out.println(msg5.getMessage());
        input = keyboard.nextInt();
    }
    else
    { 
      equip5 = new Equip("Ghost vacuum", false); 
      Scanner keyboard = new Scanner(System.in);
      msg5 = new Message(8,"-1 life. The answer was 36. You try to punch the ghost but your fist goes past it! It punches you back and you lose your arms! You run past it all the way to floor 7 and you see.. Mr.Coopersmith??! The only way to pass him is to answer his math question! He asks you "+ chal5.getQuestion());
      msg5.livesMinus(2);
      System.out.println(msg5.getMessage());
      input = keyboard.nextInt();
    }// end of if statement
    return msg5.getMessage();
  }
  static String Q6() // method for question 6
  {
    // create objects
    Message msg6;
    Challenge chal6;
    chal6 = new Challenge("What is 144/12?: ",12); //creates question and answer
      if(input==121)
    {
        Scanner keyboard = new Scanner(System.in);
        msg6 = new Message(7,"Good job! You answered it correctly and he lets you pass to floor 6! You reach level 6 and you see a coffin? CRASH! The coffin bursts open and out comes a mummy! To kick it answer this question. "+ chal6.getQuestion());
        System.out.println(msg6.getMessage());
        input = keyboard.nextInt();
    }
    else
    {
      Scanner keyboard = new Scanner(System.in);
      msg6 = new Message(7,"-1 life. Oh no the answer was 121! You answered it incorrectly and he ends up teaching you for the next hour! Luckily after he teaches you he lets you pass and you run to level 6. You see what seems to be a coffin? CRASH! The coffin bursts open and out comes a mummy! To kick it answer this question. "+ chal6.getQuestion());
      msg6.livesMinus(2);
      System.out.println(msg6.getMessage());
      input = keyboard.nextInt();
    }// end of if statement
    return msg6.getMessage();
  }
  static String Q7() // method for question 7
  {
    // create objects
    Message msg7;
    Challenge chal7;
    chal7 = new Challenge("What is 240/16 ",15); //creates question and answer
      if(input==12)
    {
        Scanner keyboard = new Scanner(System.in);
        msg7 = new Message(6,"Correct! You kick the mummy to its death and move down to level 5. Once you reach floor 5 a werewolf comes charging at you! To doge, answer this question: "+ chal7.getQuestion());
        System.out.println(msg7.getMessage());
        input = keyboard.nextInt();
    }
    else
    {
      Scanner keyboard = new Scanner(System.in);
      msg7 = new Message(6,"-1 life. The answer was 12. You fail to stop the mummy and it cut off your arms!! You barely make it to level 5 and once you get there you hear a GROWL. You turn to see a werewolf charging at you! To doge it, answer this question: "+ chal7.getQuestion());
      msg7.livesMinus(2);
      System.out.println(msg7.getMessage());
      input = keyboard.nextInt();
    }// end of if statement
    return msg7.getMessage();
  }
  static String Q8() // method for question 8
  {
    // create objects
    Message msg8;
    Challenge chal8;
    Equip equip8;
    chal8 = new Challenge("What is 5 squared?: ",25); //creates question and answer
      if(input==15)
      {   equip8 = new Equip("shield",true);
          Scanner keyboard = new Scanner(System.in);
          msg8 = new Message(5,"Good job! With the " + equip8.getWeapon()+" you deflect the laser back to him and kill him! You run to floor 3 and find a HUGE spider!! You need to kill it with a hammer and to obtain answer this question: "+ chal8.getQuestion());
          System.out.println(msg8.getMessage());
          input = keyboard.nextInt();
      }
    else
    {
      equip8 = new Equip("shield",true);
      Scanner keyboard = new Scanner(System.in);
      msg8 = new Message(5,"-1 life. The answer was 15. You fail to stop the alien's gun and it shoots your arm left. While it's reloading you charge at it and tackle it down. You barely make it to floor 3 and you see a HUGE spider!! You have to smash it with hammer! To obtain answer this question: "+ chal8.getQuestion());
      msg8.livesMinus(2);
      System.out.println(msg8.getMessage());
      input = keyboard.nextInt();
    }// end of if statement
    return msg8.getMessage();
  }
  static String Q9() // method for question 9
  {
    // create objects
    Message msg9;
    Equip equip9;
    Challenge chal9;
    chal9 = new Challenge("What is the square root of 169?: ",13); //creates question and answer
      if(input==25)
    {   
        equip9 = new Equip("hammer", true);
        Scanner keyboard = new Scanner(System.in);
        msg9 = new Message(4,"Correct! You hit the spider with the "+equip9.getWeapon()+ " and kill it. You're almost there you think. You run to floor 2 and see a witch! She takes out her wand to cast a spell on you! To steal it from her, answer this question: "+ chal9.getQuestion());
        System.out.println(msg9.getMessage());
        input = keyboard.nextInt();
    }
    else
    {   
      equip9 = new Equip("hammer", false);
      Scanner keyboard = new Scanner(System.in);
      msg9 = new Message(4,"-1 life. The answer was 25. You fail to hit the spider and it cuts your arms off! You run past it and barely make it to floor 2. You see a witch and see her taking out her wand! Quick! Before she does answer this question to stop her! "+ chal9.getQuestion());
      msg9.livesMinus(2);
      System.out.println(msg9.getMessage());
      input = keyboard.nextInt();
    
    }// end of if statement
    return msg9.getMessage();
  }
  static String Q10() // method for question 10
  {
    // create objects
    Message msg10;
    Challenge chal10;
    chal10 = new Challenge("How many members are in BTS?: ",7); //creates question and answer
      if(input==13)
    {
        Scanner keyboard = new Scanner(System.in);
        msg10 = new Message(4,"Correct! Just before she takes out her wand you tackle her and run to first floor. You're almost to the end! On the bottom floor you see a bunch of BTS fans!! They say the only way to pass is to correctly answer their question. They ask "+ chal10.getQuestion());
        System.out.println(msg10.getMessage());
        input = keyboard.nextInt();
    }
    else
    {   
      Scanner keyboard = new Scanner(System.in);
      msg10 = new Message(4,"-1 life. The answer was 13. You fail to stop the witch and she puts a spell on you! You suddenly feel weak but youre able to charge at the witch. You tackle her and run to first floor. You're almost there! However on the bottom floor you see a bunch of BTS fans!! To pass they ask, "+ chal10.getQuestion());
      msg10.livesMinus(2);
      System.out.println(msg10.getMessage());
      input = keyboard.nextInt();
    }// end of if statement
    return msg10.getMessage();
  }
  
  static String Q12() // method for question 12
  {
    // create objects
    Message msg12;
      if(input==7)
    {
        Scanner keyboard = new Scanner(System.in);
        msg12 = new Message(1,"Good job! They let you pass and you quickly dash outside. Also you live happily ever after!");
        System.out.println(msg12.getMessage());
    }
    else
    {
      Scanner keyboard = new Scanner(System.in);
      msg12 = new Message(1,"-1 life. THERE IS 7!! They teach you for an hour about BTS until they finally let you go. You quickly run outside and live happily ever after.");
      msg12.livesMinus(2);
      System.out.println(msg12.getMessage());
      input = keyboard.nextInt();
    }// end of if statement
    return msg12.getMessage();
  }
  static String Q13() // method for question 13
  {
    // create objects
    Scanner keyboard0 = new Scanner(System.in);
    System.out.println("Did you have fun? 1 for yes 0 for no:");
    input = keyboard0.nextInt();
    while(input != 1)
    {
      Scanner keyboard1 = new Scanner(System.in);
      System.out.println("Did you have fun? 1 for yes 0 for no:");
      input = keyboard1.nextInt();
    }
    System.out.print("That's what I like to hear.");
    return "That's what I like to hear.";
  }
  
  
}// end of Main class
