interface IFly { // biasanya nama interface diawali oleh huruf kapital. ga wajib, tapi biar bisa bedain sm class
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int) :IFly
{
    override fun fly() // isi Interface harus dioverride
    {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}


fun main()
{
    val bird = Bird(2)
    bird.fly()
}