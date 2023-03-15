package myfirstserver.myfirstserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tax")
public class TaxController {

    enum Type {
        VAT(0.23f),
        INCOME(0.18f),
        BELKI(0.02f);

        private float value;

        Type(float value) {
            this.value = value;
        }

        public float getValue() {
            return value;
        }
    }

    //tax/count?quantity=700&type=VAT -> 700 * 0.23
    //http://localhost:8080/tax/count?quantity=700&type=VAT
    @GetMapping("/count")
    public float count(@RequestParam int quantity, @RequestParam Type type) {
        return quantity * type.getValue();
    }

    //tax?type=VAT -> 0.23
    //http://localhost:8080/tax?type=VAT
    @GetMapping
    public float get(@RequestParam Type type) {
        return type.getValue();
    }




}
