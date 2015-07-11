package unimanytomany;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import unimanytomany.hibernate.HibernateUtil;
import unimanytomany.model.Estudiante;
import unimanytomany.model.Materia;

public class UniManyToMany {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("estudiante1");

        Materia materia1 = new Materia();
        materia1.setNombre("materia1");
        Materia materia2 = new Materia();
        materia2.setNombre("materia2");
        Materia materia3 = new Materia();
        materia3.setNombre("materia3");

        estudiante1.addMateria(materia1);
        estudiante1.addMateria(materia2);
        estudiante1.addMateria(materia3);


        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("estudiante2");

        Materia materia4 = new Materia();
        materia4.setNombre("materia4");
        Materia materia5 = new Materia();
        materia5.setNombre("materia5");
        Materia materia6 = new Materia();
        materia6.setNombre("materia6");

        estudiante2.addMateria(materia4);
        estudiante2.addMateria(materia5);
        estudiante2.addMateria(materia6);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(estudiante1);
        session.save(estudiante2);
        trans.commit();
        session.close();
        
        session = HibernateUtil.getSessionFactory().openSession();
        trans = session.beginTransaction();
        Estudiante estudianteGet = (Estudiante)session.get(Estudiante.class, 1);
//        System.out.println("Estudiante obtenido: "+estudianteGet.getNombre());
//        List<Materia> lista = estudianteGet.getMaterias();
//        for(Materia materia: lista){
//            System.out.println("Materia: "+materia.getNombre());
//        }
//        
        session.delete(estudianteGet);
        trans.commit();
        session.close();
    }
    
}
