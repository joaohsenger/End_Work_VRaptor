/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.edu.utfpr.dao.UsuarioDao;
import br.edu.utfpr.model.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static junit.framework.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Joao Henrique
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:WebContent/WEB-INF/persistencia.xml" })
@Transactional
@TransactionConfiguration(defaultRollback = false)
public class UsuarioTest {
    @Autowired
    private UsuarioDao dao;
    private final Usuario u = new Usuario();
    @Test
    public void creatUser(){
        u.setNome("juca");
        u.setCidade("medicity");
        u.setEmail("juca@medicity.org");
        u.setIsAdmin(false);
        u.setSenha("jaco");
        u.setEndereco("rua bahia");
        u.setSobreNome("da silva");
        assertNotNull(u.getNome());
       
    }
    
//    
//    @Test
//    public void testSave(){
//        dao.adicionar(u);
//        assertNotNull(u.getId());
//    }
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
