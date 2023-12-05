package Es3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook{
   public HashMap<String, String> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String name, String number){
        this.phonebook.put(name,number);
    }

    public  void remove(String name){
        this.phonebook.remove(name);
    }


    public String findPerson(String number){
        for (Map.Entry<String, String> chiave : this.phonebook.entrySet()){
            if (chiave.getValue().equals(number)) return chiave.getKey();
        }
          return "not found";
    }

    public String findNumber(String name){
      if (this.phonebook.get(name) != null) return this.phonebook.get(name);
      else return "not found";
    }


    public void printAll(){
        for ( Map.Entry<String, String> chiave: this.phonebook.entrySet()) {
            System.out.println(chiave.getKey() + " - " + chiave.getValue());
        }
    }
}
