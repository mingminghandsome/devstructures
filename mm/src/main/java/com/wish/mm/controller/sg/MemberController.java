package com.wish.mm.controller.sg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wish.mm.service.MemberService;

/**
 * 
 * @author mingminghandsome
 *
 */
@Controller
@RequestMapping("/sg")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@RequestMapping("/member/{id}")
	public String getMember(@PathVariable("id") Integer id, ModelMap map) {
		// ModelAndView mv = new ModelAndView("member");
		// mv.addObject("member", memberService.selectByPrimaryKey(id));
		// return mv;
		map.put("member", memberService.selectByPrimaryKey(id));
		return "member";
	}
}
