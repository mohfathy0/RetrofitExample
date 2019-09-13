package com.example.retrofitExample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SomakuAPI {

    @GET("posts")
    Call<List<Post>> getPostsAll();

    @GET("comments")
    Call<List<Comment>> getCommentsAll();

    @GET("albums")
    Call<List<Album>> getAlbumsAll();

    @GET("posts")
    Call<List<Post>> getPostsByIdQuery(@Query("id") int Id);
    @GET("posts/{id}")
    Call<List<Post>> getPostsByIdPath(@Path("id") int Id);

    @GET("comments")
    Call<List<Comment>> getCommentsByPostIdQuery(@Query("postId") int postId);
    @GET("comments/{id}")
    Call<List<Comment>> getCommentsByIdPath(@Path("id") int id);

    @GET("comments")
    Call<List<Comment>> getAlbumesyPostIdQuery(@Query("userId") int userId);
    @GET("comments/{id}")
    Call<List<Comment>> getAlbumesByIdPath(@Path("id") int id);


}
