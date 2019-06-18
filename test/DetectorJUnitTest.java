
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.*; 
import org.junit.Test;
import torpedoandshipdetector.Locations ;
import torpedoandshipdetector.Pattern ;
import torpedoandshipdetector.InvalidPatternFileException ;

public class DetectorJUnitTest {
    
    final String TORPEDO_FILE_NAME="HPTorpedo.snw" ;
    final String SHIP_FILE_NAME="HPship.snw" ;
    final String DETECTOR_FILE_NAME="TestData.snw" ;
    public DetectorJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws FileNotFoundException, IOException {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void detectorTest() {
         try {
            Pattern patternTorpedo=new Pattern(TORPEDO_FILE_NAME) ;
            Pattern patternShip=new Pattern(SHIP_FILE_NAME) ;
            Pattern detectorMap=new Pattern(DETECTOR_FILE_NAME);
            Locations possibleTorpedosLocations=detectorMap.SearchForPattern(patternTorpedo) ;
            Locations possibleShipLocations=detectorMap.SearchForPattern(patternShip) ;
            possibleTorpedosLocations.Dump("Possible torpedos") ;
            possibleShipLocations.Dump("Possible enemy ships") ;
         }
         catch (InvalidPatternFileException ex) {
            
         }
     }
}
