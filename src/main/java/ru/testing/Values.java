package ru.testing;

public enum Values {
    Kilometers("длина","Kilometer",1000),
    Meters("длина", "Meter", 1),
    Centimeters("длина", "Centimeter", 0.01),
    Inches("длина", "Inch", 0.0254),
    Foots("длина", "Foot", 0.3048),
    Yards("длина", "Yard", 0.9144),
    Arshins("длина", "Arshin", 0.7112),
    Versts("длина", "Verst", 1066.8),
    Kilograms("вес", "Kilogram", 1),
    Poods("вес", "Pood", 16.380496),
    Ounces("вес", "Ounce", 0.0283495);

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
