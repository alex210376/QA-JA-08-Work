package academy.lesson07.HW_L07.Interface;

public interface VisualComponent {
    void draw();

   default void draw3D() {
   System.out.println("Это метод по умолчанию из интерфейса");
   }

}
