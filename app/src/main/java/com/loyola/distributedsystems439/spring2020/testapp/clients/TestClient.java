package com.loyola.distributedsystems439.spring2020.testapp.clients;

import com.loyola.distributedsystems439.spring2020.testapp.models.Answer;
import com.loyola.distributedsystems439.spring2020.testapp.models.Questions;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface TestClient {

    @GET("activateQuestion")
    Call<Questions> activateQuestion();

    @GET("fetchAllQuestions")
    Call<Questions> fetchAllQuestions();

    @POST("recordResponse")
    Call<String> submitAnswer(@Body Answer answer);
}
