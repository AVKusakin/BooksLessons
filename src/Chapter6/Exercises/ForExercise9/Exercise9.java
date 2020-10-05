package Chapter6.Exercises.ForExercise9;

/**
 * 9. Поместите следующий файл в каталог access/local (предположительно заданный в переменной CLASSPATH):
 * ...
 *    Затем сохраните в каталоге, отличном от access/local, такой файл:
 * ...
 *    Объясните, почему компилятор выдает сообщение об ошибке. Изменит ли что-нибудь помещение класса Foreign пакет
 * access.local?
 * @see Chapter6.Exercises.ForExercise9.access.foreign.Foreign;
 * @see Chapter6.Exercises.ForExercise9.access.local.Foreign2;
 * date: 05.10.2020
 */
public class Exercise9 {
//    Компилятор выдает сообщение об ошибке, потому что класс PackagedClass не является публичным: он содержит модификатор
//    доступа default(доступ в пределах пакета), а значит создавать объекты такого класса можно только в этом же пакете
//    (access.local). Именно поэтому, если создать класс Foreign2 в пакете access.local, то в нём можно создавать объекты
//    класса PackagedClass и работать с ними, компилятор не будет выдавать сообщения об ошибке.
}