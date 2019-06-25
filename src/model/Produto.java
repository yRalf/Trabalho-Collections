package model;

import java.util.ArrayList;

public class Produto {
	private int codigoProduto;
	private float preco;
	private String descricaoProduto;
	ArrayList<Pedido> listaPedido = new ArrayList<Pedido>();

	public Produto() {
	}

	public Produto(int codigoProduto, String descricaoProduto, float preco) {
		super();
		this.codigoProduto = codigoProduto;
		this.descricaoProduto = descricaoProduto;
		this.preco = preco;
		this.listaPedido = new ArrayList<Pedido>();
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	
	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public ArrayList<Pedido> getListaPedido() {
		return listaPedido;
	}

	public void setListaPedido(ArrayList<Pedido> listaPedido) {
		this.listaPedido = listaPedido;
	}

	public void addPedido(Pedido novoPedido) {
		 if(listaPedido.contains(novoPedido))
	            return;
	        else{
	        	listaPedido.add(novoPedido);
	        }
	}
	
	public void removePedido(Pedido exPedido) {
		 if(!listaPedido.contains(exPedido))
	            return;
	        else{
	        	listaPedido.remove(exPedido);
	        }
	}

	public String toString() {
		
		return "Código: " + codigoProduto + " - " + "Descrição: " + descricaoProduto; 
	}
}
