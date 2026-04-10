

package aula_3;
import java.util.HashMap;
import java.util.Map;

public class Pessoas {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();

        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String nome : people.keySet()) {
            Integer idade = people.get(nome);
            if (idade < 31) {
                System.out.println("key: " + nome + " value: " + idade);
            }
        }
    }
}
