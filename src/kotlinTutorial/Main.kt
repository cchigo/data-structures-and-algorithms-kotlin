package kotlinTutorial

fun main(args: Array<String>) {
    val tim =  Player("Tim")
//    println(tim.name)
//    println(tim.lives)
//    println(tim.level)
//    println(tim.score)
    tim.show()
    val luse = Player("luse", 5)
    luse.level = 5
//    luse.show()
    val gr8 = Player("gr8", 4, 8, 2)
    val chigozie = Player("chigorgor", 20,39, 3000)
//    gr8.show()

    val redPotion = Loot("Red potion", LootType.POTION, value = 7.50);

    tim.inventory.add(redPotion)
    val chestArmor = Loot("+3chest armor", LootType.ARMOR, 80.00)
    tim.inventory.add(chestArmor)

    tim.showInventory()

    println(tim.toString())



}