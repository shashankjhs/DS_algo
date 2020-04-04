package abstractClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AgeCalculation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method substing 
		
		String []date ="1984-1-6".split("-");
		int oyrs=Integer.parseInt(date[0]);	
		int om =Integer.parseInt(date[1]);
		int odays=Integer.parseInt(date[2]);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
		
		String []cdate=dateFormat.format(cal.getTime()).split("-");
		//System.out.println(cal.getTime().toString());
		int Cyrs=Integer.parseInt(cdate[0]);	
		int cm =Integer.parseInt(cdate[1]);
		int cdays=Integer.parseInt(cdate[2]);
		
		System.out.println(cdays);
		
		
		int days=0;
		if (cdays<odays)
		{
			cdays=cdays+30;
			cm=cm-1;
		}
		days=cdays-odays;
		if (cm<om)
		{
			cm=cm+12;
			Cyrs=Cyrs-1;
		}
		int mon=cm-om;
		int year=Cyrs-oyrs;
		
		if(year<0)
			System.out.println("futeure dat");
		else
		System.out.println(year+"-"+mon+"-"+days);//Calendar cdate = Calendar.getInstance().g;
		

	}

}
