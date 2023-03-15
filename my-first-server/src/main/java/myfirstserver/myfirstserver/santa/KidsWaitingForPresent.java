package myfirstserver.myfirstserver.santa;

public interface KidsWaitingForPresent {
    PresentType wish();

    default boolean givePresent(Present present) {
        return present.presentType() == wish();
    }
}
