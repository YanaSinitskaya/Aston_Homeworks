package lesson13.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phone) {
        if (!phoneBook.containsKey(lastName)) {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phone);
            phoneBook.put(lastName, phoneNumbers);
        } else {
            phoneBook.get(lastName).add(phone);
        }
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }
}
