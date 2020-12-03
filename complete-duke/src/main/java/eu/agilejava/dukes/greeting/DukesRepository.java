package eu.agilejava.dukes.greeting;


import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
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
