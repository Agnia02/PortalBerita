package com.example.prtlbrtaml.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.prtlbrtaml.R
import com.example.prtlbrtaml.data.Berita
import java.util.*

class BeritaAdapter (private val list: ArrayList<Berita>)
    : RecyclerView.Adapter<BeritaAdapter.BeritaViewHolder>(){

    class BeritaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val txtJudul = itemView.findViewById<TextView>(R.id.txtJudulBerita)
        private val imgGambar = itemView.findViewById<ImageView>(R.id.imgGambarBerita)
        private val txtDesc = itemView.findViewById<TextView>(R.id.txtDescBerita)

        fun bind(get: Berita) {
            txtJudul.text = get.judul
           //imgGambar.setImageResource()
            txtDesc.text = get.desc

            txtJudul.setOnClickListener {

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaViewHolder {
        return BeritaAdapter.BeritaViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.list_berita, parent, false))
    }

    override fun onBindViewHolder(holder: BeritaViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}