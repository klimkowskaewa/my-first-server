package myfirstserver.myfirstserver.santa;

public class Kid1 implements KidsWaitingForPresent{

    @Override
    public PresentType wish() {
        return PresentType.LEGO;
    }

}
