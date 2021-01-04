package com.example.ecsite.controller;

import java.util.List; //

import org.springframework.beans.factory.annotation.Autowired; //
import org.springframework.stereotype.Controller; //
import org.springframework.ui.Model; //
import org.springframework.web.bind.annotation.PostMapping; //
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; //????
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ecsite.model.dao.GoodsRepository; //	自作
import com.example.ecsite.model.dao.UserRepository; //	自作
import com.example.ecsite.model.entity.Goods; //	自作
import com.example.ecsite.model.entity.User; //	自作
import com.example.ecsite.model.form.GoodsForm;		// 自作（Lesson5)
import com.example.ecsite.model.form.LoginForm; //	自作

@Controller
@RequestMapping("/ecsite/admin")	//	URL:localhost:8080/ecsite/admin
public class AdminController {
	
	/* Lesson4 にて　作成 */
	@Autowired
	private UserRepository userRepos;
	
	/* Lesson4 にて　作成 */
	@Autowired
	private GoodsRepository goodsRepos;
	
	
	@RequestMapping("/")			
	public String index() {
		return "adminindex";		//	トップページ：adminindex.htmlへ遷移　
	}
	
	/* ECサイト構築（Lesson4） */
	@PostMapping("/welcome")
	public String welcome(LoginForm form,Model m) {
		// Lesson4　でコメント化
		// System.out.println(form.getUserName() + " " + form.getPassword());
		
		// Lesson4にて 作成 
		List<User> users = userRepos.findByUserNameAndPassword(form.getUserName(), form.getPassword());
		
		if(users != null && users.size() > 0) {
			boolean isAdmin = users.get(0).getIsAdmin() != 0;
			
			if(isAdmin) {
				List<Goods> goods = goodsRepos.findAll();
				m.addAttribute("userName",users.get(0).getUserName());
				m.addAttribute("password",users.get(0).getPassword());
				m.addAttribute("goods",goods);
			}
		}
		 return"welcome";
	 }
	
	//	Lesson5にて 作成	(新規商品登録)
	@RequestMapping("/goodsMst")
	public String goodsMst(LoginForm form,Model m) {
		m.addAttribute("userName",form.getUserName());
		m.addAttribute("password",form.getPassword());
		
		return "goodsmst";
	}
	
	//	Lesson5にて 作成	(新規商品登録)
	@RequestMapping("/addGoods")
	public String addGoods(GoodsForm goodsForm,LoginForm loginForm,Model m) {
		m.addAttribute("userName",loginForm.getUserName());
		m.addAttribute("password",loginForm.getPassword());
		
		Goods goods = new Goods();
		goods.setGoodsName(goodsForm.getGoodsName());
		goods.setPrice(goodsForm.getPrice());
		goodsRepos.saveAndFlush(goods);
		
		return "forward:/ecsite/admin/welcome";
	}
	
	//	Lesson5にて 作成	(商品削除)　　ajaxを利用（REST）
	@ResponseBody
	@PostMapping("/api/deleteGoods")
	public String deleteApi(@RequestBody GoodsForm f,Model m) {
		try{
			goodsRepos.deleteById(f.getId());
		}catch(IllegalArgumentException e) {
			return "-1";
		}
		return "1";
	}
}


