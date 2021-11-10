public class Barco {
    protected String estrutura;
    protected String dimensao;
    protected int matricula = 0;
    private static int counter = 0;

    /**
     * Construtor da classe Barco por omissao.
     */
    public Barco() {
    }

    /**
     * Construtor da classe Barco.
     *
     * @param estrutura a estrutura do barco
     * @param dimensao  a dimensao do barco
     */
    public Barco(String estrutura, String dimensao) {
        this.estrutura = estrutura;
        this.dimensao = dimensao;
        this.matricula = ++counter;
    }

    public void escreve() {
        System.out.print("Estrutura='" + estrutura + '\'' + ", Dimensao='" + dimensao + '\'' + ", Matricula='" + matricula + '\'');
    }

    /**
     * Gets estrutura.
     *
     * @return the estrutura
     */
    public String getEstrutura() {
        return estrutura;
    }

    /**
     * Sets estrutura.
     *
     * @param estrutura the estrutura
     */
    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    /**
     * Gets dimensao.
     *
     * @return the dimensao
     */
    public String getDimensao() {
        return dimensao;
    }

    /**
     * Sets dimensao.
     *
     * @param dimensao the dimensao
     */
    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    /**
     * Gets matricula.
     *
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Sets matricula.
     *
     * @param matricula the matricula
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
