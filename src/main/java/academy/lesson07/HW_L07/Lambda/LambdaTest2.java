package academy.lesson07.HW_L07.Lambda;

public class LambdaTest2 {
    public static void main(String[] args) {
        Factorial factorial = x->{
            double result =1;
            for (int i=1; i<=x; i++)
                result = result*i;
            return result;
        };
        int x=5; //Значение, для которого нужно вычислить факториал
        System.out.println("Факториал числа \""+ x +"\" = " + factorial.factorialCalculation(x));
        x=10; //Значение, для которого нужно вычислить факториал
        System.out.println("Факториал числа \""+ x +"\" = " + factorial.factorialCalculation(x));
    }

}
