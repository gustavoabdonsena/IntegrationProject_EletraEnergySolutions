package client;

public enum Lineup {
    CRONOS("Cronos"), ARES("Ares");

    public String linupProp;

    Lineup(String name){
        linupProp = name;
    }

    public String getLinupProp() {
        return linupProp;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
