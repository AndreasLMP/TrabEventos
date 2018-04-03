package pojo;

public class Local {
	//atributos
	private int id;
	private double custo;
	private CadastroPessoaJuridica cadastro;
	private Localizacao localizacao;
	private Estrutura[] estrutura;
	
	private int maximoPessoas;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public CadastroPessoaJuridica getCadastro() {
		return cadastro;
	}
	public void setCadastro(CadastroPessoaJuridica cadastro) {
		this.cadastro = cadastro;
	}
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	
	public Estrutura[] getEstrutura() {
		return estrutura;
	}
	public void setEstrutura(Estrutura[] estrutura) {
		this.estrutura = estrutura;
	}	
	public int getMaximoPessoas() {
		return maximoPessoas;
	}
	public void setMaximoPessoas(int maximoPessoas) {
		this.maximoPessoas = maximoPessoas;
	}
	
	
	
}
