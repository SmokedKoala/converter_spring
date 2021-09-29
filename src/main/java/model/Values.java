package model;

public enum Values {
    Kilometers("длина","Километр",1000),
    Meters("длина", "Метр", 1),
    Centimeters("длина", "Сантиметр", 0.01),
    Inches("длина", "Дюйм", 0.0254),
    Foots("длина", "Фут", 0.3048),
    Yards("длина", "Ярд", 0.9144),
    Arshins("длина", "Аршин", 0.7112),
    Versts("длина", "Верста", 1066.8),
    Kilograms("вес", "Килограмм", 1),
    Poods("вес", "Пуд", 16.380496),
    Ounces("вес", "Унция", 0.0283495);

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
