package myfirstserver.myfirstserver.santa;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Santa {

    @Bean
    public KidsWaitingForPresent kid1(@Qualifier("lego") Present present) {
        Kid1 kid = new Kid1();
        if(!kid.givePresent(present)) {
            throw new RuntimeException("Wrong present");
        }
        return kid;
    }

    @Bean
    public KidsWaitingForPresent kid2(@Qualifier("bicycle") Present present) {
        Kid2 kid = new Kid2();
        if(!kid.givePresent(present)) {
            throw new RuntimeException("Wrong present");
        }
        return kid;
    }

    @Bean
    public KidsWaitingForPresent kid3(@Qualifier("iphone") Present present) {
        Kid3 kid = new Kid3();
        if(!kid.givePresent(present)) {
            throw new RuntimeException("Wrong present");
        }
        return kid;
    }

    @Bean
    public KidsWaitingForPresent kid4(@Qualifier("doll") Present present) {
        Kid4 kid = new Kid4();
        if(!kid.givePresent(present)) {
            throw new RuntimeException("Wrong present");
        }
        return kid;
    }

}