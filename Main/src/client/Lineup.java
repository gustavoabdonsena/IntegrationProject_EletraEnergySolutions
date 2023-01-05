package client;

public enum Lineup {
    CRONOS("Cronos"),
    ARES("Ares");

    private String lineupName;

    Lineup(String lineupName){
        this.lineupName = lineupName;
    }

    public String getLinupProp() {
        return lineupName;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
