package buildings

class Building<T: BaseBuildingMaterial> (val material: T) {

    companion object {
        const val BASE_MATERIALS_NEEDED = 100
    }

    val actualMaterialsNeeded = BASE_MATERIALS_NEEDED * material.numberNeeded

    fun build(): String {
        return "$actualMaterialsNeeded ${material::class.simpleName}"
    }

}