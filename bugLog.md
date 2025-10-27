## Bug 1
Brief description: When you create a computer, the constructor rewrites the memory attribute to be 16 regardless of what you input
Failed unit test: TestConstructingMemory()

## Bug 2
Brief description:  When you create a computer, the constructor rewrites the price attribute to be 16 regardless of what you input
Failed unit test: TestConstructingPrice()

## Bug 3
Brief description:  The setOS method in Computer does not change the operating system to the new operating system, it just sets the operating system attribute to "None"
Failed unit test: TestSetOS

## Bug 4
Brief description:  The loop in printInventory in ResaleShop will always throw an index out of bounds error because it goes from 0 to <= the size of the inventory rather than from 0 to < the size of the inventory. It tries to go one too many times and then throws an out of bounds exception. 
Failed unit test: TestPrintInventoryLoop()

## Bug 5
Brief description:  When you buy a computer in Resale Shop, whatever computer you input is rewritten to be a different computer
Failed unit test: TestResaleShopBuyA()

## Bug 6
Brief description:  Buy in Resale Shop is supposed to throw an error if two of the same computers are bought and it doesnt
Failed unit test: TestResaleShopBuyB()

## Bug 7
Brief description:  Everytime a computer is bought, a new computer object is creates so even if two computers in the shop have the same information they will be read as different computers even if they're identical. 
Failed unit test: TestResaleShopBuyC()

## Bug 8
Brief description: sell is supposed to throw an exception if you try to sell a computer not in the resale shop but no exception is ever thrown
Failed unit test: TestResaleShopSell()

## Bug 9
Brief description:  
Failed unit test: 

## Bug 10
Brief description:  
Failed unit test: 