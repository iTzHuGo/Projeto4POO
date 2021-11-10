import java.util.ArrayList;
import java.lang.Math;

public class GestMarina {
    public static ArrayList<Barco> barcos;
    public static MarinaAlbufeira marina;


    public static void main(String[] args) {
        //Cria um novo objeto ArrayList
        barcos = new ArrayList<>();
        marina = new MarinaAlbufeira(barcos);
        //Loop for onde cria 10 barcos "Atracando-os" na Marina
        for (int i = 0; i < 10; i++) {
            //Atribui a option um valor aleatorio entre 0 e 3 para escolher
            //O tipo de barco a atracar
            int option = getRand(0, 3);

            switch (option) {
                case 0 -> barcoDePesca();
                case 1 -> barcoDeRecreio();
                case 2 -> fragata();
                case 3 -> torpedeiro();
            }
        }

        //Imprime os barcos contidos na ArrayList (Barcos atracados na Marina)
        for (Barco b : marina.getBarcos())
            b.escreve();
    }

    /**
     * Barco de pesca.
     * Metodo onde é criado um objeto da classe Pesca.
     */
    public static void barcoDePesca() {
        //Atribui a randTipo um valor entre 0 e 1
        int randTipo = getRand(0, 1);
        //Array de Strings com os vários tipos de pesca
        String[] tipo = {"Pesca de Cana", "Pesca de Rede"};

        //Adiciona há ArrayList de Barcos um novo objeto Pesca com especificações aleatórias e um tipo aleatório
        marina.getBarcos().add(new Pesca(randomSpecBarco()[0], randomSpecBarco()[1], tipo[randTipo]));

    }

    /**
     * Barco de recreio.
     * Metodo onde é criado um objeto da classe Recreio.
     */
    public static void barcoDeRecreio() {
        //Atribui a randOcupacao um valor entre 1 e 20
        int randOcupacao = getRand(1, 19);

        //Adiciona há ArrayList de Barcos um novo objeto Recreio com especificações aleatórias
        //e uma ocupação máxima aleatória
        marina.getBarcos().add(new Recreio(randomSpecBarco()[0], randomSpecBarco()[1], randOcupacao));
    }

    /**
     * Fragata.
     * Metodo onde é criado um objeto da classe Fragata.
     */
    public static void fragata() {
        //Atribui a randArtilharia um valor entre 0 e 1
        int randArtilharia = getRand(0, 1);
        //Array de Strings com os vários tipos de artilharia
        String[] tipo = {"Anti-Aerea", "Antissubmarina"};

        //Adiciona há ArrayList de Barcos um novo objeto Pesca com especificações aleatórias e um tipo aleatório
        marina.getBarcos().add(new Fragata(randomSpecBarco()[0], randomSpecBarco()[1], tipo[randArtilharia]));
    }

    /**
     * Torpedeiro.
     * Metodo onde é criado um objeto da classe Torpedeiro.
     */
    public static void torpedeiro() {
        //Adiciona há ArrayList de Barcos um novo objeto Pesca com especificações aleatórias
        // e um número de torpedos aleatório entre 1 e 6
        marina.getBarcos().add(new Torpedeiro(randomSpecBarco()[0], randomSpecBarco()[1], getRand(1, 6)));
    }

    /**
     * Especificações aleatórias do barco.
     * Metodo onde é atribuido a estrutura e a dimensão, valores aleatórios.
     */
    private static String[] randomSpecBarco() {
        //Atribui a randEst um valor entre 0 e 1
        int randEst = getRand(0, 1);
        //Array de Strings com os vários tipos de estrutura
        String[] estrutura = {"Rigido", "Semi-Rigido"};

        //Atribui a randDim um valor entre 0 e 2
        int randDim = getRand(0, 2);
        //Array de Strings com os vários tipos de dimensão
        String[] dimensao = {"Grande", "Medio", "Pequeno"};

        //Dá return de um array de strings com um valor aleatório de estrutura e de dimensão
        return new String[]{estrutura[randEst], dimensao[randDim]};
    }

    /**
     * Get Aleatório.
     * Metodo onde devolve um número inteiro entre o valor minimo e maximo.
     */
    private static int getRand(int min, int max) {
        int res = (int)(Math.random() * (max + 1));
        return res + min;
    }
}