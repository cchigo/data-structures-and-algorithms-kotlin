package kotlinTutorial
enum class LootType{
    POTION, RING, ARMOR //values of an enumn
}
class Loot (val name: String, val type: LootType, val value: Double) {
}