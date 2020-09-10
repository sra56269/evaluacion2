package empleados;

import java.util.Scanner;
public class cola {
    nodocolas inicio, fin;
    int tamañ;

    public cola() {
        inicio = fin = null;
        tamañ = 0;
    }

    public boolean estavacia() {
        return inicio == null;
    }

    public void insertar(int ele) {
        Scanner elemento = new Scanner(System.in);
        String nombrec;
        int cc;
        int salario;
        System.out.print("digite su nombre completo "+"  ");
        nombrec = elemento.nextLine();
        System.out.print("digite sudocumento de identidad "+"  ");
        cc = elemento.nextInt();
        System.out.print("¿cual es su salario? "+"   ");
        salario = elemento.nextInt();
    }

    public int quitar() {
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tamañ--;
        return aux;
    }

    public int iniciocola() {
        return inicio.dato;
    }

    public int tamañocola() {
        return tamañ;
    }
}
