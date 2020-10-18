package Chapter9.Exercises;

import Chapter9.Exercises.ForExercise5.ForExercise5;

/**
 * 6. Докажите, что все методы интерфейса автоматически являются открытыми (public).
 * @see Chapter9.Exercises.Exercise5
 * @see Chapter9.Exercises.ForExercise5.ForExercise5
 * date: 18.10.2020
 */
public class Exercise6 implements ForExercise5 {

//!    @Override                                             // Ошибка: firstMethod() in Chapter9.Exercises.Exercise6
//!    void firstMethod() {                                  // cannot implement firstMethod() in
//!        System.out.println("Exercise6.firstMethod()");    // Chapter9.Exercises.ForExercise5.ForExercise5 attempting
//!    }                                                     // to assign weaker access privileges; was public

    @Override
    public void firstMethod() {
        System.out.println("Exercise6.firstMethod()");
    }

//!    @Override                                             // Ошибка: secondMethod() in Chapter9.Exercises.Exercise6
//!    protected void secondMethod() {                       // cannot implement secondMethod() in
//!        System.out.println("Exercise6.secondMethod()");   // Chapter9.Exercises.ForExercise5.ForExercise5 attempting
//!    }                                                     // to assign weaker access privileges; was public

    @Override
    public void secondMethod() {
        System.out.println("Exercise6.secondMethod()");
    }

//!    @Override                                            // Ошибка: thirdMethod() in Chapter9.Exercises.Exercise6
//!    private void thirdMethod() {                         // cannot implement thirdMethod() in
//!        System.out.println("Exercise6.thirdMethod()");   // Chapter9.Exercises.ForExercise5.ForExercise5 attempting
//!    }                                                    // to assign weaker access privileges; was public

    @Override
    public void thirdMethod() {
        System.out.println("Exercise6.thirdMethod()");
    }

    public static void main(String[] args) {
        Exercise6 e = new Exercise6();
        e.firstMethod();
        e.secondMethod();
        e.thirdMethod();
    }
}
/**
 * При объявлении переопределённых методов с любыми модификаторами доступа кроме public приводит к ошибке. При этом в
 * самом интерфейсе данный модификатор доступа не был указан ни у одного метода. Значит, методы интерфейса автоматически
 * являются открытыми.
 */