
import modelo.Mascota;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;


public class TestUpdate {
    
    public static void main(String[] args) {
  
       Mascota mimascota = new Mascota();
        mimascota.setIdMascota(2);
        mimascota.setNombre("alvitres");
        mimascota.setEdad(5);
        mimascota.setNombreDueno("Orfelinda");
        mimascota.setRaza("Trigoso");
        String mensaje = actualizaMascota(mimascota);
        System.out.println(mensaje);
        

    }
    
    
    
    public static String actualizaMascota(Mascota mascota)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.update(mascota);
        transaction.commit();
        session.close();
        return  "Se Actualizo";
        
    }
    
   
    
}
