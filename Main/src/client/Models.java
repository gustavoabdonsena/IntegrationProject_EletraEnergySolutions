package client;

public enum Models {

    ARESTB("Ares TB"),
    ARESTHS("Ares THS");


    private String modelProp;

    Models(String name) {
        name = modelProp;
    }

    public String getModelProp() {
        return modelProp;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
