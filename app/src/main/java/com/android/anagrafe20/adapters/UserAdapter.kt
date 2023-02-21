package com.android.anagrafe20.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.android.anagrafe20.R
import com.android.anagrafe20.SingleUserViewActivity
import com.android.anagrafe20.entities.User

// Vado a creare l'adapter per la visualizzazione dei dati
// Passo il context dell'activity che vado a visualizzare e gli elementi da eleborare per la visualizzazione
class UserAdapter(private val ctx: Context, private val list: List<User>): BaseAdapter() {

    override fun getCount(): Int = list.size
    override fun getItem(position: Int): Any = list[position]
    override fun getItemId(position: Int): Long = list[position].id
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val user: User = getItem(position) as User
        val view = LayoutInflater.from(ctx).inflate(R.layout.user_layout,null)

        view.findViewById<TextView>(R.id.user_name).text = user.name
        view.findViewById<TextView>(R.id.user_surname).text = user.surname

        view.setOnClickListener{
            val intent: Intent = Intent(ctx, SingleUserViewActivity::class.java)
            intent.putExtra("user_name", user.name)
            intent.putExtra("user_surname", user.surname)
            intent.putExtra("user_birthday", user.birthday)
            intent.putExtra("user_birthcity", user.birthcity)
            intent.putExtra("user_birthprovince", user.birthprovince)
            intent.putExtra("user_gender", user.gender)
            ctx.startActivity(intent)
        }

        return view
    }
}