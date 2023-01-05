package client;

public enum Lineup {
    CRONOS("Cronos"),
    ARES("Ares");
    private String lineupName;

    Lineup(String lineupName){
        this.lineupName = lineupName;
    }

    @Override
    public String toString() {
        return lineupName;
    }


}
