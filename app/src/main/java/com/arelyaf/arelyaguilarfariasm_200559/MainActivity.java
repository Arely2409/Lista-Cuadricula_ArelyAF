package com.arelyaf.arelyaguilarfariasm_200559;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        Button btnlista, btncuadricula;

        recyclerView = findViewById(R.id.recyclerView);
        btnlista = findViewById(R.id.btnlista);
        btncuadricula = findViewById(R.id.btncuadricula);

        ArrayList<Productos> productoss = new ArrayList<>();
        productoss.add(new Productos(R.drawable.blusa, "Top de malla con bordado de lunares", "$158.00", "Color:\tBlanco\n" + "Estilo:\tBohemio\n" + "Tipo de Estampado:\tLiso\n" + "Detalles:\tBordado, Escamas, Malla en contraste\n" + "Largo:\tNormal\n" + "Temporada:\tVerano\n" + "Tipo:\tTop"));
        productoss.add(new Productos(R.drawable.blusamorada, "Top con cinturón bajo irregular", "$270.00", "Color:\tMorado\n" + "Estilo:\tElegante\n" + "Tipo de Estampado:\tLiso\n" + "Detalles:\tCinta, asimétrico\n" + "Largo:\tNormal\n" + "Temporada:\tPrimavera/Otoño\n" + "Tipo:\tTop"));
        productoss.add(new Productos(R.drawable.junpernegro, "Mono sin mangas con dobladillo con cordones en la espalda y ojo de cerradura", "$150.00", "Estilo: deportivo\n" + "De color negro\n" + "Tipo de patrón: liso\n" + "Longitud: larga\n" + "Temporada: primavera / verano\n" + "Tipo: Unitard\n" + "Detalles: Recortar, Cordones, Botón\n" + "Tipo de ajuste: flaco"));
        productoss.add(new Productos(R.drawable.blusanude, " Blusa con malla escote V", "$200.00", "Color:\tRosa\n" + "Estilo:\tElegante\n" + "Tipo de Estampado:\tLiso\n" + "Detalles:\tTransparente\n" + "Largo:\tNormal\n" + "Temporada:\tVerano\n" + "Tipo:\tTop"));
        productoss.add(new Productos(R.drawable.pantalonrayado, "Pantalones pitillo de rayas verticales", "$238.00", "Estilo: casual\n" + "Color: blanco y negro\n" + "Tipo de patrón: Rayado\n" + "Longitud: larga\n" + "Temporada: primavera / verano / otoño\n" + "Detalles: Bolsa\n" + "Tipo de ajuste: flaco"));
        productoss.add(new Productos(R.drawable.pijamaazul, "Pijamas de Mujer Encaje en contraste Liso Sexy", "$250.00", "Estilo:\tSexy\n" + "Color:\tVerde\n" + "Tipo de Estampado:\tLiso\n" + "Tipo:\tConjunto de Pantalones Cortos\n" + "Número de piezas:\tConjunto de 2 piezas\n" + "Detalles:\tEncaje en contraste\n" + "Escote:\tTirantes finos\n" + "Longitud de la Manga:\tsin mangas"));
        productoss.add(new Productos(R.drawable.vestidoajustado, "Vestido estilo camiseta ajustado de tie dye","$80", "\tMulticolor\n" + "Estilo:\tCasual\n" + "Tipo de Estampado:\tTie-Dye\n" + "Largo:\tShort\n" + "Temporada:\tVerano\n" + "Tipo:\tApretado\n" + "Tipo de ajuste:\tAjustado"));
        productoss.add(new Productos(R.drawable.vestidoblanco, "Vestido de manga con malla con encaje de espalda abierta con nudo", "$400.00", "Color:\tBlanco\n" + "Estilo:\tSexy\n" + "Tipo de Estampado:\tLiso\n" + "Largo:\tShort\n" + "Temporada:\tPrimavera/Verano\n" + "Tipo:\tA línea"));
        productoss.add(new Productos(R.drawable.vestidofloral, "Vestido con estampado tropical de puño fruncido de cintura alta", "$160.00", "Color:\tMulticolor\n" + "Estilo:\tBohemio\n" + "Tipo de Estampado:\tTropical\n" + "Largo:\tShort\n" + "Temporada:\tVerano\n" + "Tipo:\tA línea\n" + "Detalles:\tVolante\n" + "Tipo de ajuste:\tRegular"));
        productoss.add(new Productos(R.drawable.vestidorayas, "Vestido de rayas con encaje", "$120.00", "Color:\tBlanco y Negro\n" + "Estilo:\tSexy, Casual\n" + "Tipo de Estampado:\tA rayas\n" + "Largo:\tShort\n" + "Tipo:\tcamiseta\n" + "Escote:\tcuello redondo"));
        productoss.add(new Productos(R.drawable.vestidorojo, "Vestido con estampado de margarita", "$300.00", "Color:\tRojo\n" + "Estilo:\tBohemio\n" + "Tipo de Estampado:\tfloral de margarita\n" + "Largo:\tShort\n" + "Temporada:\tVerano\n" + "Tipo:\tA línea\n" + "Detalles:\tCremallera"));
        productoss.add(new Productos(R.drawable.vestidoverde, "Vestido fruncido de manga con malla aplique con flor", "$420.00", "Color:\tVerde Oscuro\n" + "Estilo:\tGlamour\n" + "Tipo de Estampado:\tLiso\n" + "Largo:\tLargo\n" + "Temporada:\tPrimavera/Verano\n" + "Tipo:\tA línea\n" + "Detalles:\tTransparente, Malla en contraste, Apliques, Tablas, Cremallera"));

        ProductosAdapter adapter = new ProductosAdapter(this, productoss);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);

        btnlista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recyclerView.setLayoutManager(linearLayoutManager);
            }
        });
        btncuadricula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recyclerView.setLayoutManager(gridLayoutManager);
            }
        });

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}