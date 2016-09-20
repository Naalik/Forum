/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpatest.test;

import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class CreateDBTest {
    
    @Test
    public void createDBTest(){
        Persistence.createEntityManagerFactory("PU");
    }
    
}
