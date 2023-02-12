package class23;

public final class FinalKeyword {       //if we use final in class we can't inherit from it

    final double gravity = 9.8;       //final means that we cannot do any overriding on the variable
    final double PI = 3.14;
    final double LightSpeed = 299792458;

    final void tryChangingGravity() {
        // gravity=1.6;          we  get an error and can't change it because it's marked final
    }
}

/*
class Child extends FinalKeyword {

}
*/