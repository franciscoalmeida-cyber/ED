import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class BubbleSort {

    public static void bubbleSort(ArrayList<Integer> list) {

        int tamanho = list.size();

        for (int i = 0; i < tamanho - 1; i++) {

            for (int j = 0; j < tamanho - 1 - i; j++) {

                if (list.get(j) > list.get(j + 1)) {

                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        int[] dados = {
            432, 809, 213, 725, 37, 960, 578, 63, 921, 145,
            689, 281, 506, 955, 194, 374, 820, 62, 890, 485,
            786, 911, 394, 178, 627, 902, 420, 579, 733, 96,
            311, 654, 250, 771, 9, 624, 712, 135, 505, 884,
            445, 688, 77, 912, 721, 390, 538, 893, 470, 679,
            1, 869, 302, 946, 561, 144, 790, 422, 769, 57,
            899, 308, 687, 469, 237, 630, 961, 36, 578, 799,
            180, 628, 886, 298, 835, 62, 974, 214, 518, 746,
            132, 899, 243, 511, 798, 235, 681, 61, 918, 375,
            692, 993, 183, 553, 846, 24, 954, 286, 647, 129
        };

        for (int numero : dados) {
            numeros.add(numero);
        }

        ArrayList<Integer> melhorCaso = new ArrayList<>(numeros);

        Collections.sort(melhorCaso);

        long inicioMelhor = System.nanoTime();

        bubbleSort(melhorCaso);

        long fimMelhor = System.nanoTime();

        long tempoMelhor = fimMelhor - inicioMelhor;

        ArrayList<Integer> piorCaso = new ArrayList<>(numeros);

        Collections.sort(piorCaso);
        Collections.reverse(piorCaso);

        long inicioPior = System.nanoTime();

        bubbleSort(piorCaso);

        long fimPior = System.nanoTime();

        long tempoPior = fimPior - inicioPior;

        JOptionPane.showMessageDialog(
            null,
            "MELHOR CASO (lista já ordenada)\n"
            + "Complexidade: O(n)\n"
            + "Tempo: " + tempoMelhor + " ns\n\n"

            + "PIOR CASO (lista em ordem inversa)\n"
            + "Complexidade: O(n²)\n"
            + "Tempo: " + tempoPior + " ns"
        );

        JOptionPane.showMessageDialog(
            null,
            "Lista ordenada com Bubble Sort:\n" + piorCaso
        );
    }
}
