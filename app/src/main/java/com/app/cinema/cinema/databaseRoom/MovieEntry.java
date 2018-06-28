package com.app.cinema.cinema.databaseRoom;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;
@Entity (tableName = "movie")
public class MovieEntry {

    //@PrimaryKey (autoGenerate = true)


    @PrimaryKey
    private long id;
    private String voteAverage;
    private String originalTitle;
    private String backdropPath;
    private String overview;
    private String releaseDate;
    private String posterPath;
    @ColumnInfo(name = "updated_at")
    private Date updated_at;


    public MovieEntry(long id,
                      String voteAverage,
                      String originalTitle,
                      String backdropPath,
                      String overview,
                      String releaseDate,
                      String posterPath, Date updated_at)
    {
        this.id = id;
        this.voteAverage = voteAverage;
        this.originalTitle = originalTitle;
        this.backdropPath = backdropPath;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.posterPath = posterPath;
        this.updated_at = updated_at;
    }
  /*
    //Constructor 2
    public MovieContract(int id, int movieId,
                 String voteAverage,
                 String originalTitle,
                 String backdropPath,
                 String overview,
                 String releaseDate,
                 String posterPath, Date updated_at)
    {
        this.id = id;
        this.movieId = movieId;
        this.voteAverage = voteAverage;
        this.originalTitle = originalTitle;
        this.backdropPath = backdropPath;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.posterPath = posterPath;
        this.updated_at = updated_at;
    }
*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
