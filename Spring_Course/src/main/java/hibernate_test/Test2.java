package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();

            Employee em = new Employee("Anton", "Antonson", "Backend", 800);
            session.beginTransaction();
            session.persist(em);
//            session.getTransaction().commit();

            int myId = em.getId();
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
            Employee em2 = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(em2);

            System.out.println("Done!");
        }
        finally {
            sessionFactory.close();
        }
    }
}
