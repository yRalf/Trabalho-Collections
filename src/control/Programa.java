package control;

import org.apache.commons.collections4.map.MultiKeyMap;

import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class Programa {

    public static void main(String[] args) {
        
        MultiKeyMap multiKey = new MultiKeyMap();
       
        String descricaoProduto = "Coca-Cola";
        float preco = (float) 4.00;
        int codProduto = 50;
        
        int codPedido = 2;
        String dtEntrega = "06/12/2019";
        
        Produto prod = new Produto(codProduto,descricaoProduto,preco);
        Pedido ped = new Pedido(codPedido, dtEntrega);
        prod.addPedido(ped);
        ped.addProduto(prod);
        
        
        int qtd = 1;
        float valor = preco * qtd;
        
        ItemPedido itemPed = new ItemPedido(qtd, valor, prod, ped);
        
        multiKey.put(codProduto, codPedido, "cod");
        
        System.out.println(prod);
        System.out.println(ped);
  
        
    }

}
