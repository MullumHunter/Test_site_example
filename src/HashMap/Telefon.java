package home.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Telefon {

    private HashMap<String, List<String>> contacts;
    Telefon() {
        contacts = new HashMap<>();
    }

    public void add(String name, String namber) {

        if (name.matches("[A-Z][a-z]*") && namber.matches("^\\d{11}$")) {
            if (contacts.containsKey(name)) {
                List<String> allContacts = contacts.get(name);
                allContacts.add(namber);
            } else {
                List<String> newContact = new ArrayList<>();
                newContact.add(namber);
                contacts.put(name, newContact);}
        } else {
            throw new IllegalArgumentException("Формат: имя с большой буквы(только латинские буквы), номер из 11 цифр");
        }
    }

    public List<String> getContacts(String name) {
        return contacts.get(name);
    }
}
