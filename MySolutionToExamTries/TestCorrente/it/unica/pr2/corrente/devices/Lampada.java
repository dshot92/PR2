package it.unica.pr2.corrente.devices;

import it.unica.pr2.corrente.*;
import java.util.*;

public class Lampada extends Device implements InputDevice {
	
	public int watt;
	public boolean connessione = false;

	public Lampada(int watt){
		super(watt);
		this.watt = watt;
	}

	public boolean isOn(){
		return PresaElettrica.status;
	}
	

	public void connectTo(OutputDevice dev) throws SaltataLaCorrente {
		this.connessione = true;
		if(dev instanceof PresaElettrica){
			dev = (PresaElettrica)dev;
			int aux = ((PresaElettrica)dev).wattIstantanei();
			if(((PresaElettrica)dev).wattSupportati() < (aux += this.watt)){
				throw new SaltataLaCorrente();
			}else{
			((PresaElettrica)dev).wattIstantanei += this.watt;
			}
		}
		
	}
}
