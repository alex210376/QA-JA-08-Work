package academy.lesson07.HW_L07.Lambda;

public class LambdaTest1 {

  public static void main(String[] args) {
        Check check = x->{
            if(x>=10 && x<=20)
                System.out.println("Указанное число входит в диапазон \"10 - 20\"");
            else
                System.out.println("Указанное число не входит в диапазон \"10 - 20\"");
        };
        check.checkNumber(21);
    }
}

