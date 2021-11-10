public class Pesca extends Barco{
    //Pesca de Rede ou Pesca de Cana
    private String tipo;

    /**
     * Contrutor de Pesca por omissao.
     */
    public Pesca() {
        super();
    }

    /**
     * Contrutor de Pesca.
     *
     * @param estrutura a estrutura do barco
     * @param dimensao  a dimensao do barco
     * @param tipo      a tipo do barco de pesca
     */
    public Pesca(String estrutura, String dimensao, String tipo) {
        super(estrutura, dimensao);
        this.tipo = tipo;
    }

    public void escreve() {
        System.out.print("Barco de Pesca: ");
        super.escreve();
        System.out.println(", Tipo de Pesca='" + tipo + '\'');
    }

    @Override
    public String toString() {
        return "Barco de Pesca  {" + "Estrutura='" + estrutura + '\'' + ", Dimensao='" + dimensao + '\'' + ", Matricula='" + matricula + '\'' + ", Tipo de Pesca='" + tipo + '\'' + '}';
    }
}
