
public class Item{
	
	private long id_pedido;
	
	public long getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(long id_pedido) {
		this.id_pedido = id_pedido;
	}

	private String descricao;
	private int quantidade;
	private double valorUnitario;
	
	public Item(String newDescricao, int newQuantidade, double newValor){
		this.descricao = newDescricao;
		this.quantidade = newQuantidade;
		this.valorUnitario = newValor;
	}
	public String getDescricao(){
		return this.descricao;
	}
	
	public double getValorTotalItem(){
		return this.quantidade * this.valorUnitario;
	}
	
	public String toString(){
		return "Descricao: " + this.descricao + " - " + "Qtd:" +
		this.quantidade + " - " + "Valor: " + this.valorUnitario + "\n";
	}

	
	
	public int getQuantidade(){
		return this.quantidade;
	}

	public double getValorUnitario(){
		return this.valorUnitario;
	}	
}