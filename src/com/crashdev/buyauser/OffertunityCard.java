package com.crashdev.buyauser;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class OffertunityCard {

	private String advertiserName;
	private String offertTitle;
	private String offerDescription;
	private String vigencia;
	private String condiciones;
	private int mainImageID;
	
	public OffertunityCard(){
		advertiserName = "";
		offertTitle = "";
		offerDescription = "";
		vigencia = "";
		condiciones = "";
	}
	
	public OffertunityCard(String advertiserName, String offertTitle, 
			String offerDescription, String vigencia, String condiciones){
		
		this.setAdvertiserName(advertiserName);
		this.setOffertTitle(offertTitle);
		this.setOfferDescription(offerDescription);
		this.setVigencia(vigencia);
		this.setCondiciones(condiciones);
	}

	public String getAdvertiserName() {
		return advertiserName;
	}

	public void setAdvertiserName(String advertiserName) {
		this.advertiserName = advertiserName;
	}

	public String getOffertTitle() {
		return offertTitle;
	}

	public void setOffertTitle(String offertTitle) {
		this.offertTitle = offertTitle;
	}

	public String getOfferDescription() {
		return offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

	public String getVigencia() {
		return vigencia;
	}

	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}

	public String getCondiciones() {
		return condiciones;
	}

	public void setCondiciones(String condiciones) {
		this.condiciones = condiciones;
	}

	public int getMainImageID() {
		return mainImageID;
	}

	public void setMainImage(int mainImage) {
		this.mainImageID = mainImage;
	}
}
