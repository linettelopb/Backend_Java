package practicaMona;

class Mona {
    int id;
    String nombre;

    Mona(int id,String nombre){
        this.id = id;
        this.nombre = nombre;
    }
}

public class Version extends Mona {
    String actividad, color;

    Version(int id, String nombre,String actividad, String color){
        super(id,nombre);
        this.actividad = actividad;
        this.color = color;
    }

    void display (){ System.out.println(id+" - Nombre: "+nombre+". Actividad principal: "+actividad+". Color favorito: "+color); }
}