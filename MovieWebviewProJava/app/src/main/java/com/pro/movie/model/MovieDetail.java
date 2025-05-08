package com.pro.movie.model;

import java.util.List;

public class MovieDetail {

    private String status;

    private String id;

    private String genre_id;


    private String movie_title;


    private String movie_casts;


    private String is_trailer;


    private String video_url;


    private String video_id;


    private String movie_cover_b;


    private String movie_cover_s;


    private String movie_thumbnail_b;


    private String movie_thumbnail_s;


    private String movie_desc;


    private String movie_date;


    private String total_views;


    private String admin_rating;


    private String total_rate;


    private String rate_avg;


    private String language_id;


    private String language_name;


    private String language_bg;


    private String share_link;


    private String is_fav;


    private String total_comment;


    private List<GalleryList> galleryLists;


    private List<MovieList> relatedMovieLists;


    private List<CommentList> commentLists;

    public String getStatus() {
        return status;
    }




    public String getId() {
        return id;
    }

    public String getGenre_id() {
        return genre_id;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public String getMovie_casts() {
        return movie_casts;
    }

    public String getIs_trailer() {
        return is_trailer;
    }

    public String getVideo_url() {
        return video_url;
    }

    public String getVideo_id() {
        return video_id;
    }

    public String getMovie_cover_b() {
        return movie_cover_b;
    }

    public String getMovie_cover_s() {
        return movie_cover_s;
    }

    public String getMovie_thumbnail_b() {
        return movie_thumbnail_b;
    }

    public String getMovie_thumbnail_s() {
        return movie_thumbnail_s;
    }

    public String getMovie_desc() {
        return movie_desc;
    }

    public String getMovie_date() {
        return movie_date;
    }

    public String getTotal_views() {
        return total_views;
    }

    public String getAdmin_rating() {
        return admin_rating;
    }

    public String getTotal_rate() {
        return total_rate;
    }

    public String getRate_avg() {
        return rate_avg;
    }

    public String getLanguage_id() {
        return language_id;
    }

    public String getLanguage_name() {
        return language_name;
    }

    public String getLanguage_bg() {
        return language_bg;
    }

    public String getShare_link() {
        return share_link;
    }

    public String getIs_fav() {
        return is_fav;
    }

    public String getTotal_comment() {
        return total_comment;
    }

    public List<GalleryList> getGalleryLists() {
        return galleryLists;
    }

    public List<MovieList> getRelatedMovieLists() {
        return relatedMovieLists;
    }

    public List<CommentList> getCommentLists() {
        return commentLists;
    }
}
}
