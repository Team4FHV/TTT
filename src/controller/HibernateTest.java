package controller;

import DTO.objecte.DTOVeranstaltungInformation;
import Domain.DAOFabrik;
import Domain.DAOGeneric;
import Domain.DAOObjekte.DAOKarte;
import Hibernate.objecte.Karte;
import Hibernate.objecte.Kunde;
import java.rmi.RemoteException;
import java.util.ArrayList;


public class HibernateTest {
	

	public static void main(String[] args) throws RemoteException {
            
           // DataManager m = new DataManager();
           // System.out.println( m.getKuenstlerNachName("JonnyRonny"));
            RMIController k = new RMIController();
            ArrayList<DTOVeranstaltungInformation> ll =  k.sucheVeranstaltungenNachKrieterien(null, null, "JonnyRonny");
         //   System.out.println(ll.get(0).getKuenstler());
            
            //Bestellung b = m.getReservierungNachID(1);
            //Kunde b = m.getKundeNachID(1);
            //System.out.println(b.getAnrede().toString() + b.getVorname());
            //UseCaseControllerSearch x = new UseCaseControllerSearch();
             //List y = x.searchFilter(null, "2013-11-01", "Winter Kommt ");
             //Veranstaltung z = (Veranstaltung)y.get(0);
             //z.setName("DDDD");
             
            //System.out.println(z.getDatumUhrzeit().toString());
            //System.out.println(y.size());
            //Rolle g= new Rolle("Super");
            //DAOFabrik.getInstance().getRolleDAO().saveORupdate(g);
            //List<Veranstaltung> c = 
             
             //Rolle g = DAOFabrik.getInstance().getRolleDAO().findById(4, true);
             //Benutzer b = DAOFabrik.getInstance().getBenutzerDAO().findById(1, true);
             //DAOFabrik.getInstance().getBenutzerDAO().addBenutzerRolle(b, g);
             //DAOFabrik.getInstance().getBenutzerDAO().saveORupdate(b);
             
            // UseCaseControllerBestellungErstellen g = new UseCaseControllerBestellungErstellen();
             
//             Karte k =  DAOFabrik.getInstance().getKarteDAO().findById(1, false);
//             
//             g.karteKaufen(k, true);
//             Kunde ku = DAOFabrik.getInstance().getKundeDAO().findById(1, false);
//             
//             
//             System.out.println(ku.getBestellungs().size());
//             System.out.println(g.getReservierteKartenVonKunde(ku).size());
            
               

            
        }	 

}