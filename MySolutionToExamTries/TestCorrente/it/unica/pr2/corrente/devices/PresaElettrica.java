package it.unica.pr2.corrente.devices;

import it.unica.pr2.corrente.*;
import java.util.*;

public class PresaElettrica extends Device implements OutputDevice {

	public static boolean status = false;
	public int wattSupportati = 2000;
	public int wattIstantanei = 0;

	public PresaElettrica(int watt){
		super(watt);
		this.watt = watt;
	}
	
	public boolean isOn(){
		return status;
	}
	

	public void setToOn(boolean command) throws SaltataLaCorrente {
		if ( !this.status && wattSupportati < wattIstantanei){
			wattIstantanei = 0;
			throw new SaltataLaCorrente();
		}
		if ( this.status && command) throw new SaltataLaCorrente();
		else this.status = command;
	}
	
	public int wattSupportati(){
		return this.wattSupportati;
	}

	public int wattIstantanei(){
		if(this.status == false){
			 return 0;
		} else{
				return this.wattIstantanei;
		}
	}
	
}
