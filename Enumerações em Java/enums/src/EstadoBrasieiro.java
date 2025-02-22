public enum EstadoBrasieiro {

    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
    MINAS_GERAIS("Minas Gerais", "MG"),
    PARANA("Paraná", "PR"),
    SANTA_CATARINA("Santa Catarina", "SC"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS");
    
    private String nome;
    private String sigla;

    private EstadoBrasieiro(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }   

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }   

}
