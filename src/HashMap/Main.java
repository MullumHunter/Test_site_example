package HashMap;

public class Main {
    public static void main(String[] args) {

        Telefon telefon = new Telefon();

        telefon.add("Gosha", "89990000001");
        telefon.add("Gosha", "89990000002");
        telefon.add("Gosha", "89990000003");

        System.out.println(telefon.getContacts("Gosha"));

    }
}
