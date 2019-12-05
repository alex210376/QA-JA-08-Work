package academy.lesson07.HW_L07.Lambda;

public class LambdaTest3 {
    public static void main(String[] args) {
        // Удаление пробелов
        DelSpaces delSpaces = str->{
            String resultStr = str.replaceAll(" ", "");
            return resultStr;
        };
        String originStr = "Helen Abdel Leon abc array var jMeter Selenium Yaguar";
        String resultStr;
        resultStr = delSpaces.deleteSpaces(originStr);

        System.out.println("Исходная строка: "+ originStr);
        System.out.println("Преобразованная строка: "+ resultStr);

        // Перевод в верхний регистр
        Upper upperString = str->{
            String resultStr1 = str.toUpperCase();
            return resultStr1;
        };

        String resultStr1 = upperString.upperStr(resultStr);
        System.out.println("Преобразованная строка в верхнем регистре: "+ resultStr1);

        System.out.println("Исходная строка в верхнем регистре: "+ originStr.toUpperCase());
    }
}
