package dev.eder.padilla.retrofitsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import dev.eder.padilla.retrofitsample.model.Pokemon;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    ProgressBar progressBar;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit_text);
        progressBar = findViewById(R.id.progress_bar);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        button.setText("Obtener Pokemon "+getEmojiByUnicode(0x1F648));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideKeyboard();
                if(!editText.getText().toString().isEmpty()){
                    sendWebPetition();
                }else{
                    editText.setError("Campo vacio!!");
                }
            }
        });
    }

    private void sendWebPetition() {
        progressBar.setVisibility(View.VISIBLE);
        button.setVisibility(View.GONE);
        PokeApi pokemonClient = ServiceGenerator.createService(PokeApi.class);

        pokemonClient.getPokemonDats(Integer.valueOf(editText.getText().toString())).enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                if (response.code()==200) {
                    Pokemon pokemon = response.body();
                    textView.setText(getEmojiByUnicode(0x1F432) + getEmojiByUnicode(0x1F432) + "Pokemon " + pokemon.toString() + " Nombre " + pokemon.getName());
                    progressBar.setVisibility(View.GONE);
                    button.setVisibility(View.VISIBLE);
                }else{
                    textView.setText(getEmojiByUnicode(0x1F479)+"Error "+response.code());
                    progressBar.setVisibility(View.GONE);
                    button.setVisibility(View.VISIBLE);
                    if (response.code()==404){
                        textView.append(" Pokemon no encontrado ");
                    }
                }
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable throwable) {
                textView.setText("Error no se pudo realizar la conexión \n"+throwable.getMessage());
                progressBar.setVisibility(View.GONE);
                button.setVisibility(View.VISIBLE);
            }
        });

    }

    public String getEmojiByUnicode(int unicode){
        return new String(Character.toChars(unicode));
    }
    public void hideKeyboard(){
        InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    }
}