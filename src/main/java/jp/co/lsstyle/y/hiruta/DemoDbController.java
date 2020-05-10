package jp.co.lsstyle.y.hiruta;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.lsstyle.y.hiruta.entity.MSkill;
import jp.co.lsstyle.y.hiruta.form.DemoDbForm;
import jp.co.lsstyle.y.hiruta.mapper.MSkillMapper;

@Controller
@RequestMapping("demo")
public class DemoDbController {

	@Autowired
	private MSkillMapper mSkillMapper;


	@RequestMapping(path = "/init001", method = RequestMethod.GET)
	public ModelAndView init001() {

		ModelAndView mv = new ModelAndView();


		MSkill param = new MSkill();
		param.setSkillId("001");
		param.setTekiyoStrDay("20200420");


		MSkill rtn = mSkillMapper.findByPrimaryKey(param);

		DemoDbForm  demoDbForm = new DemoDbForm();
		demoDbForm.setTitle("メニュー");
		BeanUtils.copyProperties(rtn, demoDbForm);
		mv.addObject("demoDbForm",demoDbForm);
		mv.setViewName("demo_db");

		return mv;
	}
}
