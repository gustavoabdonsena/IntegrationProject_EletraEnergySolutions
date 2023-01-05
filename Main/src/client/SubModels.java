package client;

public enum SubModels {

    ARES7021("Ares 7021"),
    ARES7031("Ares 7031"),
    ARES7023("Ares 7023");

    private String modelName;

    SubModels(String modelName) {
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
