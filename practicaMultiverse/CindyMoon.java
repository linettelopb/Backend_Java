package practicaMultiverse;

public class CindyMoon extends Spiderman implements Verse{
    CindyMoon(String name, String gender, String color){
        super(name, gender, color);
    }

    public static void main(String[] args) {
        CindyMoon c = new CindyMoon("Cindy Moon","femenino","negro y rojo");
        c.msj();
        c.tierra();
        c.description();
    }

    public void tierra(){
        System.out.println("Tierra 616.");
    }

    public void description(){
        System.out.println("La araña que muerde a Peter Parker también muerde a la adolescente Cindy Moon. " +"\n"+
                "Ante el desconocimiento de sus poderes, Ezekiel Simms se ofrece a ayudarla para " +"\n"+
                "entrenarle, pero la encierra por 10 años en un bunker. Tras ese tiempo Cindy " +"\n"+
                "es rescatada por Spider-Man, por quien la dama siente una atracción.");
    }
}
