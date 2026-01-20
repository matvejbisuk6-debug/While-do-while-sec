fun main() {
    // Задача 1

    //println("Введите число, пользователь")
    //val N = readLine()!!.toInt()
    //var sum = 0
    //var counter = 1

    //while(counter <= N) {
    //    counter++
    //    sum += counter

    //}
    //println(counter)
    //println(sum)

    // Задача 2

    //var num = 2

    //while (num <= 100) {
    //    println("Текущее число: $num")
    //    num += 2
    //}

    // Задача 3

    //val secret = 7
    //println("Введите пожайлуста число")
    //val answer = readLine()!!.toInt()

    //while (answer != secret) {
    //    if(answer < secret) {
    //        println("Меньше")
    //    } else {
    //        println("Больше")
    //    }
    //    println("Попробуйте еще раз!")
    //    break
    //}

    //if( secret == answer) {
    //    println("Поздравляю, вы угадали!")
    //}

    // do-while
    // 4 Задача

    //println("Введите пароль")
    //val password = readLine()!!.toInt()
    //val correctPass = 1234

    //do {
    //    if (password != correctPass) {
    //        println("Праоль введен неправильно!")
    //    } else {
    //        println("Пароль введен правильно!")
    //    }
    //    break
    //} while (password == correctPass)

    // 5 Задача

    //println("Меню:\"1)-Начать игру\", \"2)-Загрузить\", \"3)-Выход\"")
    //val exit = readLine()!!.toInt()

    //do {
    //    if(exit == 1) {
    //        println("Отлично!Начинаем игру!")
    //    } else if (exit == 2) {
    //        println("Загружаем!")
    //    } else if(exit == 3) {
    //        println("Выход...")
    //    }
    //    break
    //} while (true)

    // Задача 6

    println("Введите положительное число")
    val number = readLine()!!.toInt()

    do {
        if (number <= 0) {
            println("Число не положительное!")
        } else {
            println("Число положительное!Ура!")
        }
        break
    } while (number <= 0)


}