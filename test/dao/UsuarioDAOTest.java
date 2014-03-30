/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1147171
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }

    @Test
    public void testGetPorLoginQuandoUsuarioExiste() {
        String login = "anderson";
        UsuarioDAO instance = new UsuarioDAO();
        Usuario expResult = new Usuario(login, login, login);
        Usuario result = instance.getPorLogin(login);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPorLoginQuandoUsuarioNaoExiste() {
        String login = "anderson123";
        UsuarioDAO instance = new UsuarioDAO();
        Usuario expResult = null;
        Usuario result = instance.getPorLogin(login);
        assertEquals(expResult, result);
    }
}