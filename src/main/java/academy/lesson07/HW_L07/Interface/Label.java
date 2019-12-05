package academy.lesson07.HW_L07.Interface;

public class Label extends Component {
    private int numberOfLines;
    private int numberOfSymbol;

    public Label(String name, String color, int numberOfLines, int numberOfSymbol) {
        super(name, color);
        this.numberOfLines = numberOfLines;
        this.numberOfSymbol = numberOfSymbol;
    }

    @Override
    public void draw() {
        System.out.println("Это метка");
        System.out.println("Название компонета: "+this.getName()+"," +
                " Цвет компонента: "+ this.getColor()+","+
                " Количество строк: "+ numberOfLines+","+
                " Количество символов: "+ numberOfSymbol);
        System.out.println();
    }

    @Override
    public void draw3D() {
        System.out.println("Переопределенный метод для компонента \"Label\"");
    }
}
