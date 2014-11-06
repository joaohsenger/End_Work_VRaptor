/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.model.Usuario;
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
public class UsuarioDao {
    @Inject
    private EntityManager manager;

    public UsuarioDao() {
//        this(null);
    }
    
    public List<Usuario> listaTodos(){
        return new ArrayList<Usuario>();
    }
    public void adicionar(Usuario usuario){
        manager.persist(usuario);
    
    }
    
}
