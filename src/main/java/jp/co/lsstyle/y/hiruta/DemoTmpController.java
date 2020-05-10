package jp.co.lsstyle.y.hiruta;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoTmpController {

	@RequestMapping(value = "/demo/tmp" , method = RequestMethod.GET)
	private String init(Model mdl) {
		return "demo_tmp.html";
	}

	@RequestMapping(value = "/demo/tmp/dec" , method = RequestMethod.GET)
	private String init_dec(Model mdl) {
		return "demo_tmp_dec.html";
	}

}
