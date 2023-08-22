package Loja;

import java.util.ArrayList;
import java.util.List;

public class Loja implements Component {
 private String nome;
 private List<Component> produtos = new ArrayList<>();

 public Loja(String nome) {
     this.nome = nome;
 }

 public void adicionarProduto(Component produto) {
     produtos.add(produto);
 }

 @Override
 public double getPreco() {
     double total = 0;
     for (Component produto : produtos) {
         total += produto.getPreco();
     }
     return total;
 }

 @Override
 public void exibirInformacoes() {
     System.out.println("Loja: " + nome);
     System.out.println("Produtos disponíveis:");

     for (Component produto : produtos) {
         produto.exibirInformacoes();
     }
 }
}
