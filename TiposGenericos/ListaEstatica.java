package TiposGenericos;

public class ListaEstatica<T> {
    
    private Object[] info;
    private int tamanho;

    public ListaEstatica(){
        info = new Object[10];
        tamanho = 0;
    }

    private void redimensionar(){
        Object[] novo = new Object[info.length + 10];
        
        for (int i=0; i<tamanho; i++){
            novo[i] = info[i];
        }

        info = novo;
    }

    public void inserir(T valor){
        if (tamanho == info.length){
            redimensionar();
        }

        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir() {
        for (int i=0; i<tamanho; i++){
            System.out.println(info[i]);
        }
    }

    public int buscar(T valor){
        
        for (int i=0; i<tamanho; i++){
            if (info[i].equals(valor)){
                return i;
            }
        }

        return -1;
    }

    public void retirar(T valor){
        int index = buscar(valor);

        if (index > -1){
            for (int i = index+1; i<tamanho; i++){
               info[i-1] = info[i];
            }
        }

        tamanho--;
    }

    public void liberar(){
        info = new Object[10];
        tamanho = 0;
    }

    public T obterElemento(int posicao){
        
        if (posicao >= 0 && posicao < tamanho){
            return (T) info[posicao];
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

    public void inverter() {

        int esquerda = 0, direita = tamanho -1;
        
        while (esquerda < direita) {
            Object temp = info[esquerda];
            info[esquerda] = info[direita];
            info[direita] = temp;

            esquerda++;
            direita--;
        }

    }
}

