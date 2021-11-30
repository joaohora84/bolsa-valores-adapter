package adapter;


public class CotacaoUsandoAlphaVantageAdapter implements Cotacao{
	
	private final CotacaoUsandoAlphaVantage cotacao;
	
	public CotacaoUsandoAlphaVantageAdapter() {
		
		cotacao = new CotacaoUsandoAlphaVantage();
		
	}

	@Override
	public void cotacaoEmpresa(String codigoEmpresa) {
		
		cotacao.cotacaoAlphaVantage(codigoEmpresa);
		
	}

}
