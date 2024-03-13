package com.mycompany.permisos;
import external.permisionClass2; 

public class Permisos {  //si le quitas el public seria default 

    public static void main(String[] args) {
        permisionClass permision = new permisionClass ("hola mundo");
        // System.out.println(permision.sayHello());
        System.out.println(permision.getMsg());  //AHI PUSE EL GET DEL GETTER 
        
        permisionClass2 permision2= new permisionClass2 ("Estoy en un nuevo paquete");
        // System.out.println(permision2.sayHello());
        // System.out.println(permision2.msg);
    }
}