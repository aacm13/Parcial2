/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/**
 *
 * @author aacm12
 */
public class FuncionesMenu {
    public static int fase=0;
    
    public static void Fase(){
        System.out.println("*******************************************");
        if (fase<10){
            System.out.println("*       Está en la fase " + fase+"                 *");
        }else{
            System.out.println("*       Está en la fase " + fase+"                *");
        }
        System.out.println("*******************************************");
        fase += 1;
    }
}
