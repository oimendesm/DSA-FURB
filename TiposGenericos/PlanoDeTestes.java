package TiposGenericos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlanoDeTestes {
    
    @Test
    public void caso1(){
        ListaEstatica<Integer> listaTeste = new ListaEstatica<>();
        
        listaTeste.inserir(5);
        listaTeste.inserir(10);
        listaTeste.inserir(15);
        listaTeste.inserir(20);
        
        assertEquals("5,10,15,20", listaTeste.toString());
    }

    @Test
    public void caso2(){
        ListaEstatica<Integer> listaTeste = new ListaEstatica<>();
        
        listaTeste.inserir(5);
        listaTeste.inserir(10);
        listaTeste.inserir(15);
        listaTeste.inserir(20);

        assertEquals(4, listaTeste.getTamanho());
    }

    @Test
    public void caso3(){
        ListaEstatica<Integer> listaTeste = new ListaEstatica<>();        
        
        listaTeste.inserir(5);
        listaTeste.inserir(10);
        listaTeste.inserir(15);
        listaTeste.inserir(20);

        assertEquals(2, listaTeste.buscar(15));
    }

    @Test
    public void caso4(){
        ListaEstatica<Integer> listaTeste = new ListaEstatica<>();
        
        listaTeste.inserir(5);
        listaTeste.inserir(10);
        listaTeste.inserir(15);
        listaTeste.inserir(20);

        assertEquals(-1, listaTeste.buscar(30));
    }

    @Test
    public void caso5(){
        ListaEstatica<Integer> listaTeste = new ListaEstatica<>();
        
        listaTeste.inserir(5);
        listaTeste.inserir(10);
        listaTeste.inserir(15);
        listaTeste.inserir(20);

        listaTeste.retirar(10);

        assertEquals("5,15,20", listaTeste.toString());
        assertEquals(3, listaTeste.getTamanho());
    }

    @Test
    public void caso6(){
        ListaEstatica<Integer> listaTeste = new ListaEstatica<>();

        for (int i=1; i<16; i++){
            listaTeste.inserir(i);
        }

        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15", listaTeste.toString());
    }

    @Test
    public void caso7(){
        ListaEstatica<Integer> listaTeste = new ListaEstatica<>();
        
        listaTeste.inserir(5);
        listaTeste.inserir(10);
        listaTeste.inserir(15);
        listaTeste.inserir(20);

        assertEquals(20, (int) listaTeste.obterElemento(3));
    }

    @Test
    public void caso8(){
        ListaEstatica<Integer> listaTeste = new ListaEstatica<>();
        
        listaTeste.inserir(5);
        listaTeste.inserir(10);
        listaTeste.inserir(15);
        listaTeste.inserir(20);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            listaTeste.obterElemento(5); 
        });
    }

    @Test
    public void caso9(){
        ListaEstatica<Integer> listaTeste = new ListaEstatica<>();
        
        listaTeste.inserir(5);
        listaTeste.inserir(10);
        listaTeste.inserir(15);
        listaTeste.inserir(20);

        listaTeste.liberar();

        assertTrue(listaTeste.estaVazia());
    }

    @Test
    public void caso10(){
        ListaEstatica<Integer> listaTeste = new ListaEstatica<>();
        
        listaTeste.inserir(5);
        listaTeste.inserir(10);
        listaTeste.inserir(15);
        listaTeste.inserir(20);

        listaTeste.inverter();

        assertEquals("20,15,10,5", listaTeste.toString());
    }

    @Test
    public void caso11(){
        ListaEstatica<Integer> listaTeste = new ListaEstatica<>();
        
        listaTeste.inserir(5);
        listaTeste.inserir(10);
        listaTeste.inserir(15);
        listaTeste.inserir(20);
        listaTeste.inserir(25);

        listaTeste.inverter();

        assertEquals("25,20,15,10,5", listaTeste.toString());
    }



}
