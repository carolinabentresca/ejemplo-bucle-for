/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarray;

public class EjemploArray {

    public static void main(String[] args) {
        System.out.println("Los días de la semana son: ");
        AddDiasSemana();
        System.out.println("*************************************");
        System.out.println();
        System.out.println("Los días laborales de la semana son: ");
        AddDiasLaborales();
        System.out.println("*************************************");
        System.out.println();
        System.out.println("Los días de estudio de la semana son: ");
        AddDiasDeEstudio();
        System.out.println("*************************************");
        System.out.println();
        System.out.println("Los días Home Office son: ");
        AddDiasHomeOffice();
        System.out.println("*************************************");
    }

    public static void AddDiasSemana() {
        String[] días = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        //bucle for
        for (String d : días) {
            System.out.println(d);
        }

    }

    public static void AddDiasLaborales() {
        String[] días = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        //bucle for
        for (String d : días) {
            System.out.println(d);
        }
    }

    public static void AddDiasDeEstudio() {
        String[] días = {"Lunes", "Miercoles", "Viernes"};
        //bucle for
        for (String d : días) {
            System.out.println(d);
        }
    }

    public static void AddDiasHomeOffice() {
        String[] días = {"Miercoles", "Viernes"};
        //bucle for
        for (String d : días) {
            System.out.println(d);
        }
    }

}
