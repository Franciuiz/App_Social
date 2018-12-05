package com.pos.casa.projetofinalsocial.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;

    //Nao estabelece conexão com localhost (127.0.0.1), trocar "192.168.1.7" pelo ip local da maquina
    String baseURL = "http://192.168.1.4:8080/api/v1.0/";

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()

                .baseUrl(baseURL)

                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public Service getService() {
        return this.retrofit.create(Service.class);
    }

}
