package buc13;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void getCnpIfCanReadCnpIsTrue(){
        // given
        long expectedCnp = 55;
        Person testPerson = new Person("test", 55);

        //when
        long actualCnp = testPerson.getCnp(true);

        Assert.assertEquals(expectedCnp, actualCnp);
    }

    @Test
    public void getCnpIfCanReadCnpIsFalse(){
        // given
        long expectedCnp = 0;
        Person testPerson = new Person("test", 55);

        //when
        long actualCnp = testPerson.getCnp(false);

        //then
        Assert.assertEquals(expectedCnp, actualCnp);
    }
}
