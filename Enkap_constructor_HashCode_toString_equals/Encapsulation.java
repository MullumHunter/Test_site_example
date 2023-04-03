package Enkap_constructor_HashCode_toString_equals;


//Инкапусуляция-обьединение данных и методов в одну упаковку, и способ скрытия реализации методов что позволяет
//изменятять реализацию метода без вмешательства в другие част программы.
public class Encapsulation {

    private String title;
    private int quantity;

    Encapsulation(String title, int quantity) {
        this.quantity = quantity;
        this.title = title;
        String str = "Тотько что создался обьект оболочки";
        System.out.println(str);
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Этот обьект является оболочкой родителем";
    }
//    @Override
//    public int hashCode(){
//        return 567;
//    }
}
