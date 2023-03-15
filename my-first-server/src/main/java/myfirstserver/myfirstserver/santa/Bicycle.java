package myfirstserver.myfirstserver.santa;

import org.springframework.stereotype.Component;

@Component
public class Bicycle implements Present{
    @Override
    public PresentType presentType() {
        return PresentType.BICYCLE;
    }
}
