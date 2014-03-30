/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1147171
 */
public class UsuarioDAO {
    
    private static List<Usuario> usuarios=new ArrayList<Usuario>();
    
    static{
        usuarios.add(new Usuario("Anderson","anderson","asd"));    
        usuarios.add(new Usuario("Tabata","tabata","tab"));
        usuarios.add(new Usuario("Roberto","robert","r"));
    }
    
    public Usuario getPorLogin(String login){
        int indice=usuarios.indexOf(new Usuario(login, login, login));
        if(indice!=-1)
            return usuarios.get(indice);
        else
            return null;
    }
}
