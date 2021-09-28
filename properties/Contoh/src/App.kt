class Animal
{
    var name: String = "Dicoding Miaw"
        get()
        {
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value)
        {
            println("Fungsi Setter terpanggil")
            field = value
        }
}

// main function
fun main()
{
    val dicodingCat = Animal() // membuat val dicodingCat refering to Animal()
    println("Nama: ${dicodingCat.name}" ) //output = "Nama: Dicoding Miaw"; get & set jg ada di output
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}") // output = "Nama: Goose"
    // get dan set tdk diprint di output karena name sudah didefinisikan ulang, bukan "Dicoding Miaw" lagi
}