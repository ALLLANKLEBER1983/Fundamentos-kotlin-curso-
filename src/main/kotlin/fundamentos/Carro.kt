package fundamentos

class Carro(var cor:String,var anoFabricacao:Int,var dono:Dono){

}
data class Dono(var nome:String,var idade:Int){

}
fun main(){
    var carro = Carro("Branco",2017, Dono("Doriedson",39))
    println(carro.cor)
    carro.cor = "Azul"
    println(carro.cor)
    println(carro.dono.nome)
}