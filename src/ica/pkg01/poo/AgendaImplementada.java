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
public class AgendaImplementada implements IAgenda {
    private IContato[] contatos;
    private int contador;

    public AgendaImplementada()
    {
        this.contatos = new IContato[1];
    }
    
    @Override
    public void insereContato(IContato contato) {
        if(this.contador == 0)
        {
            this.contatos[0] = contato;
            this.contador++;
        }
        else
        {
            
        }
    }

    @Override
    public int totalContatos() {
        return this.contador;
    }

    @Override
    public void mostraDadosContatos() {
        for(int i=0; i< contatos.length; i++)
        {
            System.out.println("Posição "+i+" = "+ contatos[i].getNome() + " tel: " + contatos[i].getTelefone());
        }
    }

    @Override
    public void removeContato(IContato contato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IContato selecionaContato(int posicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int posicao(IContato contato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean altera(int posicao, IContato contatoEntra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
