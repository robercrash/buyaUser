package com.crashdev.buyauser;

import java.util.ArrayList;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class OffertunityListViewActivity extends SherlockActivity {
	
	private ListView lv;
	private OffertunityListviewAdapter listAdapter;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_offertunity_listview);
		
		getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff5112")));
		
		//Aqui tenemos que recibir la lista de ofertas
		ArrayList<OffertunityCard> listaDeOfertas = new ArrayList();
		
		OffertunityCard oferta = new OffertunityCard();
		oferta.setMainImage(R.drawable.example_1);
		oferta.setOffertTitle("2x1 Toda la semana");
		oferta.setAdvertiserName("Your company name here");
		oferta.setOfferDescription("Esta semana por inauguarción...");
		listaDeOfertas.add(oferta);
		
		OffertunityCard oferta2 = new OffertunityCard();
		oferta2.setMainImage(R.drawable.example_2);
		oferta2.setOffertTitle("2x1 Toda la semana");
		oferta2.setAdvertiserName("Liverpool");
		oferta2.setOfferDescription("Esta semana por inauguarción...");
		listaDeOfertas.add(oferta2);
	
		OffertunityCard oferta3 = new OffertunityCard();
		oferta3.setMainImage(R.drawable.example_3);
		oferta3.setOffertTitle("2x1 Toda la semana");
		oferta3.setAdvertiserName("Your company name here");
		oferta3.setOfferDescription("Esta semana por inauguarción...");
		listaDeOfertas.add(oferta3);
		
		OffertunityCard oferta4 = new OffertunityCard();
		oferta4.setMainImage(R.drawable.example_4);
		oferta4.setOffertTitle("2x1 Toda la semana");
		oferta4.setAdvertiserName("Your company name here");
		oferta4.setOfferDescription("Esta semana por inauguarción...");
		listaDeOfertas.add(oferta4);
		
		OffertunityCard oferta5 = new OffertunityCard();
		oferta5.setMainImage(R.drawable.example_5);
		oferta5.setOffertTitle("2x1 Toda la semana");
		oferta5.setAdvertiserName("Your company name here");
		oferta5.setOfferDescription("Esta semana por inauguarción...");
		listaDeOfertas.add(oferta5);
		
		OffertunityCard oferta6 = new OffertunityCard();
		oferta6.setMainImage(R.drawable.example_6);
		oferta6.setOffertTitle("2x1 Toda la semana");
		oferta6.setAdvertiserName("Your company name here");
		oferta6.setOfferDescription("Esta semana por inauguarción...");
		listaDeOfertas.add(oferta6);
		
		listAdapter = new OffertunityListviewAdapter( listaDeOfertas, getApplicationContext());
		lv = (ListView) findViewById(R.id.offertunitiesListView);
		lv.setAdapter(listAdapter);
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				//Aqui lanzamos el intent con el detailView de la oferta
				//Toast.makeText(getApplicationContext(), "A webo!!", Toast.LENGTH_SHORT).show();
				//Intent i = new Intent(getApplicationContext(), SearchOffertunitiesActivity.class);
				Intent i = new Intent(getApplicationContext(), OffertunitiesMapViewActivity.class);
				startActivity(i);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getSupportMenuInflater().inflate(R.menu.offertinity_list_view, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId() == R.id.favoritos){
			startActivity(new Intent(getApplicationContext(), OffertunitiesMapViewActivity.class));
		}else if(item.getItemId() == R.id.configuracion){
			startActivity(new Intent(getApplicationContext(), OffertunitiesMapViewActivity.class));
		}
		return super.onOptionsItemSelected(item);
	}

}
