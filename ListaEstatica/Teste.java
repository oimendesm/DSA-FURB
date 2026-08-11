package ListaEstatica;

public class Teste {
    public static void main(String[] args) {
        ListaEstatica listaTeste = new ListaEstatica();
        
        listaTeste.inserir(5);
        listaTeste.inserir(10);
        listaTeste.inserir(15);
        listaTeste.inserir(20);
        
        System.out.println(listaTeste.toString());
    }
}
