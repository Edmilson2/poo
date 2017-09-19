/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.categoriaModelo;
import visao.ListaCategoria;
import visao.cadastroCategoria;

/**
 *
 * @author David
 */
public class categoriaControl {
    private cadastroCategoria vcadastro;
    private ListaCategoria vlista;
    private categoriaModelo modelo;
    
    public void listar(){
    this.vlista=new ListaCategoria();
    this.vlista.setVisible(true);}
    
    public void cadastrar(){
    this.vcadastro= new cadastroCategoria();}
    
    public void novo(){}
    
}
