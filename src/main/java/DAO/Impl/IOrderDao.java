package DAO.Impl;

import JavaBean.Order;
import java.util.List;

public interface IOrderDao {
    void save(Order o);
    void update(Order o);
    void delete(Long Id);
    Order getOne(Long Id);
    List<Order> getAll();
}
