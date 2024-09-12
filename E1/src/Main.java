class Persona {
    // ...
}
class Alumno extends Persona {}

interface Objeto{}



public class Main {

    static void imprimirJerarquiaDeClasses(Class<?> c) {
        System.out.print(c.getName() + (c.getSuperclass() != null ? "  >  " : "\n"));
        if (c.getSuperclass() == null) return;
        imprimirJerarquiaDeClasses(c.getSuperclass());
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno(){};
        Objeto objeto = new Objeto(){};
        imprimirJerarquiaDeClasses(alumno.getClass());
        imprimirJerarquiaDeClasses(objeto.getClass());
    }
}