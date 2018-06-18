package bookreader.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "KINDLELIBRARY")
public interface KindleReaderService {
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/kindlelibrary/recommended"
    )
    String kindleReadingList();
}

