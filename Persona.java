public class Persona {
private String nombre;
private int edad;
public Persona(String nombre, int edad){
this.nombre = nombre;
this.edad = edad;
}
public String getNombre(){
return this.nombre;
}
public int getEdad(){
return this.edad;
}

public void imprimirDatos() {
System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + nombre);
}
}
public class Persona {
private String nombre;
private int edad;
private String correo;
public Persona(String nombre, int edad,
String correo){
this.nombre = nombre;
this.edad = edad;
this.correo = correo;
}
public void imprimirDatos() {
System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + nombre);
System.out.println("Correo: " + correo);
}

