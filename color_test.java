import java.io.*;

public class Color{
  private String name;
  private double birth_m_y;
  private int ID_number; 
  
  public Identity(String name, double birth_m_y, int ID_number){
    this.name = name;
    this.birth_m_y = birth_m_y;
    this.ID_number = ID_number; 
    
    System.out.println("Configuring ID information...");
  }
  
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
        
        case YELLOW:
          System.out.println("You have the ability of pyrokinesis.");
          break;
    }
    
  }
}
