package practicaMultiverse;

public class Spiderman {
    String name, gender, color;

    public Spiderman() {

    }

    public Spiderman(String name,String gender,String color){
        this.name = name;
        this.gender = gender;
        this.color = color;
    }

    public String getName(){ return name;}
    public String getGender(){ return gender;}
    public String getColor(){ return color;}

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        } else
            return false;
    }

    public boolean setColor(String color){
        if(!color.isEmpty()) {
            this.color = color;
            return true;
        } else
            return false;
    }

    public void msj(){
        System.out.println("Nombre: "+name+"\n"+
                "Genero: "+gender+"\n"+
                "Color: "+color+"\n");
    }

}
