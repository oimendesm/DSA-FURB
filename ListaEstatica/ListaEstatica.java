package ListaEstatica;

public class ListaEstatica {
    
    private int[] info;
    private int tamanho;

    public ListaEstatica(){
        info = new int[10];
        tamanho = 0;
    }

    private void redimensionar(){
        int[] novo = new int[info.length + 10];
        
        for (int i=0; i<tamanho; i++){
            novo[i] = info[i];
        }

        info = novo;
    }

    public void inserir(int valor){
        if (tamanho == info.length){
            redimensionar();
        }

        info[tamanho] = valor;
    }

    public void exibir() {
        for (int i=0; i<tamanho; i++){
            System.out.println(info[i]);
        }
    }

    public int buscar(int valor){
        
        for (int i=0; i<tamanho; i++){
            if (info[i] == valor){
                return i;
            }
        }

        return -1;
    }

    public void retirar(int valor){
        int index = buscar(valor);

        if (index > -1){
            for (int i = index+1; i<tamanho; i++){
               info[i-1] = info[i];
            }
        }

        tamanho--;
    }

    public void liberar(){
        info = new int[10];
        tamanho = 0;
    }

    public int obterElemento(int posicao){
        
        if (posicao >= 0 && posicao < tamanho){
            return info[posicao];
        }

        throw new IndexOutOfBoundsException();
    }

    public boolean estaVazia(){
        if (tamanho > 0){
            return false;
        } else {
            return true;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        String resultado = "";
        
        for (int i=0; i<tamanho; i++){
            if (i>0){
                resultado += ",";
            }
            resultado += info[i];
        }

        return resultado;
    }
}
