package myfirstserver.myfirstserver.santa;

public class Kid2 implements KidsWaitingForPresent{

    @Override
    public PresentType wish() {
        return PresentType.BICYCLE;
    }

}
