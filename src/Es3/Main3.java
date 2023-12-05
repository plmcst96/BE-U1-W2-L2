package Es3;

public class Main3 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Mario", "5436754");
        phonebook.add("Cristian", "3334567");
        phonebook.add("Giulio", "55543278");
        phonebook.add("Chiara", "5453678");
        phonebook.add("Miriam", "55543267");
        phonebook.add("Roberta", "55598765");

        phonebook.printAll();

        phonebook.remove("Cristian");

        System.out.println("Find 55543278 person: " + phonebook.findPerson("55543278"));
        System.out.println("Find 55543267 person: " + phonebook.findPerson("55543267"));

        System.out.println("Find Chiara number: " + phonebook.findNumber("Chiara"));
        System.out.println("Find Rpberta number: " + phonebook.findNumber("Roberta"));

        phonebook.printAll();
    }
}
