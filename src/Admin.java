public class Admin extends Empresa {
    private String admin;

    public Admin() {
        super();
    }

    public Admin(Integer id, String nome, String cnpj, Double taxa, Double saldo) {
        super(id, nome, cnpj, taxa, saldo);
    }

}
