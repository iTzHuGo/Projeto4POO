public class Recreio extends Barco{
    private int ocupacaoMaxima;

    /**
     * Contrutor de Recreio por omissao.
     */
    public Recreio() {
        super();
    }

    /**
     * Contrutor de Recreio.
     *
     * @param estrutura      a estrutura do barco
     * @param dimensao       a dimensao do barco
     * @param ocupacaoMaxima a ocupacao maxima do barco de recreio
     */
    public Recreio(String estrutura, String dimensao, int ocupacaoMaxima) {
        super(estrutura, dimensao);
        this.ocupacaoMaxima = ocupacaoMaxima;
    }

    public void escreve() {
        System.out.print("Barco de Recreio: ");
        super.escreve();
        System.out.println(", Ocupacao Maxima='" + ocupacaoMaxima + '\'');
    }

    @Override
    public String toString() {
        return "Barco de Recreio{" + "Estrutura='" + estrutura + '\'' +
                ", Dimensao='" + dimensao + '\'' + ", Matricula='" + matricula + '\'' +
                ", Ocupacao Maxima='" + ocupacaoMaxima + '\'' + '}';
    }
}
