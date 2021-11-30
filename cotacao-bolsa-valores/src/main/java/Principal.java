import adapter.Cotacao;
import adapter.CotacaoUsandoAlphaVantageAdapter;
import adapter.CotacaoUsandoQuandlAdapter;
import adapter.CotacaoUsandoYahooFinanceAdapter;

public class Principal {

	public static void main(String[] args) {

		System.out.println();

		Cotacao cotacaoUsandoYahooFinanceAdapter = new CotacaoUsandoYahooFinanceAdapter();
		cotacaoUsandoYahooFinanceAdapter.cotacaoEmpresa("MGLU3.SA");

		Cotacao cotacaoUsandoAlphaVantageAdapter = new CotacaoUsandoAlphaVantageAdapter();
		cotacaoUsandoAlphaVantageAdapter.cotacaoEmpresa("INTL");

		Cotacao cotacaoUsandoQuandlAdapter = new CotacaoUsandoQuandlAdapter();
		cotacaoUsandoQuandlAdapter.cotacaoEmpresa("WIKI/AAPL");

	}

}
