/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ica.pkg01.poo;

/**
 *
 * @author gusta
 */
public class ContatoImplementado implements IContato {
    private String nome;
    private int telefone;
    
    ContatoImplementado(String nome, int telefone)
    {
        this.nome = nome;
        this.telefone = telefone;
    }

@Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
}
