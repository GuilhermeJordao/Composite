package Loja;

public class Item implements Component {
 private String nome;
 private double preco;

 public Item(String nome, double preco) {
     this.nome = nome;
     this.preco = preco;
 }

 @Override
 public double getPreco() {
     return preco;
 }

 @Override
 public void exibirInformacoes() {
     System.out.println("Item: " + nome + " - Preço: $" + preco);
 }
}
