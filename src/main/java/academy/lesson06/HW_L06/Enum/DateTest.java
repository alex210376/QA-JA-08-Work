package academy.lesson06.HW_L06.Enum;

public class DateTest {
    public static void main(String[] args){
        Date date = new Date(10, 5, 2019);

        date.printDateLine();
        System.out.println(); //Вывод указанной даты в неотформатированном виде

        System.out.println("*****************************");
        //Вывод даты, отформатированной в соответствии с указанным форматом (перечисление DateFormat)
        date.printDateLineFormat(DateFormat.RU);
        date.printDateLineFormat(DateFormat.ENG);
        date.printDateLineFormat(DateFormat.USA);
        date.printDateLineFormat(DateFormat.UK);
        date.printDateLineFormat(DateFormat.CUSTOM);

    }

}
