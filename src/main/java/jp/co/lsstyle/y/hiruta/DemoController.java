package jp.co.lsstyle.y.hiruta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {


    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

	@RequestMapping(value="/demo", method = RequestMethod.GET)
	private String demo() {
        logger.info("demo実行されました。");

		return "/demo.html";
	}

	@RequestMapping(value="/next", method = RequestMethod.POST)
	private String next() {
        logger.info("next実行されましたよ。");

		return "/demo.html";
	}

}
