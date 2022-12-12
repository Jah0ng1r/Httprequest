import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.HashMap;

public interface GetRetrofitApi {
    HashMap<String, String> map = new HashMap<>();

    @GET("languages")
    @Headers({
            "Accept-Encoding:application/gzip",
            "X-RapidAPI-Key:b47d4966a7msh01aaf9085a642ecp118828jsnce8459a33ff8",
            "X-RapidAPI-Host:google-translate1.p.rapidapi.com"

    })
    Call<Mydata> createGet();

    @POST("detect")
    @Headers({
            "content-type:application/x-www-form-urlencoded",
            "Accept-Encoding:application/gzip",
            "X-RapidAPI-Key:b47d4966a7msh01aaf9085a642ecp118828jsnce8459a33ff8",
            "X-RapidAPI-Host:google-translate1.p.rapidapi.com"
    })
    Call<Mydata> getWordLang(@Body String word);

    @POST("")
    @Headers({
            "content-type:application/x-www-form-urlencoded",
            "Accept-Encoding:application/gzip",
            "X-RapidAPI-Key:b47d4966a7msh01aaf9085a642ecp118828jsnce8459a33ff8",
            "X-RapidAPI-Host:google-translate1.p.rapidapi.com"
    })
    Call<Mydata> getWordTranslate(@Body String word);
}
