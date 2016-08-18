/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientes2;

/**
 *
 * @author PC-12
 */
public class Clientes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int val=500;
        int total;
        
        for (int i = 1; i < 10; i++) {
            total=i*val;
            System.out.println(i+" x "+val+" = "+total);
        }
        
    }
    
}
