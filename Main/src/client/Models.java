package client;

public enum Models {

    ARES7021(Categoryes.ARESTB,"Ares 7021"),
    ARES7031(Categoryes.ARESTB,"Ares 7031"),
    ARES7023(Categoryes.ARESTB,"Ares 7023"),
    ARES_8023_15(Categoryes.ARESTHS,"ARES 8023 15"),
    ARES_8023_200(Categoryes.ARESTHS,"ARES 8023 200"),
    ARES_8023_2_5(Categoryes.ARESTHS,"ARES 8023 2.5"),

    //CRONOS old
    CRONOS_6001_A(Categoryes.CRONOS_OLD,"CRONNOS 6001-A"),
    CRONOS_6003(Categoryes.CRONOS_OLD,"CRONOS 6003"),
    CRONOS_7023(Categoryes.CRONOS_OLD,"CRONOS 7023"),

    //CRONOS L
    CRONOS_6021L(Categoryes.CRONOS_L,"CRONOS 6021L"),
    CRONOS_7023L(Categoryes.CRONOS_L,"CRONOS 7023L"),

    //CRONOS-NG
    CRONOS_6001_NG(Categoryes.CRONOS_NG,"Cronos 6001‑NG"),
    CRONOS_6003_NG(Categoryes.CRONOS_NG,"Cronos 6003‑NG"),
    CRONOS_6021_NG(Categoryes.CRONOS_NG,"Cronos 6021‑NG"),
    CRONOS_6031_NG(Categoryes.CRONOS_NG,"Cronos 6031‑NG"),
    CRONOS_7021_NG(Categoryes.CRONOS_NG," Cronos 7021‑NG"),
    CRONOS_7023_NG(Categoryes.CRONOS_NG,"Cronos 7023‑NG"),

    ;


    private String modelName;
    private Categoryes categoryes;

    Models(Categoryes categoryes,String modelName) {
        this.categoryes = categoryes;
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
