package it.unica.pr2.corrente;

import java.util.*;

public interface OutputDevice {

	public void setToOn(boolean status);

	public int wattSupportati();
	public int wattIstantanei();
	
}
