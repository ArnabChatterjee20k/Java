package Oops5.NestedIntefaces;

public interface A {
    public interface NestedInteface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInteface{
    @Override
    public boolean isOdd(int num){
        return true;
    }
}
