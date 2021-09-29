package Model;

public enum Values {
    KiloNewtons("СИ","Килоньютоны",1000),
    Newtons("СИ", "Ньютоны", 1),
    MicroNewtons("СИ", "Микроньютоны", 0.000001);

    private String notation;
    private String name;
    private double scale;

    Values(String notation, String name, double scale) {
        this.notation = notation;
        this.name = name;
        this.scale = scale;
    }

    public String getNotation() {
        return notation;
    }

    public String getName() {
        return name;
    }

    public double getScale() {
        return scale;
    }
}
