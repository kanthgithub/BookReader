package bookreader.controller;

import bookreader.service.BookReaderService;
import bookreader.service.KindleReaderService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookReaderController {

    @Autowired
    private BookReaderService bookReaderService;

    @Autowired
    private KindleReaderService kindleReaderService;

    @RequestMapping("/to-read")
    public String readBook(){

        StringBuffer stringBuffer = new StringBuffer();

        String booksRecommended = bookReaderService.bookReadingList();

        if(StringUtils.isNotBlank(booksRecommended)){
            stringBuffer.append("booksRecommended by library: ").append(booksRecommended).append("\n");
        }

        String kindleBooksRecommended = kindleReaderService.kindleReadingList();

        if(StringUtils.isNotBlank(kindleBooksRecommended)){
            stringBuffer.append("kindleBooksRecommended by Kindle-library: ").append(kindleBooksRecommended).append("\n");
        }

        return stringBuffer.toString();
    }

}
