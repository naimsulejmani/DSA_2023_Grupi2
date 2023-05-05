package hashtables;

public class HashTableTest {
    public static void main(String[] args) {
        HashTable<String, String> configurations = new HashTable<>();
        HashTable<String, String> albanianLanguage = new HashTable<>();
        HashTable<String, String> englishLanguage = new HashTable<>();

        configurations.put("ip", "127.0.0.1");
        configurations.put("dbName", "CacttusGrup2");
        configurations.put("user", "admin");
        configurations.put("password", "admin");
        configurations.put("port", "1433");
        configurations.put("logo", "c:\\Desktop\\logo.png");
        configurations.put("selectedTheme", "black theme");

        albanianLanguage.put("lblSurname", "Mbiemri");
        englishLanguage.put("lblSurname", "Surname");

        System.out.println("Kyes:");
        for (String key : configurations.keys()) {
            System.out.printf("%15s", key);
        }
        System.out.println();
        System.out.println("Values: ");
        for (String value : configurations.values()) {
            System.out.printf("%15s", value);
        }
        System.out.println();

        System.out.println(configurations.containsKey("dbName"));
        System.out.println(configurations.containsValue("admin"));

        System.out.println(configurations.get("dbName"));
        configurations.replace("dbName", "DSA_OOP_DB");
        System.out.println(configurations.get("dbName"));


    }
}






