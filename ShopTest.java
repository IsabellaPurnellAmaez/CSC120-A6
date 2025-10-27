import static org.junit.Assert.*;
import org.junit.Test;

public class ShopTest {
    
    @Test 
    public void TestConstructingMemory(){
        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 20, "High Sierra", 2019, 1000);

        assertEquals(myComputer.memory, 20);
    }

    @Test 
    public void TestConstructingPrice(){
        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        
        assertEquals(myComputer.memory, 1000);
    }

    @Test 
    public void TestSetOS(){
        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);

        myComputer.setOS("Low Sierra");
        assertEquals(myComputer.operatingSystem, "Low Sierra");
    }



    @Test
    public void TestPrintInventoryLoop(){
        ResaleShop myShop = new ResaleShop(); 
        try{
            myShop.printInventory();
        } catch (Exception IndexOutOfBoundsException){
            System.out.println("Index Out of Bounds");
            fail();
        }
    }

    @Test
    public void TestResaleShopBuyA(){ // issue is that it creates a different computer than the one input
        ResaleShop myShop = new ResaleShop(); 

        Computer myComputer = new Computer("2013 MacBook Pro", "Intel", 270, 18, "High Sierra", 2015, 2000);
        try{
            myShop.buy(myComputer);
        } catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        assertEquals(myShop.inventory.get(1), myComputer);
    }

    @Test (expected = Exception.class)
    public void TestResaleShopBuyB(){ // issue is that it doesn't throw error if same computer is added twice (or ever)
        ResaleShop myShop = new ResaleShop(); 

        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        try{
            myShop.buy(myComputer);
            myShop.buy(myComputer);
        } catch (Exception e){
            System.out.println(e.getLocalizedMessage());    
        }    
    }

    @Test 
    public void TestResaleShopBuyC(){ // issue is that it creates a new computer every time and they will never be read as equal
        ResaleShop myShop = new ResaleShop(); 

        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        try{
            myShop.buy(myComputer);
            myShop.buy(myComputer);

            
        } catch (Exception e){
            System.out.println(e.getLocalizedMessage());    
        }
        
        assertEquals(myShop.inventory.get(1), myShop.inventory.get(2));  
    }

    @Test (expected = Exception.class)
    public void TestResaleShopSell(){ 
        ResaleShop myShop = new ResaleShop(); 

        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        try{
            myShop.sell(myComputer);
        } catch (Exception e){
            System.out.println(e.getLocalizedMessage());    
        }    
    }

    @Test (expected = Exception.class) //theres nothing wrong w refurbish
    public void TestResaleShopRefurbishExcpetion() throws Exception{ 
        ResaleShop myShop = new ResaleShop(); 

        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        myShop.refurbish(myComputer, "new and improved operating system");
        
    }

    // @Test 
    // public void TestResaleShopRefurbish
}
