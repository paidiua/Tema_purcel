/*
package buc13;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PisicaTest {

    @Mock
    private Person mockProprietar;

    @InjectMocks
    private Pisica pisicaDeTest;

    @Test
    public void bla(){
        pisicaDeTest = new Pisica("cutzu", mockProprietar);

        Mockito.when(mockProprietar.getNume()).thenReturn("Nume De Test");

        String proprietarName = pisicaDeTest.getProprietarName();

        System.out.println("mocked proprietar nume : " + proprietarName);

    }

    @Test
    public void getNameFromTagShouldReturnCorrectName(){
        //given
        String expectedName = "Name on tag is : cutzu";
        Pisica testPisica =
                new Pisica("cutzu",
                        "geo");
        //when
        String actualName = testPisica.getNameFromTag();

        Assert.assertEquals(expectedName, actualName);
    }
}
*/
