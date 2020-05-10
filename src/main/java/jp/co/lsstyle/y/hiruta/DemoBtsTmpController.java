package jp.co.lsstyle.y.hiruta;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoBtsTmpController {

	@RequestMapping(value = "/demo/bt" , method = RequestMethod.GET)
	private String init(Model mdl) {
		return "demo_bts.html";
	}
}
