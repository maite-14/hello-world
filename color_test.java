import java.io.*;

public class Color{
  
  public enum Spectrum {RED, BLUE, GREEN, YELLOW, PURPLE, ORANGE}
  
  public static void main(String args[]){
    Spectrum choice;
    
    switch(choice){
      case RED:
        System.out.println("You have the ability of superspeed."); 
        break;
        
       case BLUE:
        System.out.println("You have the ability of flight.");
        break;
        
        case GREEN:
          System.out.println("You have the ability of telekinesis.");
          break;
    }
    
  }
}
