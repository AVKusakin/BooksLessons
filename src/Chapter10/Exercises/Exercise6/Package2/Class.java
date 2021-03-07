package Chapter10.Exercises.Exercise6.Package2;

import Chapter10.Exercises.Exercise6.Package1.Interface;

public class Class {
    protected class InnerClass implements Interface {
        @Override
        public String getInterface() {
            return "Class.InnerClass.Interface";
        }
    }

    public Interface getInterface() {
        return new InnerClass();
    }
}