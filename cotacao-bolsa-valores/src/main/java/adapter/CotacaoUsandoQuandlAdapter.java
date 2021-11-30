package adapter;


public class CotacaoUsandoQuandlAdapter implements Cotacao{
	
	private final CotacaoUsandoQuandl cotacao;
	
	public CotacaoUsandoQuandlAdapter() {
		
		cotacao = new CotacaoUsandoQuandl();
		
	}

	@Override
	public void cotacaoEmpresa(String codigoEmpresa) {
		
		cotacao.cotacaoQuandl(codigoEmpresa);
		
	}

}
