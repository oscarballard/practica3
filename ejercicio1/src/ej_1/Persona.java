package ej_1;


public class Persona  {
    
    // atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;

    public  Persona(String nombre, String apellido, int edad,String sexo) {
        
        this.nombre     = nombre; 
        this.apellido   = apellido; 
        this.edad       = edad; 
        this.sexo       = sexo; 
    }

    public void dormir(){
        System.out.println(this.nombre + " " + this.apellido + " que tiene " + this.edad + " y es de sexo " + this.sexo + " esta durmiendo");
    }

    public void comer(){
        System.out.println(this.nombre + " " + this.apellido + " que tiene " + this.edad + " y es de sexo " + this.sexo + " esta comiendo");
    }

    public void caminar(){
        System.out.println(this.nombre + " " + this.apellido + " que tiene " + this.edad + " y es de sexo " + this.sexo + " esta caminando");
    }
    
    public void correr(){
        System.out.println(this.nombre + " " + this.apellido + " que tiene " + this.edad + " y es de sexo " + this.sexo + " esta corriendo");
    }
    

}
