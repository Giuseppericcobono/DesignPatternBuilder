//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video

public class Main {
public static void main(String[] args) {

    Builder person1 = new Builder("Giuseppe", "Riccobono");
            person1.age(28);
            person1.address("123 Main Street");

    System.out.println(person1);

    Builder person2 = new Builder("Clara", "Miceli");
            person2.age(25);

    System.out.println(person2);

}
}