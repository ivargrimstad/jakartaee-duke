package eu.agilejava.dukes.greeting;

import jakarta.enterprise.context.Dependent;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaQuery;

import java.util.List;

@Dependent
public class DukesRepository {

    @PersistenceContext(unitName = "dukesPU")
    private EntityManager em;

    public List<DukesGreeting> findAll() {

        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(DukesGreeting.class));
        return em.createQuery(cq).getResultList();
    }

}
