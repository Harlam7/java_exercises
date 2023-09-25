
import java.util.Scanner;

public class HolaMundo {

    /*
    public static void main(String arg[]) {
        // System.out.println("Hola mundo desde Yaiba");
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
//Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
// var - inferencia no lo puedo usar por el jdk que uso
        //var miVariable2 = 10;

//concatrnación
        int masVaraibles = 69;
        String otraVariable = " shimba de número jeje";
        System.out.print("la variable es = " + masVaraibles + otraVariable);
    }
     */

 /*
    public static void main(String args[]) {
        String usuario = "Juan";
        String titulo = "enllenair";

        String union = "el" + " " + titulo + " " + usuario;
        System.out.println("union =" + " " + union);

        int i = 3;
        int j = 4;
        System.out.println(i + j); //7
        System.out.println(i + j + usuario); //7Juan
        System.out.println(usuario + i + j); //Juan34
    }
     */

 /*
    public static void main(String arg[]) {
        String nombre = "karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b\b\b\b\b\b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }
     */
 /*
    public static void main(String args[]) {
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        String usuario = consola.nextLine();

        System.out.println("usuario = " + usuario);

        System.out.println("Escribe el titulo: ");
        String titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }
     */
//tarea
/*
    public static void main(String args[]) {
        System.out.println("Proporciona el titulo: ");
        Scanner consola = new Scanner(System.in);
        String titulo = consola.nextLine();

        System.out.println("Proporciona el autor: ");
        String autor = consola.nextLine();

        System.out.println(titulo + " fue escrito por " + autor);
    }
     */
    public static void main(String arg[]) {
        /*
//tipos primitivos
        byte numeroByte = (byte) 10;
        System.out.println(numeroByte);
        System.out.println("valor minimo: " + Byte.MIN_VALUE);
        System.out.println("valor maximo: " + Byte.MAX_VALUE);

        short numeroShort = (short) 10;
        System.out.println(numeroShort);
        System.out.println("valor minimo: " + Short.MIN_VALUE);
        System.out.println("valor maximo: " + Short.MAX_VALUE);

        int numeroInt = (int) 10;
        System.out.println(numeroInt);
        System.out.println("valor minimo: " + Integer.MIN_VALUE);
        System.out.println("valor maximo: " + Integer.MAX_VALUE);

        long numeroLong = (long) 10;
        System.out.println(numeroLong);
        System.out.println("valor minimo: " + Long.MIN_VALUE);
        System.out.println("valor maximo: " + Long.MAX_VALUE);

        float numeroFloat = (float) 10.4454;
        System.out.println(numeroFloat);
        System.out.println("valor minimo: " + Float.MIN_VALUE);
        System.out.println("valor maximo: " + Float.MAX_VALUE);

        double numeroDoble = (double) 10.4454;
        System.out.println(numeroDoble);
        System.out.println("valor minimo: " + Double.MIN_VALUE);
        System.out.println("valor maximo: " + Double.MAX_VALUE);

        
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
         

//boleanos
        boolean varBolean = false;
        System.out.println("varBolean = " + varBolean);

        if (varBolean) {
            System.out.println("Es tru");

        } else {
            System.out.println("es fols");
        }

        int edad = 69;
        if (edad >= 18) {
            System.out.println("Eres ancianooooooooooo");
        } else {
            System.out.println("eres ilegaaaaaaaaaaaaaaaaal");
        }
         
//convertir de string a int
        int edad = Integer.parseInt("68");
        String ward = String.valueOf(10);
        System.out.println(" edad " + (edad + 1));
        System.out.println(" edad " + (ward + 1));
// ver https://es.stackoverflow.com/questions/1487/guia-definitiva-de-conversi%C3%B3n-de-tipos-en-java
         

//tarea tienda de libros
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        String nombre = consola.nextLine();

        System.out.println("Proporciona el id: ");
        String id = consola.nextLine();

        System.out.println("Proporciona el precio: ");
        double precio = Double.parseDouble(consola.nextLine());

        System.out.println("Proporciona el envio gratuito: ");
        boolean gratuito = Boolean.valueOf(consola.nextLine());

        System.out.println(nombre + " # " + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + gratuito);
         

//Operadores aritmeticos
        int a = 3, b = 2;
        int resultados = a + b;
        System.out.println("resultado = " + resultados);

        resultados = a - b;
        System.out.println("resultado = " + resultados);
         

        int a = 3;
        int b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        boolean c = true;
        boolean d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

//incrementos:
//1. preincremento (simbolos antes de la variable)
        int e = 3;
        int f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
//2. postincremento (simbolo despues de la variable)
        int g = 5;
        int h = g++;
        System.out.println("g  " + g);
        System.out.println("f = " + h);

         
        int a = 3;
        int b = 1;
        boolean c = (a == b);
        System.out.println("c = " + c);

        boolean d = a != b;
        System.out.println("d = " + d);

        String cadena = "wenas";
        String cadena2 = "wenas";
        boolean e = cadena == cadena2;
        System.out.println("e = " + e);

        boolean f = cadena.equals(cadena2);
        System.out.println("f = " + f);

        boolean g = a >= b;
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("es par");
        } else {
            System.out.println("impar");
        }

        int edad = 30;
        int adulto = 18;
        if (edad > adulto) {
            System.out.println("es un biejo lesbiano");
        } else {
            System.out.println("ilegal, jeje");
        }
         

//Condicionales
        int a = 6556;
        int min = 0;
        int max = 10;
        boolean resultado = a >= 0 && a <= 10;
        if (resultado) {
            System.out.println("Dentro del rango");
        } else {
            System.out.println("Fuera del rango");
        }

        boolean vacaciones = true;
        boolean diaDescanso = true;
        if (vacaciones || diaDescanso) {
            System.out.println("puede asistir xd");
        } else {
            System.out.println("está ocupao");
        }
         

//Operador ternario
        String resultado = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);

        int numero = 1;
        resultado = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("resultado = " + resultado);
         
        int x = 5;
        int y = 10;
        int z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        int resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);

        int resultado2 = (4 + 5) * 6 / 3;
        System.out.println("resultado2 = " + resultado2);
         

//RECTANGULO
        Scanner escaner = new Scanner(System.in);
        System.out.println("Proporciona el alto: ");
        int alto = Integer.parseInt(escaner.nextLine());

        System.out.println("Proporciona el ancho: ");
        int ancho = Integer.parseInt(escaner.nextLine());

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

         

//MAYOR DE DOS NUMEROS:
        Scanner escaner = new Scanner(System.in);
        System.out.println("Proporciona el numero1: ");
        int numero1 = Integer.parseInt(escaner.nextLine());

        System.out.println("Proporciona el numero2: ");
        int numero2 = Integer.parseInt(escaner.next());

        System.out.println("El numero mayor es: ");
        System.out.println(numero1 > numero2 ? numero1 : numero2);

         

// IF
        boolean condicion = true;
        if (condicion == true) {
            System.out.println("es verdah");
        } else {
            System.out.println("faljo");
        }

        int numero = 3;
        String numeroTexto = "numero desconocido";
        if (numero == 1) {
            numeroTexto = "Numero 1";
        } else if (numero == 2) {
            numeroTexto = "Numero 2";
        } else if (numero == 3) {
            numeroTexto = "Numero 3";
        } else if (numero == 5) {
            numeroTexto = "Numero 4";
        } else {
            numeroTexto = "desconocido";
        }
        System.out.println("numero Texto = " + numeroTexto);

         
        int mes = 11;
        String estacion = "estacion desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "ver-ano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "otoño";
        }
        System.out.println("la estacion es " + estacion);
         

        int numero = 3446464;
        String numeroTexto = "valor desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "numero uno";
                break;
            case 2:
                numeroTexto = "numero dos";
                break;
            case 3:
                numeroTexto = "numero tres";
                break;
            case 4:
                numeroTexto = "numero cuatro";
                break;
            default:
                numeroTexto = "caso no encontrado";
        }
        System.out.println("el numero es el " + numeroTexto);
        

        int mes = 1;
        String estacion = "Estacion desconocida";

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "ver-ano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "otoño";
                break;
            default:
                estacion = "pailas";
        }
        System.out.println("la estacion es " + estacion);
         
//--------------------------------//
        Scanner escaner = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10: ");
        int calificacion = Integer.parseInt(escaner.nextLine());

//si está entre  y 10, imprimir A
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        } //si está entre 8 y menor a 9, imprimir: B
        else if (calificacion >= 8 && calificacion <= 9) {
            System.out.println("B");
        } //si está entre 7 y menor a 8, iprimir: C
        else if (calificacion >= 7 && calificacion <= 8) {
            System.out.println("C");
        } //si está entre 6 y menor a 7, imprimir: D
        else if (calificacion >= 6 && calificacion <= 7) {
            System.out.println("D");
        } //Si está entre  y menor a 6, imprimir: F
        else if (calificacion >= 0 && calificacion <= 6) {
            System.out.println("F");
        } //si no está en el rango imprime el valor desconocido
        else {
            System.out.println("Valor desconocido");
        }
         

//CLICLO WHILE
        int contador = 0;
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }
         
//CICLO DO WHILE
        int contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3);
         
//CICLO FOR
        for (int contador = 0; contador < 45; contador++) {
            System.out.println("contador = " + contador);
        }

//BREAK Y CONTINUE
//break
        for (int contador = 0; contador < 4; contador++) {
            if (contador % 2 == 0) {
                System.out.println("contador = " + contador);
                break;
            }
        }
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//continue
        for (int contador = 0; contador < 4; contador++) {
            if (contador % 2 != 0) {
                continue;//ir a la siguiente iteracion
                // break;
            }
            System.out.println("contador = " + contador);
        }
         
        inicio:
        for (int contador = 0; contador < 4; contador++) {
            if (contador % 2 != 0) {
                continue inicio;//ir a linea de codigo de la etiqueta
                // break;
            }
            System.out.println("contador = " + contador);
        }
*/

//clases

    }
}
