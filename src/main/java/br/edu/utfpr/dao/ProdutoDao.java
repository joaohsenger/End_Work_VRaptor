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
    @Inject
    private EntityManager manager;
    public List<Produto> listaTodos(){
        return new ArrayList<Produto>();
    }
    public void adicionar(Produto produto){
        manager.persist(produto);
    
    }
}
