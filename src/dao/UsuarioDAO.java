
package dao;

import entity.Usuario;
import javax.persistence.EntityManager;

public class UsuarioDAO extends GenericDAO<Usuario> {
    
    public Usuario selecionarPorUsuarioESenha(String usuario, String senha, String tipo) {
        Usuario usu = super.getEntityManager()
                .createQuery("SELECT u FROM Usuario u WHERE u.username = :usuario AND u.senha = :senha AND u.tipo = :tipo", Usuario.class)
                .setParameter("usuario", usuario)
                .setParameter("senha", senha)
                .setParameter("tipo", tipo)
                .getSingleResult();
        
        return usu;
    }
    
    public Usuario selecionarProUsuario(String usuario) {
        Usuario usu = super.getEntityManager()
                .createQuery("SELECT u FROM Usuario u WHERE u.username = :usuario", Usuario.class)
                .setParameter("usuario", usuario)
                .getSingleResult();
        
        return usu;
    }
    
    public void trocarSenha(String usuario, String senha) {
		EntityManager em = super.getEntityManager();
		em.getTransaction().begin();
		Usuario user = this.selecionarProUsuario(usuario);
		user.setSenha(senha);
		em.merge(user);
		em.getTransaction().commit();
		em.close();
    }
    
}
