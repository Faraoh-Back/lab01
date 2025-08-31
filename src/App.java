import jogo.Personagens.*;
import jogo.Monstro;
import jogo.Personagem;

public class App {
    public static void main(String[] args) {
        // Criando personagens
        Guerreiro guerreiro = new Guerreiro("Caire, o Barbaro", 100, 15);
        Mago mago = new Mago("Markin da Vara", 80, 8, 20);
        Zumbi zumbi = new Zumbi("Paravello, o Lerdo", 60, 10, 50);
        Goblin goblin = new Goblin("Black, o Infeliz", 40, 8, 30, 15);

        // Exibindo status inicial
        System.out.println("*** Status Inicial ***");
        guerreiro.Exibir_Status();
        System.out.println();
        mago.Exibir_Status();
        System.out.println();
        zumbi.Exibir_Status();
        System.out.println();
        goblin.Exibir_Status();
        System.out.println();

        // Simulando algumas ações
        System.out.println("\n*** Início da Batalha ***");
        guerreiro.atacar(zumbi);
        mago.atacar(goblin);
        zumbi.atacar(mago);
        goblin.atacar(guerreiro);

        // Usando habilidades especiais
        System.out.println("\n*** Usando Habilidades Especiais ***");
        guerreiro.usarHabilidadeEspecial();
        mago.usarHabilidadeEspecial();
        
        // Exibindo status final
        System.out.println("\n*** Status Final ***");
        guerreiro.Exibir_Status();
        System.out.println();
        mago.Exibir_Status();
        System.out.println();
        zumbi.Exibir_Status();
        System.out.println();
        goblin.Exibir_Status();
    }
}
