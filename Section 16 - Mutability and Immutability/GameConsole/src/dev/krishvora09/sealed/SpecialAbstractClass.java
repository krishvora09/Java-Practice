package dev.krishvora09.sealed;

public sealed abstract class SpecialAbstractClass permits
        FinalKid, NonSealedKid, SealedKid, SpecialAbstractClass.Kid {

    final class Kid extends SpecialAbstractClass {

    }
}
