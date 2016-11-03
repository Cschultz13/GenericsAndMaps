package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one field
 * can be used for sorting. What will you do?
 *
 */
public class Movie implements Comparable<Movie>{

    private String title;
    private String director;
    private double eidr;

    public Movie(String title, String director, double eidr) {
        this.title = title;
        this.director = director;
        this.eidr = eidr;
    }  

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.eidr);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.eidr, other.eidr)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", director=" + director + '}';
    }

   @Override
    public int compareTo(Movie o) {
      return new CompareToBuilder()
               .append(this.eidr, o.eidr)
               .toComparison();
    }

   

}
