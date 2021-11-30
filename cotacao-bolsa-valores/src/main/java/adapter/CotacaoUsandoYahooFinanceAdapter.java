package adapter;


public class CotacaoUsandoYahooFinanceAdapter implements Cotacao{
	
	private final CotacaoUsandoYahooFinance cotacao;
	
	public CotacaoUsandoYahooFinanceAdapter() {
		
		cotacao = new CotacaoUsandoYahooFinance();
		
	}

	@Override
	public void cotacaoEmpresa(String codigoEmpresa) {
		
		cotacao.cotacaoYahooFinance(codigoEmpresa);
		
	}

}
