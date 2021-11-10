public class Fragata extends Marinha{
    //tipo de artilharia - Anti-aeria ou Antissubmarina
    private String tipoArtilharia;

    /**
     * Contrutor de Fragata por omissao.
     */
    public Fragata() {
        super();
    }

    /**
     * Construtor de Fragata.
     *
     * @param estrutura      a estrutura do barco
     * @param dimensao       a dimensao do barco
     * @param tipoArtilharia a tipo artilharia do barco fragrata
     */
    public Fragata(String estrutura, String dimensao, String tipoArtilharia) {
        super(estrutura, dimensao);
        this.tipoArtilharia = tipoArtilharia;
    }

    public void escreve() {
        System.out.print("Barco de Fragata: ");
        super.escreve();
        System.out.println(", Tipo de Artilharia='" + tipoArtilharia + '\'');
    }

    @Override
    public String toString() {
        return "Fragata         {" + "Estrutura='" + estrutura + '\'' + ", Dimensao='" + dimensao + '\'' + ", Matricula='" + matricula + '\'' + ", Tipo de Artilharia='" + tipoArtilharia + '\'' + '}';
    }
}
