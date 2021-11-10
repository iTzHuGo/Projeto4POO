public class Torpedeiro extends Marinha {
    //Numero de torpedos, limitado de 1 a 6
    private int nTorpedos;

    /**
     * Construtor de Torpedeiro por omissao.
     */
    public Torpedeiro(){
        super();
    }

    /**
     * Construtor de Torpedeiro.
     *
     * @param estrutura a estrutura do barco
     * @param dimensao  a dimensao do barco
     * @param nTorpedos a n torpedos do barco torpedeiro
     */
    public Torpedeiro(String estrutura, String dimensao, int nTorpedos) {
        super(estrutura, dimensao);
        this.nTorpedos = nTorpedos;
    }

    public void escreve() {
        System.out.print("Barco de Torpedeiro: ");
        super.escreve();
        System.out.println(", Numero de Torpedos='" + nTorpedos + '\'');
    }

    @Override
    public String toString() {
        return "Torpedeiro      {" + "Estrutura='" + estrutura + '\'' + ", Dimensao='" + dimensao + '\'' + ", Matricula='" + matricula + '\'' + ", Numero de Torpedos='" + nTorpedos + '\'' + '}';
    }
}
