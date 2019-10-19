import org.junit.Assert;

public class TestCoreFunctions {

@org.junit.Before
    public void setUp() throws Exception{

}
@org.junit.After
    public void tearDown() throws Exception{

}

@org.junit.Test
    public void add()   {
    CoreFunctions add1 = new CoreFunctions();
    Assert.assertEquals(3., add1.add(1.,2.), 0.00);
    Assert.assertEquals(100., add1.add(25., 75.), 0.00);
    Assert.assertEquals(1000., add1.add(550., 450.), 0.00);
}

@org.junit.Test
    public void subtract()  {
    CoreFunctions subtract1 = new CoreFunctions();
    Assert.assertEquals(1., subtract1.subtract(2.,1.), 0.00);
    Assert.assertEquals(50., subtract1.subtract(250., 200.), 0.00);
    Assert.assertEquals(100., subtract1.subtract(102.,2.), 0.00);
}

@org.junit.Test
    public void multiply()  {
    CoreFunctions multiply1 = new CoreFunctions();
    Assert.assertEquals(10, multiply1.multiply(5, 2), 0.00);
    Assert.assertEquals(100, multiply1.multiply(10,10), 0.00);
    Assert.assertEquals(1000, multiply1.multiply(1000,1), 0.00);
}

    @org.junit.Test
    public void divide()  {
    CoreFunctions divide1 = new CoreFunctions();
    Assert.assertEquals(5, divide1.divide(25,5), 0.00);
    Assert.assertEquals(10, divide1.divide(100, 10), 0.00);
    Assert.assertEquals(25, divide1.divide(100, 4), 0.00);
    }
}
