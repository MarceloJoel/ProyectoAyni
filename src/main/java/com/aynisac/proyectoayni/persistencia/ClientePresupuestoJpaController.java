
package com.aynisac.proyectoayni.persistencia;

import com.aynisac.proyectoayni.logica.ClientePresupuesto;
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

public class ClientePresupuestoJpaController implements Serializable {

    public ClientePresupuestoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ClientePresupuestoJpaController(){
        emf = Persistence.createEntityManagerFactory("AyniPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ClientePresupuesto clientePresupuesto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(clientePresupuesto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ClientePresupuesto clientePresupuesto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            clientePresupuesto = em.merge(clientePresupuesto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = clientePresupuesto.getNum_cliente();
                if (findClientePresupuesto(id) == null) {
                    throw new NonexistentEntityException("The clientePresupuesto with id " + id + " no longer exists.");
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
            ClientePresupuesto clientePresupuesto;
            try {
                clientePresupuesto = em.getReference(ClientePresupuesto.class, id);
                clientePresupuesto.getNum_cliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The clientePresupuesto with id " + id + " no longer exists.", enfe);
            }
            em.remove(clientePresupuesto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ClientePresupuesto> findClientePresupuestoEntities() {
        return findClientePresupuestoEntities(true, -1, -1);
    }

    public List<ClientePresupuesto> findClientePresupuestoEntities(int maxResults, int firstResult) {
        return findClientePresupuestoEntities(false, maxResults, firstResult);
    }

    private List<ClientePresupuesto> findClientePresupuestoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ClientePresupuesto.class));
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

    public ClientePresupuesto findClientePresupuesto(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ClientePresupuesto.class, id);
        } finally {
            em.close();
        }
    }

    public int getClientePresupuestoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ClientePresupuesto> rt = cq.from(ClientePresupuesto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
