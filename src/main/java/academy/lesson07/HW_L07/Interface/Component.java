package academy.lesson07.HW_L07.Interface;

public class Component implements VisualComponent {
    private String name;
    private String color;

    public Component(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void draw(){
        System.out.println("Графический компонент " + name);
        System.out.println();
    }
}
