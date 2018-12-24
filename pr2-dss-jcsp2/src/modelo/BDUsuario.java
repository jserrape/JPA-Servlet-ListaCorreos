package modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BDUsuario {

	public static List<Usuario> listarUsuarios() {
		EntityManager em = (Persistence.createEntityManagerFactory("usuario")).createEntityManager();
		Query q = em.createQuery("SELECT u FROM Usuario u");
		List<Usuario> resultado = q.getResultList();
		em.close();
		return resultado;
	}

	public static void insertar(Usuario usuario) {
		EntityManager em = (Persistence.createEntityManagerFactory("usuario")).createEntityManager();

		if (!existeEmail(usuario.getEmail())) {
			em.getTransaction().begin();
			em.persist(usuario);
			em.getTransaction().commit();
			em.close();
		}
	}

	public static void actualizar(Usuario usuario) {
		EntityManager em = (Persistence.createEntityManagerFactory("usuario")).createEntityManager();

		if (existeEmail(usuario.getEmail())) {
			Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.email = :email");
			q.setParameter("email", usuario.getEmail());

			Usuario resultado = (Usuario) q.getSingleResult();
			resultado.setNombre(usuario.getNombre());
			resultado.setApellido(usuario.getApellido());

			em.getTransaction().begin();
			em.merge(resultado);
			em.getTransaction().commit();
			em.close();
		}
	}

	public static void eliminar(Usuario usuario) {
		EntityManager em = (Persistence.createEntityManagerFactory("usuario")).createEntityManager();

		if (existeEmail(usuario.getEmail())) {
			Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.email = :email");
			q.setParameter("email", usuario.getEmail());

			Usuario resultado = (Usuario) q.getSingleResult();

			em.getTransaction().begin();
			em.remove(resultado);
			em.getTransaction().commit();
			em.close();
		}
	}

	public static Usuario seleccionarUsuario(String email) {
		EntityManager em = (Persistence.createEntityManagerFactory("usuario")).createEntityManager();

		Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.email = :email");
		q.setParameter("email", email);
		Usuario resultado = (Usuario) q.getSingleResult();
		em.close();

		return resultado;
	}

	public static boolean existeEmail(String email) {
		EntityManager em = (Persistence.createEntityManagerFactory("usuario")).createEntityManager();

		Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.email = :email");
		q.setParameter("email", email);

		try {
			q.getSingleResult();
			return true;
		} catch (NoResultException e) {
			return false;
		} finally {
			em.close();
		}
	}

}
