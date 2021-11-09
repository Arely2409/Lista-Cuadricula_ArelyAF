package com.arelyaf.arelyaguilarfariasm_200559;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ProductosViewHolder> {

    Context context;
    ArrayList<Productos> productoss;

    public  ProductosAdapter(Context context, ArrayList<Productos> productoss){
        this.context = context;
        this.productoss = productoss;
    }

    @NonNull
    @Override
    public ProductosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listaproductos, parent, false);
        return new ProductosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductosViewHolder holder, int position) {
        Productos productos = productoss.get(position);
        holder.imgproducto.setImageResource(productos.getImagen());
        holder.txtTitulo.setText(productos.getTitulo());
        holder.txtPrecio.setText(productos.getPrecio());
        holder.txtDescripcion.setText(productos.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return productoss.size();
    }

    public class ProductosViewHolder extends RecyclerView.ViewHolder {

        ImageView imgproducto;
        TextView txtTitulo;
        TextView txtPrecio;
        TextView txtDescripcion;

        public ProductosViewHolder(@NonNull View itemView) {
            super(itemView);
            imgproducto = itemView.findViewById(R.id.imgproducto);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtPrecio = itemView.findViewById(R.id.txtPrecio);
            txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
        }
    }
}
