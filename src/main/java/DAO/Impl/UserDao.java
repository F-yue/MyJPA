package DAO.Impl;

import DAO.IUserDao;
import JavaBean.User;
import Util.JPAUtil;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class UserDao implements IUserDao {

    @Override
    public void save(User s) {
        EntityManager manager = JPAUtil.getEntityManager();//实体管理器，事务相关，一起成功一起失败
        manager.getTransaction().begin();
        manager.persist(s);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public void update(User s) {
        EntityManager manager = JPAUtil.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(s);//
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public void delete(Long Id) {
        EntityManager manager = JPAUtil.getEntityManager();
        manager.getTransaction().begin();
        User s = manager.find(User.class, Id);//User.class是反射
        manager.remove(s);
        manager.getTransaction().commit();
        manager.close();

    }

    @Override
    public User getOne(Long Id) {
        EntityManager manager = JPAUtil.getEntityManager();
        manager.getTransaction().begin();
        User user = manager.find(User.class, Id);
        return user;
    }

    @Override
    public List<User> getAll() {
        EntityManager manager = JPAUtil.getEntityManager();
        String sql = "select u from User u";
        Query query = manager.createQuery(sql);
        List list = query.getResultList();
        manager.close();
        return list;
    }
}
