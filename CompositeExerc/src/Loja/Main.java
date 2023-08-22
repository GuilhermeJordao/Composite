package Loja;

public class Main {
    public static void main(String[] args) {
        Component mouse = new Item("Mouse", 10.0);
        Component teclado = new Item("Teclado", 20.0);
        Component monitor = new Item("Monitor", 150.0);
        Component impressora = new Item("Impressora", 100.0);
        Component cpu = new Item("CPU", 300.0);
        Component fonte = new Item("Fonte", 50.0);
        Component processador = new Item("Processador", 150.0);
        Component memoriaRAM = new Item("Memória RAM", 80.0);
        Component hd = new Item("HD", 70.0);
        Component ssd = new Item("SSD", 100.0);

        Loja loja = new Loja("Loja de Produtos de Informática");
        loja.adicionarProduto(mouse);
        loja.adicionarProduto(teclado);
        loja.adicionarProduto(monitor);
        loja.adicionarProduto(ssd);
        loja.adicionarProduto(memoriaRAM);

        loja.exibirInformacoes();
        
        double precoTotal = loja.getPreco();
        System.out.println("Preço total do Produto: $" + precoTotal);
    }
}

