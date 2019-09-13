package com.example.retrofitExample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        SomakuAPI client = ServiceGenerator.CreateService(SomakuAPI.class);
        Call<List<Album>> call = client.getAlbumsAll();

        call.enqueue(new Callback<List<Album>>() {
            @Override
            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
                Log.i("mylog_MainAcrivity",response.body().toString());
          List<Album> albums = response.body();
          for (Album album:albums){
             Log.i("mylog_MainAcrivity",(album.getTitle()));

          }

            }

            @Override
            public void onFailure(Call<List<Album>> call, Throwable t) {
                Log.i("mylog_MainAcrivity",t.getMessage());
            }
        });


//        ServiceGenerator.CreateService(SomakuAPI.class).getAlbumesByIdPath(1).enqueue(new Callback<List<Comment>>() {
//            @Override
//            public void onResponse(Call<List<Comment>> call, Response<List<Comment>> response) {
//                Log.i("mylog_MainAcrivity",response.body().toString());
//            }
//
//            @Override
//            public void onFailure(Call<List<Comment>> call, Throwable t) {
//                Log.i("mylog_MainAcrivity",t.getMessage());
//            }
//        });

    }



}
