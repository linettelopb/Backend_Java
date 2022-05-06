package practicaMultiverse;

public class GwenStacy extends Spiderman implements Verse{
    GwenStacy(String name, String gender, String color){
        super(name, gender, color);
    }

    public static void main(String[] args) {
        GwenStacy g = new GwenStacy("Gwen Stacy","femenino","negro y azul");
        g.msj();
        g.tierra();
        g.description();
    }

    public void tierra(){
        System.out.println("Tierra 65.");
    }

    public void description(){
        System.out.println("En una realidad alterna, Gwen Stacy es mordida por una araña radioactiva, " +"\n"+
                "en lugar de Peter Parker. Stacy se da cuenta que adquirió agilidad arácnida, " +"\n"+
                "un sexto sentido que se activa con el peligro, habilidad de escalar " +"\n"+
                "por las paredes, convirtiéndose en Spider-Woman. Parker crea una fórmula " +"\n"+
                "que le convierte en The Lizard y pelea con Spider-Woman, quien le " +"\n"+
                "provoca la muerte. A partir de ese momento Gwen decide formar " +"\n"+
                "su propio legado, ahora como Spider-Gwen.");
    }
}
