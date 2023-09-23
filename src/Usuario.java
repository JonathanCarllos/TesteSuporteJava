
public class Usuario {
	private static int lastId = 0;
    private int id;
	private String username;
	private String senha;
	private Cliente cliente;
	private Empresa empresa;
	private Admin admin;	

	public Usuario() {
		super();
	}

	public Usuario(String username, String senha, Cliente cliente, Empresa empresa, Admin admin) {
		super();
		this.id = ++lastId;
		this.username = username;
		this.senha = senha;
		this.cliente = cliente;
		this.empresa = empresa;
		this.admin = admin;
		
	}

	public boolean IsAdmin() {
		return this.admin != null;
	}

	public boolean IsEmpresa() {
		return this.empresa != null;
	}

	public boolean IsCliente() {
		return this.cliente != null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}
