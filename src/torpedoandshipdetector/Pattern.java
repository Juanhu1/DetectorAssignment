package torpedoandshipdetector;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Pattern {
     final char POSITIVE='+' ;
     
     ArrayList<ArrayList<Boolean> > pattern = new ArrayList< >(); 
     
     public Pattern(String FileName) throws InvalidPatternFileException {
        try
        { 
          int linelen=0 ;
          List<String> lines=Files.readAllLines(Paths.get(FileName), StandardCharsets.UTF_8); 
          for (int j=0; j<lines.size(); j++ ){
            ArrayList<Boolean> lineResult=new ArrayList<>() ;              
            String line=lines.get(j) ;
            for(int i = 0; i < line.length(); i++)
            {
               lineResult.add(line.charAt(i)==POSITIVE) ;
            }
            if (linelen==0) {
                linelen=line.length() ;
            } else if (linelen!=line.length()) {
                throw new InvalidPatternFileException(FileName) ;
            }
            pattern.add(lineResult) ;
          }
        } 
        catch (IOException e) 
        { 
          throw new InvalidPatternFileException(FileName) ;
        }  
     }
     public int getXSize(){
         return (this.getYSize()>0) ? this.pattern.get(0).size(): -1 ;
     }
     public int getYSize() {
         return this.pattern.size() ;
     }
     public Locations SearchForPattern(Pattern target){
          Locations rets=new Locations() ;
          int xSize=this.getXSize() ;
          int ySize=this.getYSize() ;
          int targetXSize=target.getXSize() ;
          int targetYSize=target.getYSize() ;
          if (ySize>=targetYSize && xSize>=targetXSize ) {
            for (int y=0; y<ySize-targetYSize; y++) {
                for (int x=0; x<xSize-targetXSize; x++){
                    if (probabilityCheck(x,y,target)) {
                        rets.Add(new Location(x,y));
                    }
                }
            }                
          }
          return rets ;
     }
     private boolean Get(int x, int y ) {
         return this.pattern.get(y).get(x) ;
     }
     private boolean probabilityCheck(int x, int y, Pattern target ) {
         int sccCountPositive=0 ;
         int sccCountNegative=0 ;
         for (int j=0; j<target.getYSize(); j++ ) {
             for (int i=0; i<target.getXSize(); i++ ) {
                 if (this.Get(x+i, y+j )) {
                     if (target.Get(i,j)) {
                         sccCountPositive++ ;
                     } else {
                         sccCountNegative++ ;
                     }
                 } 
             }
         }
         return sccCountPositive > sccCountNegative ;
     }
}
