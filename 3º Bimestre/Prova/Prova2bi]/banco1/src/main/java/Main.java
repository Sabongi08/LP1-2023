import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Débora","Sabongi","debora.sabongi0809@gmail.com" );
        Pessoa p2 = new Pessoa ("Sarah", "Guimarães","sarinha123");
        Pessoa p3 = new Pessoa ("Elisa", "Andrade", "elisa.elisa444");
        Pessoa p4 = new Pessoa ("Solange", "Alves", "Alves.45");
        Pessoa p5 = new Pessoa ("Rosely", "Lavinas", "rose.448");
        Pessoa p6 = new Pessoa ("Katia", "Silva", "Silva.katia11");

        //criou o bdd
        Session session = HibernateUtil.getSessionFactory().openSession();
        //iniciando as transações
        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);
        session.persist(p5);
        session.persist(p6);
        //pode ir ksksksks
        transaction.commit();
        //recebe todos os registros do bdd, recwebe uma lista de pessoas
        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

      pessoas.forEach(p -> System.out.println(p.toString()));

    }
}
