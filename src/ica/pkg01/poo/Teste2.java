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
public class Teste2 {
    public static void main(String[] args) {
        IAgenda A = new AgendaImplementada();
        IContato c;
        long tempo = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
        c = new ContatoImplementado("nome " + i, i);
        A.insereContato(c);
        }
        tempo = System.currentTimeMillis() - tempo;
        System.out.println("Total de Registros = " + A.totalContatos());
        A.mostraDadosContatos();
        System.out.println("Inseridos em " + tempo + " milisegundo(s)");
    }
}
