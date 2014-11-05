/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.edu.utfpr.dao.ProdutoDao;
import br.edu.utfpr.model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Joao Henrique
 */
@Controller
public class ProdutosController {
    
    @Inject
    private ProdutoDao dao;
    
    @Inject
    private Result result;
    
    public List<Produto> produtos(){
//        return new ArrayList<Produto>();
        return dao.listaTodos();
                
    }
    public void adiciona(Produto produto){
        dao.adicionar(produto);
        result.redirectTo(ProdutosController.class).produtos();
    }
    
}
