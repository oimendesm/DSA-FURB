package ListasEncadeadas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlanoDeTestes {
    
    @Test
    public void caso01(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        assertTrue(lista.estaVazia());
    }

    @Test
    public void caso02(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserir(5);

        assertFalse(lista.estaVazia());
    }

    @Test
    public void caso03(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserir(5);

        int valorNo = lista.getPrimeiro().getInfo();

        assertEquals(5, valorNo);
        assertEquals(1,lista.obterComprimento());
    }

    @Test
    public void caso04(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);

        String objetosLista = lista.toString();

        assertEquals("15,10,5", objetosLista);
    }

    @Test
    public void caso05(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        int valorNo = lista.buscar(20).getInfo();

        assertEquals(20, valorNo);

    }

    @Test
    public void caso06(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        int valorNo = lista.buscar(15).getInfo();

        assertEquals(15, valorNo);
    }

    @Test
    public void caso07(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertNull(lista.buscar(50));
    }

    @Test
    public void caso08(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(20);

        String objetosLista = lista.toString();

        assertEquals("15,10,5", objetosLista);
    }

    @Test
    public void caso09(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(15);

        String objetosLista = lista.toString();

        assertEquals("20,10,5", objetosLista);
    }

    @Test
    public void caso10(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        int valorNo = lista.obterNo(0).getInfo();

        assertEquals(20, valorNo);

    }

    @Test
    public void caso11(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        int valorNo = lista.obterNo(3).getInfo();

        assertEquals(5, valorNo);
    }

    @Test
    public void caso12(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);


        assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.obterNo(10); 
        });
    }

    @Test
    public void caso13(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        assertEquals(0, lista.obterComprimento());
    }

    @Test
    public void caso14(){

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(4, lista.obterComprimento());
    }


}
