/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebametodos;

import java.util.Scanner;

/**
 *
 * @author End User
 */
public class PruebaMetodos {

      
    public static void Horario(){
        int hora;
        String text = null;
         
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que hora desea conocer?(Favor de escribarla en el sistema horario de 24 horas) ");
        hora = sc.nextInt();
        
        if (hora <= 24){
            switch (hora) {
            case 0:
                text="jugar Valorant con tus amigos";
                break;
            case 1:
                text="jugar LOL con tus amigos";
                break;
            case 2:
                text="ver Tik Toks en lo que te duermes";
                break;
            case 3:
                text="dormir";
                break;
            case 4:
                text="dormir";
                break;
            case 5:
                text="dormir";
                break;
            case 6:
                text="dormir";
                break;
            case 7:
                text="dormir";
                break;
            case 8:
                text="dormir";
                break;
            case 9:
                text="tomar clase de Física";
                break;
            case 10:
                text="tomar clase de Álgebra Lineal";
                break;
            case 11:
                text="tomar clase de Cálculo Integral";
                break;
            case 12:
                text="tomar clase de organización computacional";
                break;
            case 13:
                text="hacer la comida";
                break;
            case 14:
                text="comer con mi hermana";
                break;
            case 15:
                text="ver mi serie The Good Doctor en Prime Video";
                break;
            case 16:
                text="recibir a tú máma después de su jornada laboral";
                break;
            case 17:
                text="salir con tú máma a ver las cosas de la casa";
                break;
            case 18:
                text="comer un snack";
                break;
            case 19:
                text="hacer ejercicio";
                break;
            case 20:
                text="tomar un baño";
                break;    
            case 21:
                text="hacer tarea";
                break;
            case 22:
                text="hacer tarea";
                break;
            case 23:
                text="cenar";
                break;
            case 24:
                text="platicar con tú máma";
                break;
            default:
               
                break;
        }
            System.out.println("Para las " + hora + " horas tienes agendado " + text);
        }else {
            System.out.println("Favor de escribir un número que este dentro de la lista");
        }
    }
    
    public static void DiaHabil(){
         int dia;
        String text = null;
        String texts = null;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que día desea conocer si es hábil o inhábil?\nSeleccione el día según la lista: \nLunes[1] \nMartes[2] \nMiercoles[3] \nJueves[4] \nViernes[5] \nSábado[6] \nDomingo[7]");
        dia = sc.nextInt();
        
        if (dia > 0 && dia <= 7){
        switch (dia) {
            case 1:
                texts = "lunes";
                text="hábil";
                break;
            case 2:
                texts = "martes";
                text="hábil";
                break;
            case 3:
                texts = "miercoles";
                text="hábil";
                break;
            case 4:
                texts = "jueves";
                text="hábil";
                break;
            case 5:
                texts = "viernes";
                text="hábil";
                break;
            case 6:
                texts = "sábado";
                text="inhábil";
                break;
            case 7:
                texts = "domingo";
                text="inhábil";
                break;
            default:
               
                break;
        }
         System.out.println("El día " + texts + " es " + text);
        }else {
         System.out.println("Favor de escribir un número que este dentro de la lista");
        }
        
        
        }
    
    public static void DetectorDeTrimestre(){
     int mes;
        String text = null;
        String texts = null;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que mes desea conocer?\nSeleccione un mes según la lista: \nEnero[1] \nFebrero[2] \nMarzo[3] \nAbril[4] \nMayo[5] \nJunio[6] \nJulio[7] \nAgosto[8] \nSeptiembre[9] \nOctubre[10] \nNoviembre[11] \nDiciembre[12]");
        mes = sc.nextInt();
        
        if (mes > 0 && mes <= 12){
        switch (mes) {
            case 1:
                texts = "enero";
                text="primer trimestre";
                break;
            case 2:
                texts = "febrero";
                text="primer trimestre";
                break;
            case 3:
                texts = "marzo";
                text="primer trimestre";
                break;
            case 4:
                texts = "abril";
                text="segundo trimestre";
                break;
            case 5:
                texts = "mayo";
                text="segundo trimestre";
                break;
            case 6:
                texts = "junio";
                text="segundo trimestre";
                break;
            case 7:
                texts = "julio";
                text="tercer trimestre";
                break;
            case 8:
                texts = "agosto";
                text="tercer trimestre";
                break;
            case 9:
                texts = "septiembre";
                text="tercer trimestre";
                break;
            case 10:
                texts = "octubre";
                text="cuarto trimestre";
                break;
            case 11:
                texts = "noviembre";
                text="cuarto trimestre";
                break;
            case 12:
                texts = "diciembre";
                text="cuarto trimestre";
                break;
            default:
               
                break;
        }
         System.out.println("El mes de " + texts + " se encuentra en el " + text);
        }else {
         System.out.println("Favor de escribir un número que este dentro de la lista");
        }
        
    
    }
    public static void Seleccion(int opcion){
        
        if (opcion > 0 && opcion <= 3){
            switch (opcion) {
            case 1:
                Horario();
                break;
            case 2:
                DiaHabil();
                break;
            case 3:
                DetectorDeTrimestre();
                break;
            default:
            System.out.println("Favor de escribir un número que este dentro de la lista");   
                break;    
            }
        }
    }
    
     public static void main(String[] args) {
       int seleccion;
        String text = null;
         
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que sistema desea utilizar?\nSeleccione un mes según la lista \nHorario[1] \nDiaHabil[2] \nDetectorDeTrimestre[3] ");
        seleccion = sc.nextInt();
        Seleccion(seleccion);
        
    }
}
  
    

