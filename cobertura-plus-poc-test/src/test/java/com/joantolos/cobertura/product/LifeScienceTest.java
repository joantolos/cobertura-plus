package com.joantolos.cobertura.product;

import com.joantolos.cobertura.enums.Method;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Created by u6019943 on 10/04/2015.
 */
public class LifeScienceTest {
    
    private LifeScience lifeScience;
    private Method method;
    
    @Before
    public void setUp(){
        this.method = Method.AGILE;
        this.lifeScience = new LifeScience(this.method);
    }
    
    @After
    public void tearDown(){
        this.method = null;
        this.lifeScience = null;
    }
    
    @Test
    public void agileTest(){
        Assert.assertTrue(this.lifeScience.changeTheWorld());
    }

    @Test
    public void waterfallTest(){
        LifeScience lifeScienceFailing = new LifeScience(Method.WATERFALL);
        Assert.assertFalse(lifeScienceFailing.changeTheWorld());
    }
    
}
