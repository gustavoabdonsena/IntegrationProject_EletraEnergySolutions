package client;

public enum Categoryes {

    ARESTB(Lineup.ARES,"Ares TB"),
    ARESTHS(Lineup.ARES,"Ares THS"),
    CRONOS_OLD(Lineup.CRONOS,"CRONOS OLD"),
    CRONOS_L(Lineup.CRONOS,"CRONOS L"),
    CRONOS_NG(Lineup.CRONOS,"CRONOS NG");


    private String name;
    private Lineup lineup;

    Categoryes(Lineup lineup,String name) {
        this.lineup = lineup;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public Lineup getLineup() {
        return lineup;
    }
}
