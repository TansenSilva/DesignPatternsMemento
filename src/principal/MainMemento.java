package principal;

import memento.CareTaker;
import memento.Originator;

public class MainMemento {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setEstado("Estado 1");
        careTaker.adicionar(originator.salvarEstadoMemento());

        originator.setEstado("Estado 2");
        careTaker.adicionar(originator.salvarEstadoMemento());

        originator.setEstado("Estado Inicial");
        System.out.println("Estado atual: " + originator.getEstado());

        originator.getEstadoSalvoMemento(careTaker.get(0));
        System.out.println("Primeiro estado salvo: " + originator.getEstado());
        originator.getEstadoSalvoMemento(careTaker.get(1));
        System.out.println("Primeiro estado salvo: " + originator.getEstado());

    }
}
