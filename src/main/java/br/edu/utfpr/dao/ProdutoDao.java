/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;


/**
 *
 * @author Joao Henrique
 */
@RequestScoped
public class ProdutoDao {
    private final EntityManager manager;
    public ProdutoDao(){
        this(null);
    }
    @Inject
    public ProdutoDao(EntityManager manager){
        this.manager = manager;
    
    }
    
    public List<Produto> listaTodos(){
        return new ArrayList<Produto>();
    }
    public Produto listarId(Long id){
    
        return manager.find(Produto.class, id);
    }
    public void adicionar(Produto produto){
        manager.persist(produto);
    
    }
    public void editar(Produto produto){
    
    }
    public void remover(Produto produto){
    
    }
    
}
