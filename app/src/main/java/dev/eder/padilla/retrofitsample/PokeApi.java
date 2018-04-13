package dev.eder.padilla.retrofitsample;

import dev.eder.padilla.retrofitsample.model.Pokemon;
import dev.eder.padilla.retrofitsample.model.PreviewResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokeApi {
    @GET("pokemon/{id}")
    Call<Pokemon> getPokemonDats(@Path("id")int id);

    @GET("channels")
    Call<PreviewResponse> getYoutubeDats(@Query("part") String type, @Query("forUsername") String userName, @Query("key") String key);
}
