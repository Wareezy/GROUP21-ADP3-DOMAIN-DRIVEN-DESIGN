package za.ac.cput.factory;
/*
Mpho Sefoloko
218336322
group 21
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Menu;

import static org.junit.jupiter.api.Assertions.*;

class MenuFactoryTest {

    @Test
    public void createMenu(){
        Menu menu = MenuFactory.createMenu("burger",89.99, 90.00);
        System.out.println(menu);
        assertNotNull(menu);
    }

}