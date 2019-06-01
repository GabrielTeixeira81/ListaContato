package br.com.digitalhouse.listacontato.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.listacontato.R;
import br.com.digitalhouse.listacontato.adapter.ContatoAdapter;
import br.com.digitalhouse.listacontato.model.Contatos;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewContatos;
    ContatoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewContatos = findViewById(R.id.recyclevieww);

        adapter = new ContatoAdapter(listaDeContatos());

        recyclerViewContatos.setAdapter(adapter);
        recyclerViewContatos.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Contatos> listaDeContatos(){
        List<Contatos> contatos = new ArrayList<>();

        contatos.add(new Contatos("Jessica","11987651111"));
        contatos.add(new Contatos("Tairo","11965423422"));
        contatos.add(new Contatos("Eduardo", "11999778181"));
        contatos.add(new Contatos("Ivan", "11987615522"));
        contatos.add(new Contatos("Gabriel T.", "11987526578"));
        contatos.add(new Contatos("Marcelo","11987654111"));
        contatos.add(new Contatos("Luca", "11908716652"));
        contatos.add(new Contatos("Mayara", "11910108822"));

        return contatos;
    }
}

