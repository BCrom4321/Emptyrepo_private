package edu.howardcc.cmsy167.imdb;

import java.util.Objects;
import java.util.Set;

/**
 * Represents a Movie from the IMDB data set
 */
public class Movie {
    
    String title;
    String directorName;
    int duration;
    Set<String> genres;
    String rating;
    int year;
    double imdbScore;

    public Movie(String title, String directorName, int duration, Set<String> genres, String rating, int year, double imdbScore) {
        this.title = title;
        this.directorName = directorName;
        this.duration = duration;
        this.genres = genres;
        this.rating = rating;
        this.year = year;
        this.imdbScore = imdbScore;
    }        

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void setGenres(Set<String> genres) {
        this.genres = genres;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getImdbScore() {
        return imdbScore;
    }

    public void setImdbScore(double imdbScore) {
        this.imdbScore = imdbScore;
    }

    
    
    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", directorName=" + directorName + ", duration=" + duration + ", genres=" + genres + ", rating=" + rating + ", year=" + year + ", imdbScore=" + imdbScore + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.title);
        hash = 59 * hash + Objects.hashCode(this.directorName);
        hash = 59 * hash + this.duration;
        hash = 59 * hash + Objects.hashCode(this.genres);
        hash = 59 * hash + Objects.hashCode(this.rating);
        hash = 59 * hash + this.year;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.imdbScore) ^ (Double.doubleToLongBits(this.imdbScore) >>> 32));
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
        if (this.duration != other.duration) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        if (Double.doubleToLongBits(this.imdbScore) != Double.doubleToLongBits(other.imdbScore)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.directorName, other.directorName)) {
            return false;
        }
        if (!Objects.equals(this.rating, other.rating)) {
            return false;
        }
        if (!Objects.equals(this.genres, other.genres)) {
            return false;
        }
        return true;
    }

    

}
