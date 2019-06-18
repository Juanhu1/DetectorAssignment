package torpedoandshipdetector;

public class InvalidPatternFileException extends Exception{
     String FileName; 
     InvalidPatternFileException(String Filename) {
         FileName=Filename ;         
     }    
}
