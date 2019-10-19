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
    Assert.assertEquals(3, add1.add(1, 2));

    
}

}
