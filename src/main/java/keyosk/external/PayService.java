
package keyosk.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="Pay", url="http://Pay:8080")
public interface PayService {
    @RequestMapping(method= RequestMethod.GET, path="/pays")
    public void pay(@RequestBody Pay pay);


    
    @RequestMapping(method= RequestMethod.POST, path="/payed")
    public void payed(@RequestBody Payed Payed);

}

