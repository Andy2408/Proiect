package Exceptions;

public class NuExistaAngajatException extends Exception {
	public NuExistaAngajatException(){
        super("Angajatul pe care doriti sa il stergeti nu exista");
    }
}
