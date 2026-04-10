// a) Criação da classe abstrata VeiculoAquatico
abstract class VeiculoAquatico {

    // b) Declaração dos métodos abstratos (sem corpo)
    abstract void definirRumo(int n);
    abstract void definirVelocidade(int n);
}

// c) Implementação da subclasse Can
class Canoa extends VeiculoAquatico {

    // Sobreposição (override) do método definirRumo
    @Override
    void definirRumo(int n) {
        System.out.println( n );
    }

    // Sobreposição (override) do método definirVelocidade
    @Override
    void definirVelocidade(int n) {
        System.out.println(n);
    }
}

// Classe Main para testar o código
public class Main {
    public static void main(String[] args) {
        Canoa minhaCanoa = new Canoa();
        minhaCanoa.definirRumo(90);
        minhaCanoa.definirVelocidade(10);
    }
}
