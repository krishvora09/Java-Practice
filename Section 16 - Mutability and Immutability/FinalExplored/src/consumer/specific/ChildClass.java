package consumer.specific;

import dev.krishvora09.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {
        System.out.println("[Child.optionalMethod]: Extra Stuff Here");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//        System.out.println("[Child.recommendedMethod]: I'll do things my way");
//        optionalMethod();
//    }

//    public static void recommendedStatic() {
//        System.out.println("[Child.recommendedStatic] Best Way to Do it");
//        optionalStatic();
////        mandatoryStatic();
//    }
}
