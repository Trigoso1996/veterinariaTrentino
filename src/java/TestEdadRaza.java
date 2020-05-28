
import java.util.ArrayList;
import java.util.List;
import modelo.Mascota;
import org.hibernate.Query;
import org.hibernate.Session;
import utils.HibernateUtil;

public class TestEdadRaza {

    public static void main(String[] args) {
        // TODO code application logic here
        List<Mascota> lista1 = new ArrayList<>();
        List<Mascota> lista2 = new ArrayList<>();
        lista1 = nombre();
        lista2 = PastorAleman();
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println("Edad: " + lista1.get(i).getEdad());
            System.out.println(" Raza: " + lista2.get(i).getRaza());
        }

    }

    public static List<Mascota> nombre() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota where edad =3";
        Query query = session.createQuery(hql);
        List<Mascota> miLista = query.list();
        return miLista;
    }

    public static List<Mascota> PastorAleman() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota where raza ='pastor aleman'";
        Query query = session.createQuery(hql);
        List<Mascota> miLista = query.list();
        return miLista;

    }

}
