package practicaMultiverse;

public class PeterParker extends Spiderman implements Verse{

    PeterParker(String name, String gender, String color){
        super(name, gender, color);
    }

    public static void main(String[] args) {
        PeterParker p = new PeterParker("Peter Parker","Masculino","Rojo y azul");
        p.msj();
        p.tierra();
        p.description();
    }

    public void tierra(){
        System.out.println("Tierra de Origen: Tierra 616.");
    }

    public void description(){
        System.out.println("El estudiante Peter Parker fue mordido por una araña radioactiva, " +"\n"+
                "lo que le dio habilidades como escalar por las paredes, agilidad, " +"\n"+
                "un sentido arácnido que se activa ante el peligro y fuerza sobrehumana. " +"\n"+
                "Tras la muerte de su tío Ben Parker, Peter aprende que " +"\n"+
                "UN GRAN PODER CONLLEVA UNA GRAN RESPONSABILIDAD, " +"\n"+
                "lo que le convierte en justiciero de Nueva York.");
    }


}
