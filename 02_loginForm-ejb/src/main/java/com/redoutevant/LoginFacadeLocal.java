package com.redoutevant;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author dev
 */
@Local
public interface LoginFacadeLocal {

    void create(Login login);

    void edit(Login login);

    void remove(Login login);

    Login find(Object id);

    List<Login> findAll();

    List<Login> findRange(int[] range);

    int count();
    
}
