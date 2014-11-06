/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
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
    
    @Get
    @Path("/produtos")
    public List<Produto> produtos(){
//        return new ArrayList<Produto>();
        return dao.listaTodos();
                
    }
    
    @Post("adicionar")
    public void adiciona(Produto produto){
        dao.adicionar(produto);
        result.include("mensagem", "Produto Adicionado com sucesso");
        result.redirectTo(this).produtos();
    }
    @Get("/produtos/{produto.id}")
    public void visualiza(Produto produto) { 
    
    }
    @Put("/produtos/{produto.id}")
    public void atualiza(Produto produto) { 

    }
    
    @Delete("/produtos/{produto.id}")
    public void remove(Produto produto) { 
    
    }
    
}
