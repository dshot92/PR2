/*
	ATTENZIONE:

	sottomettere solo zip che compilino
	
	usare javac -Xlint:unchecked  per accertarsi che non ci siano problemi coi tipi generici
	usare java -ea  per verificare le assert
 */
package it.unica.pr2.services.tests;

import it.unica.pr2.services.SquareRoot;
import it.unica.pr2.services.*; // your work must be placed here
import java.util.*;

public class TestServices {

    public static void main(String[] args) {

// 18
        ServiceProvider provider = new ServiceProvider("math");
        Set<String> serviceDescriptions = provider.keySet(); // see point 19 for suggestions
        assert serviceDescriptions.size() == 0;

        provider.put("square root", (Service) SquareRoot.getService());
        serviceDescriptions = provider.keySet();
        assert serviceDescriptions.size() == 1;
        assert serviceDescriptions.contains("square root");

// 20
        assert provider instanceof Map;

// 24	
        assert provider.get("square root").toString().equals(
                serviceDescriptions.iterator().next());

// 27

        provider.put("double integer", (Service) DoubleInt.getService());
        Service s = provider.get("square root");
        Object result = s.execute(new Double(9.0));
        Double d = (Double) result;
        assert d == 3.0;

        s = provider.get("double integer");
        result = s.execute(new Integer(10));
        Integer n = (Integer) result;
        assert n == 20;

// 30
        Double n2 = provider.execute("square root", 25.0); // return type of the same type of the input
        assert n2 == 5.0;
     	Integer n3 = provider.execute("double integer", 25);
        assert n3 == 50;
/*
        /**/
	System.out.println("Everything OK");
    }

}
