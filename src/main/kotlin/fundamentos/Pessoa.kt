package fundamentos

class Pessoa(var nome:String, var idade:Int) {
    override fun toString(): String {
        return "Classe: Pessoa. Nome:${nome}, Idade:${idade}"
    }
}

fun main(){
    var allan = Pessoa("Allan", 38)
    println(allan)
}