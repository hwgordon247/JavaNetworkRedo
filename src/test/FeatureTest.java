package test;

import domain.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by hwgordon on 19/04/2016.
 */
public class FeatureTest {





    @Test
    public void canCreateUser(){
        User spike = new User();
        User nikesh = new User();
        User leo = new User();
        spike.post("hello");
        nikesh.post("hi");
        leo.post("hey");
        spike.view(leo);
        assertEquals("hey\n", spike.view(leo));
//        spike.follow(leo);
//        spike.follow(nikesh);
//        spike.wall();

    }
}
