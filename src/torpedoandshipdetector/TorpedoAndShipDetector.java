package torpedoandshipdetector;

public class TorpedoAndShipDetector {
    final String TORPEDO_FILE_NAME="HPTorpedo.snw" ;
    final String SHIP_FILE_NAME="HPship.snw" ;
    final String DETECTOR_FILE_NAME="TestData.snw" ;
    private void Run(String[] args) {
        try {
            Pattern patternTorpedo=new Pattern(TORPEDO_FILE_NAME) ;
            Pattern patternShip=new Pattern(SHIP_FILE_NAME) ;
            Pattern detectorMap=new Pattern(DETECTOR_FILE_NAME);
            Locations possibleTorpedosLocations=detectorMap.SearchForPattern(patternTorpedo) ;
            Locations possibleShipLocations=detectorMap.SearchForPattern(patternShip) ;
            possibleTorpedosLocations.Dump("Possible torpedos") ;
            possibleShipLocations.Dump("Possible enemy ships") ;
        } catch (InvalidPatternFileException ex) {
            System.out.println("Invalid pattern in file: " + ex.FileName) ;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TorpedoAndShipDetector().Run(args) ;
    }
    
}
