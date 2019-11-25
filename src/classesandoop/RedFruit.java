package classesandoop;

public class RedFruit {

    String type;
    String color;

    public RedFruit(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "RedFruit{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
