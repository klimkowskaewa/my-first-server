package myfirstserver.myfirstserver.santa;

import org.springframework.stereotype.Component;

@Component
public class Lego implements Present{
    @Override
    public PresentType presentType() {
        return PresentType.LEGO;
    }
}
