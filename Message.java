class Message implements Lives
{ // create variables
  private int floor;
  private String message;
  public static int lives = 2;
  public Message()
  {
      floor = 0;
      message = null;
  }
  public Message(int floor, String message)
  {
    this.floor=floor;
    this.message=message;
  }
  
  public int getFloor()
  {
      return floor;
  }
  public String getMessage()
  {
      return message;
  }
 public void livesMinus(int level)
  {
    lives--;
    if(lives==0)
    {
      System.out.println("You have no more lives and you die.");
    }
  } // end of livesMinus

 
} //end of Message class
