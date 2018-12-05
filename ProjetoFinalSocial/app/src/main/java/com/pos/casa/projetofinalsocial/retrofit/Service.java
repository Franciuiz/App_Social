package com.pos.casa.projetofinalsocial.retrofit;

import com.pos.casa.projetofinalsocial.model.Contatos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface Service {

    //get all
    @GET("contatos")
    Call<List<Contatos>> getAllContatos();

    //get passando parametro
    @GET("contatos/{id}")
    Call<Contatos> getContatos(@Path("id") String id);

    @POST("contatos")
    @Headers("Content-Type: application/json")
    Call<Contatos> setContatos(@Body Contatos contatos);

    @PUT("contatos/{id}")
    @Headers("Content-Type: application/json")
    Call<Contatos> updateContatos(@Path("id") String id, @Body Contatos contatos);

    @DELETE("contatos/{id}")
    Call<Contatos> deleteContatos(@Path("id") String id);
}
