package Util;

import javax.persistence.*;

public class JPAUtil {
    public static EntityManagerFactory factory;
    static {
        factory = Persistence.createEntityManagerFactory("default");//这里的product需要和命名空间相同
    }
    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
