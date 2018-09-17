/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import pojos.Movie;
import pojos.MoviePK;

/**
 *
 * @author rober
 */
public class MovieTester {

    private EntityManager em;
    private EntityManagerFactory emf;
    private Movie m;
    private Movie m2;

    public void connect() {
        emf = Persistence.createEntityManagerFactory("MoviePU");
        em = emf.createEntityManager();
    }
    
    public void insertData()
    {
        m = new Movie("Alf", "The Desk", "Horror", 2024, (long) 1.5*60*60*1000);
        em.getTransaction().begin();
        em.persist(m);
        em.getTransaction().commit();
    }
    
    public void showData()
    {
        //Movie c = em.find(Movie.class, new MoviePK("testtitle", LocalDate.now().minusYears(30)));
        //System.out.println(c);
    }
    
    public void removeData()
    {
        em.remove(m);
        em.getTransaction().begin();
        em.getTransaction().commit();
    }

    public void disconnect() {
        em.close();
        emf.close();
    }

    public static void main(String[] args) {
        MovieTester c = new MovieTester();
        c.connect();
        c.insertData();
        //c.showData();
        //c.removeData();
        c.disconnect();
    }
}
