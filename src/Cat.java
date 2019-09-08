public class Cat {
    private String name;
    private String color;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return this.name;
    }
}
