package torpedoandshipdetector;


class Location {
    private int StartX ;
    private int StartY ;
    public Location(int x, int y) {
        StartX=x ;
        StartY=y ;
    }

    /**
     * @return the StartX
     */
    public int getStartX() {
        return StartX;
    }

    /**
     * @return the StartY
     */
    public int getStartY() {
        return StartY;
    }
}
