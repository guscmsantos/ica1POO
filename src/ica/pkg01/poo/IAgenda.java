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
public interface IAgenda {
    
    public void insereContato(IContato contato);
    
    public int totalContatos();
    
    public void mostraDadosContatos();
    
    public void removeContato(IContato contato);
    
    public void removeTodos();
    
    public IContato selecionaContato(int posicao);
    
    public int posicao(IContato contato);
    
    public boolean altera(int posicao, IContato contatoEntra);
}
