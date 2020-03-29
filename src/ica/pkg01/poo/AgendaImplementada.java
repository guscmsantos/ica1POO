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
        this.contador = 0;
    }
    
    @Override
    public void insereContato(IContato contato) {
        if(this.contador == 0)
        {
            this.contatos = new IContato[2];
            this.contatos[0] = contato;
            this.contador ++;
        }
        else
        {
            if(this.contador == this.contatos.length)
            {
                IContato[] aux = new ContatoImplementado[this.contatos.length * 2];
                int i;
                for(i = 0; i< this.contatos.length; i++)
                {
                    aux[i] = this.contatos[i];
                }
                aux[i] = contato;
                this.contatos = aux;
                this.contador++;
            }
            else
            {
                this.contatos[this.contador] = contato;
                this.contador++;
            }   
        }
    }

    @Override
    public int totalContatos() {
        return this.contador;
    }

    @Override
    public void mostraDadosContatos() {
        for(int i=0; i< this.contador; i++)
        {
            System.out.println("Posição "+i+" = "+ this.contatos[i].toString());
        }
    }

    @Override
    public void removeContato(IContato contato) {
        int posicao = this.posicao(contato);
        if(posicao == -1)
        {
            System.out.println("Contato não encontrado na agenda");
        }
        else
        {
            if(posicao == 0)
            {
                for(int i = 1; i < this.contatos.length; i++)
                {
                    if(this.contatos.length -1 == i)
                    {
                        this.contatos[i-1] = null;
                    }
                    else
                    {
                        this.contatos[i-1] = this.contatos[i];
                    }
                }
            }
            else if(posicao + 1 == this.contador)
            {
                this.contatos[posicao] = null;
            }
            else
            {
                for(int i = posicao; i < this.contatos.length; i++)
                {
                    if(this.contatos.length -1 == i)
                    {
                        this.contatos[i-1] = null;
                    }
                    else
                    {
                        this.contatos[i] = this.contatos[i+1];
                    }
                }
            }
            this.contador--;
        }
        
        
    }

    @Override
    public void removeTodos() {
        this.contatos = new IContato[1];
        this.contador = 0;
    }

    @Override
    public IContato selecionaContato(int posicao) {
       return this.contatos[posicao];
    }

    @Override
    public int posicao(IContato contato) {
        for(int i = 0; i < this.contador ; i++ )
        {
            if(this.contatos[i].getNome().equals(contato.getNome()) && this.contatos[i].getTelefone() == contato.getTelefone())
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean altera(int posicao, IContato contatoEntra) {
        if(posicao <= this.totalContatos()-1)
        {
            this.contatos[posicao] = contatoEntra;
            return true;
        }
        else
        {
            return false;
        }
    }
}
