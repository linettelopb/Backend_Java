package PracticaHarry;

public class Personajes {
    public static void main(String[] args) {
        hermioneGranger();
        harryPotter();
        bellatrixLestrange();
        lunaLovegood();
        severusSnape();
    }

    public static void hermioneGranger(){
        Mago mago = new Mago();
        mago.setNombre("Hermione Granger");
        mago.setCasa("Grynffindor");
        mago.setGenero("Femenino");
        mago.setBoggart("Fracaso");
        mago.setPatronus("Nutria");
        String msg = "Hola soy una estudiante de magia y hechiceria en Hogwarts.";
        msg += "\nMi nombre es: "+mago.getNombre();
        msg += "\nPertenezco a la casa de: "+mago.getCasa();
        msg += "\nMe identifico del genero: "+mago.getGenero();
        msg += "\nMi boggart es: "+mago.getBoggart();
        msg += "\nY mi patronus es una: "+mago.getPatronus()+"\n";
        System.out.println(msg);
    }

    public static void harryPotter(){
        Mago mago = new Mago();
        mago.setNombre("Harry Potter");
        mago.setCasa("Grynffindor");
        mago.setGenero("Masculino");
        mago.setBoggart("Dementor");
        mago.setPatronus("Ciervo");
        String msg = "Hola soy un estudiante de magia y hechiceria en Hogwarts.";
        msg += "\nMi nombre es: "+mago.getNombre();
        msg += "\nPertenezco a la casa de: "+mago.getCasa();
        msg += "\nMe identifico del genero: "+mago.getGenero();
        msg += "\nMi boggart es un: "+mago.getBoggart();
        msg += "\nY mi patronus es una: "+mago.getPatronus()+"\n";
        System.out.println(msg);
    }

    public static void bellatrixLestrange(){
        Mago mago = new Mago();
        mago.setNombre("Bellatrix Lestrange");
        mago.setCasa("Slytherin");
        mago.setGenero("Femenino");
        mago.setBoggart("Voldemort muerto");
        String msg = "Hola soy un mortifago.";
        msg += "\nMi nombre es: "+mago.getNombre();
        msg += "\nPertenezco a la casa de: "+mago.getCasa();
        msg += "\nMe identifico del genero: "+mago.getGenero();
        msg += "\nMi boggart es un: "+mago.getBoggart();
        msg += "\nY no tengo patronus.\n";
        System.out.println(msg);
    }

    public static void lunaLovegood(){
        Mago mago = new Mago();
        mago.setNombre("Luna Lovegood");
        mago.setCasa("Grynffindor");
        mago.setGenero("Femenino");
        mago.setBoggart("Ser enterrada viva.");
        mago.setPatronus("Liebre");
        String msg = "Hola soy una estudiante de Hogwarts.";
        msg += "\nMi nombre es: "+mago.getNombre();
        msg += "\nPertenezco a la casa de: "+mago.getCasa();
        msg += "\nMe identifico del genero: "+mago.getGenero();
        msg += "\nMi boggart es un: "+mago.getBoggart();
        msg += "\nY mi patronus es una: "+mago.getPatronus()+"\n";
        System.out.println(msg);
    }

    public static void severusSnape(){
        Mago mago = new Mago();
        mago.setNombre("Severus Snape");
        mago.setCasa("Slytherin");
        mago.setGenero("Masculino");
        mago.setBoggart("Lord Voldemort");
        mago.setPatronus("Cierva");
        String msg = "Hola soy profesor de Hogwarts.";
        msg += "\nMi nombre es: "+mago.getNombre();
        msg += "\nPertenezco a la casa de: "+mago.getCasa();
        msg += "\nMe identifico del genero: "+mago.getGenero();
        msg += "\nMi boggart es: "+mago.getBoggart();
        msg += "\nY mi patronus es una: "+mago.getPatronus()+"\n";
        System.out.println(msg);
    }
}
