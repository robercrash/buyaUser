package com.crashdev.buyauser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson.JacksonFactory;


import android.os.AsyncTask;
import android.content.Context;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.json.jackson.JacksonFactory;
import com.crashdev.buyauser.CloudEndpointUtils;
import com.crashdev.buyauser.ofertaendpoint.Ofertaendpoint;
import com.crashdev.buyauser.ofertaendpoint.model.CollectionResponseOferta;
import com.crashdev.buyauser.ofertaendpoint.model.Oferta;

public class OffertunityListViewActivity extends SherlockActivity {
	
	private ListView lv;
	private OffertunityListviewAdapter listAdapter;
	private CollectionResponseOferta resultQuery;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_offertunity_listview);
		
		getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff5112")));
		
		//Aqui tenemos que recibir la lista de ofertas
		ArrayList<OffertunityCard> listaDeOfertas = new ArrayList();
		
		OffertunityCard oferta = new OffertunityCard();
		oferta.setMainImage(R.drawable.example_1);
		oferta.setId("1");
		oferta.setOffertTitle("2x1 Toda la semana");
		oferta.setAdvertiserName("Your company name here");
		oferta.setOfferDescription("Esta semana por inauguarci�n...");
		listaDeOfertas.add(oferta);
		
		OffertunityCard oferta2 = new OffertunityCard();
		oferta2.setMainImage(R.drawable.example_2);
		oferta2.setId("2");
		oferta2.setOffertTitle("2x1 Toda la semana");
		oferta2.setAdvertiserName("Liverpool");
		oferta2.setOfferDescription("Esta semana por inauguarci�n...");
		listaDeOfertas.add(oferta2);
	
		OffertunityCard oferta3 = new OffertunityCard();
		oferta3.setMainImage(R.drawable.example_3);
		oferta3.setId("3");
		oferta3.setOffertTitle("2x1 Toda la semana");
		oferta3.setAdvertiserName("Your company name here");
		oferta3.setOfferDescription("Esta semana por inauguarci�n...");
		listaDeOfertas.add(oferta3);
		
		OffertunityCard oferta4 = new OffertunityCard();
		oferta4.setMainImage(R.drawable.example_4);
		oferta4.setId("4");
		oferta4.setOffertTitle("2x1 Toda la semana");
		oferta4.setAdvertiserName("Your company name here");
		oferta4.setOfferDescription("Esta semana por inauguarci�n...");
		listaDeOfertas.add(oferta4);
		
		OffertunityCard oferta5 = new OffertunityCard();
		oferta5.setMainImage(R.drawable.example_5);
		oferta5.setId("5");
		oferta5.setOffertTitle("2x1 Toda la semana");
		oferta5.setAdvertiserName("Your company name here");
		oferta5.setOfferDescription("Esta semana por inauguarci�n...");
		listaDeOfertas.add(oferta5);
		
		OffertunityCard oferta6 = new OffertunityCard();
		oferta6.setMainImage(R.drawable.example_6);
		oferta6.setId("6");
		oferta6.setOffertTitle("2x1 Toda la semana");
		oferta6.setAdvertiserName("Your company name here");
		oferta6.setOfferDescription("Esta semana por inauguarci�n...");
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
				//OffertunityCard offertToShow = new OffertunityCard();
				//arg0.getAdapter().getClass()
				OffertunityCard offertToShow= (OffertunityCard) arg0.getAdapter().getItem(arg2);
				//offertToShow.getId()
				
				//Toast.makeText(getApplicationContext(), "--"+offertToShow.getId(), Toast.LENGTH_SHORT).show();
				
				Intent i = new Intent(getApplicationContext(), OffertunitieDetailActivity.class);
				i.putExtra("oferta", offertToShow);
				/*i.putExtra("id", offertToShow.getId());
				i.putExtra("title", offertToShow.getOffertTitle());
				i.putExtra("advertiser", offertToShow.getAdvertiserName());
				i.putExtra("description", offertToShow.getOfferDescription());*/
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
			//startActivity(new Intent(getApplicationContext(), OffertunitiesMapViewActivity.class));
			new EndpointsTask().execute(getApplicationContext());
		}else if(item.getItemId() == R.id.configuracion){
			startActivity(new Intent(getApplicationContext(), OffertunitieDetailActivity.class));
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	public class EndpointsTask extends AsyncTask<Context, Integer, Long> {
		protected Long doInBackground(Context... contexts) {
			
			
			Ofertaendpoint.Builder builder = new Ofertaendpoint.Builder(
					AndroidHttp.newCompatibleTransport(), new GsonFactory(),
					null);
					//builder.setApplicationName("buyabeta");
					Ofertaendpoint service = builder.build();
					//System.out.println(service.getApplicationName());
					
					try {
						System.out.println("Q pedo???");
						resultQuery = service.listOferta().execute();
						System.out.println(resultQuery);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
			
			/*Ofertaendpoint.Builder endpointBuilder = new Ofertaendpoint.Builder(
					AndroidHttp.newCompatibleTransport(), new JacksonFactory(),
					new HttpRequestInitializer() {
						public void initialize(HttpRequest httpRequest) {
						}
					});
			Ofertaendpoint endpoint = CloudEndpointUtils.updateBuilder(
					endpointBuilder).build();
			try {
				Oferta note = new Oferta();
				String noteID = new Date().toString();
				note.setId(noteID);
				note.setAdvertaicer("nota");
				note.setTitulo("nota");
				note.setCondiciones("nota");
				note.setDescripcion("nota");
				note.setVigencia("nota");
				note.setImagen("aca url imagen");
				Oferta result = endpoint.insertOferta(note).execute();
				//resultQuery = endpoint.getOferta("name=1970-01-01").execute();
			} catch (IOException e) {
				e.printStackTrace();
			}*/
			
			return (long) 0;
		}
	}

}
