import java.io.*; //import library

public class Color{
  
  //max number of IDs 
  public int max = 8; 
  
  //private variables
  private String name;
  private double birth_m_y;
  private int ID_number; 
  
  //originally set to type Object to permit various data types in the array
  private int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
  
  //synchronize functions accessing the array 
  public void setVal(int index, int ID){
    synchronized(primes){
      primes[index] = ID; 
    } 
  }
  
  public int getVal(int index){
    synchronized(primes){
      return primes[index]; 
    }
  }
  
  //function that estabalishes identity through private variables
  public Identity(String name, double birth_m_y, int ID_number){
    this.name = name;
    this.birth_m_y = birth_m_y;
    this.ID_number = ID_number; 
    
    System.out.println("Configuring ID information...");
  }
  
  //declare an enumeration for various colors
  public enum Spectrum {RED, BLUE, GREEN, YELLOW, PURPLE}
  
  //main function
  public static void main(String[] args){
    Spectrum choice; //declare an object of Spectrum 
    
    //switch statement 
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
        
        case PURPLE:
          System.out.println("You have the ability of super strength."); 
          break;
        
        default:
          System.out.println("You have no superpowers :(");
          break; 
    }
    
  }
}
