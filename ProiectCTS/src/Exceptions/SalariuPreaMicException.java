package Exceptions;

public class SalariuPreaMicException extends Exception{
public SalariuPreaMicException(){
    super("Salariul este prea mic pentru a fi redus. Angajatul trebuie dat afara");
}
}
