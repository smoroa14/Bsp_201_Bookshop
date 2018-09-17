/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 *
 * @author rober
 */
@Entity
@IdClass(MoviePK.class)
public class Movie {
    
    private String director;
    @Id
    private String title;
    @Id
    private String genre;
    private Integer releaseyear;
    private Long lenght;

    public Movie(String director, String title, String genre, Integer releaseyear, Long lenght) {
        this.director = director;
        this.title = title;
        this.genre = genre;
        this.releaseyear = releaseyear;
        this.lenght = lenght;
    }

    public Movie() {
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(Integer releaseyear) {
        this.releaseyear = releaseyear;
    }

    public Long getLenght() {
        return lenght;
    }

    public void setLenght(Long lenght) {
        this.lenght = lenght;
    }
    
    
}
