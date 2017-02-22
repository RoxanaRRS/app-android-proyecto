package uca.desapp.api;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import uca.desapp.Models.Tweet;

public interface ApiInterface {

    @GET("tweets")
    Call<List<Tweet>> getTweets();

    @POST("tweets")
    Call<Tweet> createTweet();
}
