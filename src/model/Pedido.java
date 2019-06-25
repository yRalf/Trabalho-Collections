package model;

import java.util.ArrayList;
import java.util.Calendar;


public class Pedido {
	private String dtPedido;
	private String dtEntrega;
	private int codigo;
	ArrayList<Produto> listaProduto  = new ArrayList<Produto>();
	
	public Pedido() {
	}
	
	public Pedido(int codigo, String dtEntrega) {
		this.codigo = codigo;
		this.dtEntrega = dtEntrega;
		this.listaProduto = new ArrayList<Produto>();
		
	       Calendar cal = Calendar.getInstance();
	        
	        int dia = cal.get(Calendar.DAY_OF_MONTH);
	        int mes = cal.get(Calendar.MONTH)+1;
	        int ano = cal.get(Calendar.YEAR);
	        
	        this.dtPedido = dia + "/" + mes + "/" + ano;
	}

	public String getDtPedido() {
		return dtPedido;
	}

	public void setDtPedido(String dtPedido) {
		this.dtPedido = dtPedido;
	}

	public String getdtEntrega() {
		return dtEntrega;
	}

	public void setdtEntrega(String dtEntrega) {
		this.dtEntrega = dtEntrega;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public ArrayList<Produto> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(ArrayList<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}

	 public void addProduto(Produto novoProduto) {
	        listaProduto.add(novoProduto);
	    }
	    
	    public void removeProduto(Produto exProduto) {
	        if (!listaProduto.contains(exProduto))
	            return;
	        else
	            listaProduto.remove(exProduto);
	    }
	    
		public String toString() {
			
			return "Código do Pedido: " + codigo + " - " + "Data do Pedido: " + dtPedido + " - Data de Entrega: " + dtEntrega; 
		}
	
}
