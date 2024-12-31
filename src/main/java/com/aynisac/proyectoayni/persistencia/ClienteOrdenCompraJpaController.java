package com.aynisac.proyectoayni.persistencia;

import com.aynisac.proyectoayni.logica.ClienteOrdenCompra;
import com.aynisac.proyectoayni.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class ClienteOrdenCompraJpaController implements Serializable {

    public ClienteOrdenCompraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ClienteOrdenCompraJpaController(){
        emf = Persistence.createEntityManagerFactory("AyniPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ClienteOrdenCompra clienteOrdenCompra) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(clienteOrdenCompra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ClienteOrdenCompra clienteOrdenCompra) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            clienteOrdenCompra = em.merge(clienteOrdenCompra);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = clienteOrdenCompra.getNum_cliente();
                if (findClienteOrdenCompra(id) == null) {
                    throw new NonexistentEntityException("The clienteOrdenCompra with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ClienteOrdenCompra clienteOrdenCompra;
            try {
                clienteOrdenCompra = em.getReference(ClienteOrdenCompra.class, id);
                clienteOrdenCompra.getNum_cliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The clienteOrdenCompra with id " + id + " no longer exists.", enfe);
            }
            em.remove(clienteOrdenCompra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ClienteOrdenCompra> findClienteOrdenCompraEntities() {
        return findClienteOrdenCompraEntities(true, -1, -1);
    }

    public List<ClienteOrdenCompra> findClienteOrdenCompraEntities(int maxResults, int firstResult) {
        return findClienteOrdenCompraEntities(false, maxResults, firstResult);
    }

    private List<ClienteOrdenCompra> findClienteOrdenCompraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ClienteOrdenCompra.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public ClienteOrdenCompra findClienteOrdenCompra(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ClienteOrdenCompra.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteOrdenCompraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ClienteOrdenCompra> rt = cq.from(ClienteOrdenCompra.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
