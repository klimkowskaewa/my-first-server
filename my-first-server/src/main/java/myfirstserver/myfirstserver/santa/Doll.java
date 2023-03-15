package myfirstserver.myfirstserver.santa;

import org.springframework.stereotype.Component;

@Component
public class Doll implements Present{
    @Override
    public PresentType presentType() {
        return PresentType.DOLL;
    }
}
