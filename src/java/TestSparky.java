
import java.util.ArrayList;
import java.util.List;
import modelo.Mascota;
import org.hibernate.Query;
import org.hibernate.Session;
import utils.HibernateUtil;

public class TestSparky {

    public static void main(String[] args) {
        List<Mascota> listaPerroSparky = new ArrayList<>();
        listaPerroSparky = actualizaPastoAleman();
        for (int i = 0; i < listaPerroSparky.size(); i++) {
            System.out.println("Nombre:" + listaPerroSparky.get(i).getNombre());
            System.out.println("Nombre:" + listaPerroSparky.get(i).getNombreDueno());
            System.out.println("Nombre:" + listaPerroSparky.get(i).getRaza());
            System.out.println("Nombre:" + listaPerroSparky.get(i).getEdad());

        }

    }

    public static List<Mascota> actualizaPastoAleman() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota where nombre ='sparky'";
        Query query = session.createQuery(hql);
        List<Mascota> miLista = query.list();
        return miLista;

    }

}
