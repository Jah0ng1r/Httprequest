import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.List;

public class HttpApplication {


    public static void main(String[] args) throws IOException {


//        postdata(new DeckType("deckNames", 6));
        getdata();

    }


    public static void getdata()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://google-translate1.p.rapidapi.com/language/translate/v2/")
                // as we are sending data in json format so
                // we have to add Gson converter factory
                .addConverterFactory(JacksonConverterFactory.create())  //(GsonConverterFactory.create())
                // at last we are building our retrofit builder.
                .build();
        GetRetrofitApi retrofitApi=retrofit.create(GetRetrofitApi.class);
                Call<Mydata> call=retrofitApi.createGet();
        call.enqueue(new Callback<Mydata>() {
            @Override
            public void onResponse(Call<Mydata> call, Response<Mydata> response) {
                System.out.println("ok");

            }

            @Override
            public void onFailure(Call<Mydata> call, Throwable throwable) {
                System.err.println("bad");
            }
        });
    }

    public static void postdata(DeckType deckType) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://127.0.0.1:8765/")
                // as we are sending data in json format so
                // we have to add Gson converter factory
                .addConverterFactory(JacksonConverterFactory.create())  //(GsonConverterFactory.create())
                // at last we are building our retrofit builder.
                .build();

        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);
        Call<Deck> call = retrofitAPI.createPost(deckType);
        call.enqueue(new Callback<Deck>() {
            @Override
            public void onResponse(Call<Deck> call, Response<Deck> response) {
               Deck deck=response.body();
                for (String s: deck.getResult()  ) {
                    System.out.println(s);
                }

                System.out.println("");
            }

            @Override
            public void onFailure(Call<Deck> call, Throwable throwable) {
                System.out.println("err");
            }
        });


    }
}
