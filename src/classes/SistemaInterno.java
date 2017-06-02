/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import interfaces.Autenticavel;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SistemaInterno {
 
    public void login(Autenticavel a, String senha){
        try {
            a.autentica(senha);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}