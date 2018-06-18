package bookreader.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "BOOKLIBRARY")
public interface BookReaderService {
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/booklibrary/recommended"
    )
    String bookReadingList();
}


