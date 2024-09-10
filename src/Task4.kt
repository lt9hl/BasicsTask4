/*Задача 4.
Создать приложение, с помощью которого пользователь, введя два числа и символ операции,
узнает результат. Символами операции могут быть: / — деление, * — умножение, + — сложение, —
— вычитание. Числа могут быть вещественными. Числа и знак операции разделяются между
собой одним пробелом. Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ*/
fun main(){
    println("Введите 2 числа и символ операции, которую хотели бы произвести, через пробел")
    var arr:CharArray?= readln().toCharArray()
    arr?.let {
        var oper:Char='0';
        var arrI=IntArray(2)
        try {
            arrI[0] = it[0].toString().toInt()
            arrI[1] = it[2].toString().toInt()
            oper=it[it.size-1]
        } catch (e: Exception) {
            println("Введённое значение неверно")
        }
        Calculator(arrI,oper)  }

}
fun Calculator(array:IntArray, oper:Char){
    var finish:Int=0

    when(oper){
        '*' ->  finish=array[0] * array[1]
        '/' ->  finish=array[0] / array[1]
        '+' ->  finish= array[0] + array[1]
        '-' ->  finish=array[0] - array[1]
        else -> println("Ошибочный оператор")
    }
    println("Результат: ${finish}")
}