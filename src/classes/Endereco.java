/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

public class Endereco {

    private String rua;
    private String bairro;
    private Integer numero;

    public Endereco(String bairro, String rua, Integer numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }
}
