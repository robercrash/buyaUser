package com.crashdev.buyauser;

import java.util.ArrayList;
import java.util.List;

import com.crashdev.buyauser.ofertaendpoint.model.Oferta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class OffertunityListviewAdapter extends BaseAdapter {
	
	//private ArrayList<OffertunityCard> data;
	private ArrayList<Oferta> data;
    Context context;
    
    public OffertunityListviewAdapter(ArrayList<Oferta> data, Context context){
    	this.data = data;
    	this.context = context;
    }

	@Override
	public int getCount() {		
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View v = convertView;
		
		if (v == null)
        {
           LayoutInflater vi = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           //v = vi.inflate(R.layout.activity_offertinity_list_view, null);
           v = vi.inflate(R.layout.offertunity_listview_item, null);
        }
		
		ImageView mainImage = (ImageView) v.findViewById(R.id.mainImage);
		TextView offerTitle = (TextView) v.findViewById(R.id.offerTitle);
		TextView offerer = (TextView) v.findViewById(R.id.offerer);
		TextView offerDescription = (TextView) v.findViewById(R.id.offerDescription);
		
		
		//OffertunityCard oferta = data.get(position);
		Oferta oferta = data.get(position);
		
		//Aqui hay q insertar los demas datos
		mainImage.setImageResource(R.drawable.example_1);
		//mainImage.setImageResource(oferta.getMainImageID());
		offerTitle.setText(oferta.getTitulo());
		offerer.setText(oferta.getAdvertaicer());
		offerDescription.setText(oferta.getDescripcion());
		
		
		return v;
	}

}




