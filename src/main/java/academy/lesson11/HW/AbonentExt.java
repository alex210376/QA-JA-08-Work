package academy.lesson11.HW;

import academy.lesson04.Abonent;

public class AbonentExt extends Abonent {
    private String phoneNumber;  //Телефонный номер абонента
    private String phoneCarrier; //Оператор, предоставляющий услуги связи абоненту

    public AbonentExt (){
    super();
    this.phoneNumber = "1234567";
    this.phoneCarrier = "Life";
    }

    public AbonentExt(long id, String firstName, String lastName, int age, String gender, String phoneNumber, String phoneCarrier) {
        super(id, firstName, lastName, age, gender);
        this.phoneNumber = phoneNumber;
        this.phoneCarrier = phoneCarrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneCarrier() {
        return phoneCarrier;
    }

    public void setPhoneCarrier(String phoneCarrier) {
        this.phoneCarrier = phoneCarrier;
    }
}
