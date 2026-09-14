import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class QuickSort {

    public static void quickSort(ArrayList<Integer> list, int inicio, int fim) {

        if (inicio < fim) {

            int posiPivo = part(list, inicio, fim);

            quickSort(list, inicio, posiPivo - 1);
            quickSort(list, posiPivo + 1, fim);
        }
    }

    public static int part(ArrayList<Integer> list, int inicio, int fim) {

        int pivo = list.get(fim);
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {

            if (list.get(j) < pivo) {

                i++;

                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        int temp = list.get(i + 1);
        list.set(i + 1, list.get(fim));
        list.set(fim, temp);

        return i + 1;
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

        Collections.shuffle(melhorCaso);

        long inicioMelhor = System.nanoTime();

        quickSort(melhorCaso, 0, melhorCaso.size() - 1);

        long fimMelhor = System.nanoTime();

        long tempoMelhor = fimMelhor - inicioMelhor;

        ArrayList<Integer> piorCaso = new ArrayList<>(numeros);

        Collections.sort(piorCaso);

        long inicioPior = System.nanoTime();

        quickSort(piorCaso, 0, piorCaso.size() - 1);

        long fimPior = System.nanoTime();

        long tempoPior = fimPior - inicioPior;

        JOptionPane.showMessageDialog(
            null,
            "MELHOR CASO (lista aleatória)\n"
            + "Complexidade: O(n log n)\n"
            + "Tempo: " + tempoMelhor + " ns\n\n"

            + "PIOR CASO (lista já ordenada)\n"
            + "Complexidade: O(n²)\n"
            + "Tempo: " + tempoPior + " ns"
        );

        JOptionPane.showMessageDialog(
            null,
            "Lista ordenada:\n" + melhorCaso
        );
    }
}
