package spice
import spices.Grinder

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {

    override fun grind() {
        println("Grinding the curry spice...")
    }

    override fun prepareSpice() {
        grind()
        println("Curry prepared with spiciness [$spiciness] and heat [$heat]")
    }

}