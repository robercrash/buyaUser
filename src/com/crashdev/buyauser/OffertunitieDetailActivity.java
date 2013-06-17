package com.crashdev.buyauser;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockActivity;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.android.Contents;


public class OffertunitieDetailActivity extends SherlockActivity {
	
	TextView titulo, descripcion, advertiser;
	ImageView iv;
	String codeQR="SHIT";
	
	//datos de offertunity
	//String advertiser,description,title;
	OffertunityCard oferta = new OffertunityCard();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setTheme(R.style.Theme_Sherlock_Light);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_offertunitie_detail);
		
		titulo = (TextView) findViewById(R.id.titulo);
		descripcion = (TextView) findViewById(R.id.descripcion);
		advertiser = (TextView) findViewById(R.id.advertiser);
		iv = (ImageView) findViewById(R.id.promo_image);
		
		oferta = (OffertunityCard) getIntent().getSerializableExtra("oferta");
		
		titulo.setText(oferta.getOffertTitle());
		descripcion.setText(oferta.getOfferDescription());
		advertiser.setText(oferta.getAdvertiserName());
		iv.setBackgroundResource(oferta.getMainImageID());
		codeQR = oferta.getId();
	
		
		
		/*despliega QR-CODE*/
		
		Display display = getWindowManager().getDefaultDisplay();
		int width = display.getWidth();
		//int height = size.y;
		
		QRCodeEncoder qrCodeEncoder = new QRCodeEncoder(codeQR, 
	             null, 
	             Contents.Type.TEXT,  
	             BarcodeFormat.QR_CODE.toString(), 
	             width);
	   try {
	    Bitmap bitmap = qrCodeEncoder.encodeAsBitmap();
	    ImageView myImage = (ImageView) findViewById(R.id.qr_code);
	    myImage.setImageBitmap(bitmap);
	 
	   } catch (WriterException e) {
	    e.printStackTrace();
	   }
		
		/****/
	}
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.offertunitie_detail, menu);
		return true;
	}*/

}
