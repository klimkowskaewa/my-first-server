package myfirstserver.myfirstserver.santa;

import org.springframework.stereotype.Component;

@Component
public class Iphone implements Present{
    @Override
    public PresentType presentType() {
        return PresentType.IPHONE;
    }
}
