package operaciones;

public class Aritmetica {
//atributos de la clase

    int a;
    int b;

//COnstructor vacio
    public Aritmetica() {
        System.out.println("ejecutando constructor");
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructores con arg");
    }

//método
    public void sumar() {
        int resultado = this.a + this.b;
        System.out.println("suma: " + resultado);
    }

    public int sumarConRetorno() {
        //int resultado = a + b;
        return (a + b);
        //return resultado;
    }

    public int sumarConArgumentos(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        //return a + b;
        return sumarConRetorno();

    }

}
