package dev.eder.padilla.retrofitsample;

import dev.eder.padilla.retrofitsample.model.Pokemon;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokeApi {
    @GET("pokemon/{id}")
    Call<Pokemon> getPokemonDats(@Path("id")int id);
}
