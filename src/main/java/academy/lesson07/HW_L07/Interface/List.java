package academy.lesson07.HW_L07.Interface;

public class List extends Component {

    private int numberOfPositions;
    private int rowSize;

    public List(String name, String color, int numberOfPositions, int rowSize) {
        super(name, color);
        this.numberOfPositions = numberOfPositions;
        this.rowSize = rowSize;
    }

    @Override
    public void draw() {
        System.out.println("Это список");
        System.out.println("Название компонета: "+this.getName()+","+
                " Цвет компонента: "+ this.getColor()+","+
                " Количество позиций: "+ numberOfPositions+","+
                " Размер строки: "+ rowSize);
        System.out.println();

    }
}
