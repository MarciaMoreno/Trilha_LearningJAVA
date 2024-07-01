package ConstrutoresEmClasses;
//Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	
	RONDONIA("Norte","Rondônia","RO",11),
	ACRE("Norte","Acre","AC",12),
	AMAZONAS("Norte","Amazonas","AM",13),
	RORAIMA("Norte","Roraima","RO",14),
	PARA("Norte","Pará","PA",15),
	AMAPA("Norte","Amapá","AM",16),
	TOCANTINS("Norte","Tocantins","TO",17),
	MARANHAO("Nordeste","Maranhão","MA",21),
	PIAUI("Nordeste","Piauí","PI",22),
	CEARA("Nordeste","Ceará","CE",23),
	RIO_GRANDE_DO_NORTE("Nordeste","Rio Grande do Norte","RN",24),
	PARAIBA("Nordeste","Paraíba","PB",25),
	PERNAMBUCO("Nordeste","Pernambuco","PE",26),
	ALAGOAS("Nordeste","Alagoas","AL",27),
	SERGIPE("Nordeste","Sergipe","SE",28),
	BAHIA("Nordeste","Bahia","BA",29),
	MINAS_GERAIS("Sudeste","Minas Gerais","MG",31),
	ESPIRITO_SANTO("Sudeste","Espírito Santo","ES",32),
	RIO_DE_JANEIRO("Sudeste","Rio de Janeiro","RJ",33),
	SAO_PAULO("Sudeste","São Paulo","SP",35),
	PARANA("Sul","Paraná","PR",41),
	SANTA_CATARINA("Sul","Santa Catarina","SC",42),
	RIO_GRANDE_DO_SUL("Sul","Rio Grande do Sul","RS",43),
	MATO_GROSSO_DO_SUL("Centro-Oeste","Mato Grosso do Sul","MS",50),
	MATO_GROSSO("Centro-Oeste","Mato Grosso","MT",51),
	GOIAS("Centro-Oeste","Góias","GO",52),
	DISTRITO_FEDERAL("Centro-Oeste","Distrito-Federal","DF",53),
	;
	private String regiao;
	private String estado;
	private String sigla;
	private int  codigoIbge;
	
	private EstadoBrasileiro(String regiao, String sigla, String estado, int codigoIbge) {		
		this.regiao = regiao;
		this.estado = estado;
		this.sigla = sigla;
		this.codigoIbge = codigoIbge;
	}
	public String getRegiao() {
		return regiao;
	}
	public String getEstado() {
		return estado;
	}
	public String getSigla() {
		return sigla;
	}
	public int getCodigoIbge() {
		return codigoIbge;
	}
	public String getNomeMaiusculo() {
		return estado.toUpperCase();
	}
	
