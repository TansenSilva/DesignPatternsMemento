package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementoLista = new ArrayList<>();

    public void adicionar(Memento estado){
        mementoLista.add(estado);
    }

    public Memento get(int posicao){
        return mementoLista.get(posicao);
    }
}
