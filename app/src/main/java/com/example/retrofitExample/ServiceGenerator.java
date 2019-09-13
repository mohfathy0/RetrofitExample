package com.example.retrofitExample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    private static final String restapiexample = "http://dummy.restapiexample.com/api/v1/create";
    private static final String fakerestapi = "http://fakerestapi.azurewebsites.net/api/";
    private static final String github = "http://dummy.restapiexample.com/api/v1/create";
    private static final String mocky ="http://www.mocky.io/v2/5d7b8c8c350000e55c3cac82/" ;
    //https://beeceptor.com/

    private static final String somaku="http://www.somaku.com/";

    //private static Gson gson = new GsonBuilder().setLenient().create();
    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(somaku).
                    addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();
    public static <S> S CreateService(Class<S> ServiceClass){
       return   retrofit.create(ServiceClass);
    }
}
