package ListasEncadeadas;

public class ListaEncadeada<T> {
    
    private NoLista<T> primeiro;

    public ListaEncadeada(){
        primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info){
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(info);
        novo.setProximo(this.primeiro);
        this.primeiro = novo;
    }

    // public void exibir(){
    //     NoLista<T> p = primeiro;
    //     while (p != null){
    //         System.out.println(p.getInfo());
    //         p = p.getProximo();
    //     }
    // }

    public boolean estaVazia(){
        if (this.primeiro == null){
            return true;
        } else {
            return false;
        }
    }

    public NoLista<T> buscar(T v){
        NoLista<T> p = primeiro;
        while (p != null){
            if (p.getInfo() == v){
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T v){
        NoLista<T> anterior = null;
        NoLista<T> p = primeiro;

        while (p != null && p.getInfo() != v) {
            anterior = p;
            p = p.getProximo();
        }

        if (p != null){
            if (p == primeiro){
                this.primeiro = p.getProximo();
            } else {
                anterior.setProximo(p.getProximo());
            }
        }

    }

    public int obterComprimento(){
        int comprimento = 0;

        NoLista<T> p = primeiro;

        while(p != null){

            comprimento++;

            p = p.getProximo();
        }

        return comprimento;
    }

    public NoLista<T> obterNo(int idx){

        int comprimento = obterComprimento();
        NoLista<T> p = primeiro;
        int index = 0;

        if (idx >= 0 && idx < comprimento){
            while (p != null){
                if (index == idx){
                    return p;
                }
                p = p.getProximo();
                index++;
            }   
            return null;
        }
        throw new IndexOutOfBoundsException();

    }

    @Override
    public String toString() {
        String resultado = "";

        NoLista<T> p = primeiro;

        while (p != null){
            if (p != primeiro){
                resultado += ",";
            }
            resultado += p.getInfo();
            p = p.getProximo();
        }

        return resultado;
    }

}