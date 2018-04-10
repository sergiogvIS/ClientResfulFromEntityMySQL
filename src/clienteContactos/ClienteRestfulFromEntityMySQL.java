/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteContactos;

/**
 *
 * @author entrar
 */
public class ClienteRestfulFromEntityMySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clienteContactos cliente = new clienteContactos();
        System.out.println(cliente.findAll_JSON(String.class));
    }
    
}
