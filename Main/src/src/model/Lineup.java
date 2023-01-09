package src.model;

public enum Lineup {
    CRONOS("Cronos"),
    ARES("Ares");
    private final String lineupName;

    Lineup(String lineupName){
        this.lineupName = lineupName;
    }

    @Override
    public String toString() {
        return lineupName;
    }


}
