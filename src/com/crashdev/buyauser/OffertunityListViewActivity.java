package com.crashdev.buyauser;

import java.io.IOException;
import java.util.ArrayList;

import android.app.ProgressDialog;
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

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.crashdev.buyauser.ofertaendpoint.Ofertaendpoint;
import com.crashdev.buyauser.ofertaendpoint.model.CollectionResponseOferta;
import com.crashdev.buyauser.ofertaendpoint.model.Oferta;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.json.gson.GsonFactory;

public class OffertunityListViewActivity extends SherlockActivity {

	private ListView lv;
	private OffertunityListviewAdapter listAdapter;
	private CollectionResponseOferta resultQuery = null;
	private boolean flagSal = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

		setTheme(R.style.Theme_Sherlock_Light);

		getSherlock().setProgressBarIndeterminate(true);

		setContentView(R.layout.activity_offertunity_listview);

		getSupportActionBar().setBackgroundDrawable(
				new ColorDrawable(Color.parseColor("#ff5112")));

		// setSupportProgressBarIndeterminateVisibility(true);

		new EndpointsTask().execute(getApplicationContext());

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getSupportMenuInflater().inflate(R.menu.offertinity_list_view, menu);
		return true;
	}



	/*
	 * @Override public boolean onOptionsItemSelected(MenuItem item) { // TODO
	 * Auto-generated method stub if(item.getItemId() == R.id.favoritos){
	 * //startActivity(new Intent(getApplicationContext(),
	 * OffertunitiesMapViewActivity.class)); //new
	 * EndpointsTask().execute(getApplicationContext());
	 * //Toast.makeText(getApplicationContext(), "--"+resultQuery.getClass(),
	 * Toast.LENGTH_SHORT).show(); }else if(item.getItemId() ==
	 * R.id.configuracion){ //startActivity(new Intent(getApplicationContext(),
	 * OffertunitieDetailActivity.class)); //OffertunityCard tempOffer = new
	 * OffertunityCard(); //ArrayList<OffertunityCard> tempOffer = new
	 * ArrayList<OffertunityCard>(); //
	 * 
	 * //Atualiza lista } return super.onOptionsItemSelected(item); }
	 */

	public class EndpointsTask extends AsyncTask<Context, Integer, Long> {
		ProgressDialog dialog;

		@Override
		protected void onPreExecute() {
			super.onPreExecute();

			dialog = new ProgressDialog(OffertunityListViewActivity.this);
			dialog.setMessage("loading");
			dialog.show();
		}

		@Override
		protected Long doInBackground(Context... params) {
			Ofertaendpoint.Builder builder = new Ofertaendpoint.Builder(
					AndroidHttp.newCompatibleTransport(), new GsonFactory(),
					null);
			// builder.setApplicationName("buyabeta");
			Ofertaendpoint service = builder.build();
			// System.out.println(service.getApplicationName());

			try {
				// System.out.println("Q pedo???");
				resultQuery = service.listOferta().execute();
				
				System.out.println(resultQuery);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			/*
			 * Ofertaendpoint.Builder endpointBuilder = new
			 * Ofertaendpoint.Builder( AndroidHttp.newCompatibleTransport(), new
			 * JacksonFactory(), new HttpRequestInitializer() { public void
			 * initialize(HttpRequest httpRequest) { } }); Ofertaendpoint
			 * endpoint = CloudEndpointUtils.updateBuilder(
			 * endpointBuilder).build(); try { Oferta note = new Oferta();
			 * String noteID = new Date().toString(); note.setId(noteID);
			 * note.setAdvertaicer("nota"); note.setTitulo("nota");
			 * note.setCondiciones("nota"); note.setDescripcion("nota");
			 * note.setVigencia("nota"); note.setImagen("aca url imagen");
			 * Oferta result = endpoint.insertOferta(note).execute();
			 * //resultQuery = endpoint.getOferta("name=1970-01-01").execute();
			 * } catch (IOException e) { e.printStackTrace(); }
			 */

			return (long) 0;
		}

		@Override
		protected void onPostExecute(Long result) {
			super.onPostExecute(result);
			if (dialog.isShowing() && result != null) {
				dialog.dismiss();
				
				flagSal = true;
				getSherlock().setProgressBarIndeterminate(false);
				listAdapter = new OffertunityListviewAdapter(
						(ArrayList<Oferta>) resultQuery.getItems(),
						getApplicationContext());
				lv = (ListView) findViewById(R.id.offertunitiesListView);
				lv.setOnItemClickListener(new OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> arg0, View arg1,
							int arg2, long arg3) {
						// Aqui lanzamos el intent con el detailView de la
						// oferta
						// Toast.makeText(getApplicationContext(), "A webo!!",
						// Toast.LENGTH_SHORT).show();
						// Intent i = new Intent(getApplicationContext(),
						// SearchOffertunitiesActivity.class);
						// OffertunityCard offertToShow = new OffertunityCard();
						// arg0.getAdapter().getClass()
						Oferta offertToShow = (Oferta) arg0.getAdapter()
								.getItem(arg2);
						OffertunityCard offertToSend = new OffertunityCard();

						offertToSend.setAdvertiserName(offertToShow
								.getAdvertaicer());
						offertToSend.setOfferDescription(offertToShow
								.getDescripcion());
						offertToSend.setOffertTitle(offertToShow.getTitulo());
						offertToSend.setVigencia(offertToShow.getVigencia());
						offertToSend.setMainImage(R.drawable.descuentos);
						offertToSend.setId(offertToShow.getId());
						// offertToShow.getId()

						// Toast.makeText(getApplicationContext(),
						// "--"+offertToShow.getId(),
						// Toast.LENGTH_SHORT).show();

						Intent i = new Intent(getApplicationContext(),
								OffertunitieDetailActivity.class);
						i.putExtra("oferta", offertToSend);
						/*
						 * i.putExtra("id", offertToShow.getId());
						 * i.putExtra("title", offertToShow.getOffertTitle());
						 * i.putExtra("advertiser",
						 * offertToShow.getAdvertiserName());
						 * i.putExtra("description",
						 * offertToShow.getOfferDescription());
						 */
						startActivity(i);
					}

				});
				
				lv.setAdapter(listAdapter);
				
				
				

			}
		}
	}

}
