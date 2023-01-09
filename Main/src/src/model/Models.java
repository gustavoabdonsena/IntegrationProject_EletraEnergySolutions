package src.model;

public enum Models {

    ARES_7021(  Categories.ARES_TB      ,"Ares 7021"),
    ARES_7031(  Categories.ARES_THS     ,"Ares 7031"),
    ARES_7023(  Categories.ARES_TB      ,"Ares 7023"),
    ARES_8023_15(   Categories.ARES_THS ,"ARES 8023 15"),
    ARES_8023_200(  Categories.ARES_THS ,"ARES 8023 200"),
    ARES_8023_2_5(  Categories.ARES_THS ,"ARES 8023 2.5"),

    //CRONOS old
    CRONOS_6001_A(  Categories.CRONOS_OLD ,"CRONNOS 6001-A"),
    CRONOS_6003(    Categories.CRONOS_OLD ,"CRONOS 6003"),
    CRONOS_7023(    Categories.CRONOS_OLD ,"CRONOS 7023"),

    //CRONOS L
    CRONOS_6021L(   Categories.CRONOS_L ,"CRONOS 6021L"),
    CRONOS_7023L(   Categories.CRONOS_L ,"CRONOS 7023L"),

    //CRONOS-NG
    CRONOS_6001_NG( Categories.CRONOS_NG ,"Cronos 6001‑NG"),
    CRONOS_6003_NG( Categories.CRONOS_NG ,"Cronos 6003‑NG"),
    CRONOS_6021_NG( Categories.CRONOS_NG ,"Cronos 6021‑NG"),
    CRONOS_6031_NG( Categories.CRONOS_NG ,"Cronos 6031‑NG"),
    CRONOS_7021_NG( Categories.CRONOS_NG ," Cronos 7021‑NG"),
    CRONOS_7023_NG( Categories.CRONOS_NG ,"Cronos 7023‑NG");


    private final String modelName;
    private final Categories categories;

    Models(Categories categoryes, String modelName) {
        this.categories = categoryes;
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return modelName;
    }

    public Categories getCategories() {
        return categories;
    }
}
