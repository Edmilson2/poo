/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import modelo.categoriaModelo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author edmilson
 */
public class classecrude {
     public static void main(String[] args) {
         categoriaModelo categoria= new categoriaModelo();
         
       //  categoria.setId();
         categoria.setNome("Edmilson");
         
         SessionFactory sf=new HibernateUtil().getSessionFactory();
         Session sessao=sf.openSession();
         sessao.beginTransaction();
         sessao.save(categoria);
         sessao.getTransaction().commit();
         sessao.close();
    }
    
}
