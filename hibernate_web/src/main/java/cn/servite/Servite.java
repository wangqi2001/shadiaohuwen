package cn.servite;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.dao.imp.Gooddaoimp;
import cn.entity.Good;


@Controller
public class Servite {
	@Autowired
private Gooddaoimp gooddaoimp;

	@RequestMapping("/good/chasuoyou.action")
	public List<Good> Chasuoyou(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<Good> list=gooddaoimp.fli();
		request.setAttribute("li",list);
		request.getRequestDispatcher("/Zhuye.jsp").forward(request, response);
		return null;
	}
	@RequestMapping("/good/xiugai_cha.action")
	public List<Good> xiugai_cha(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Good> list=gooddaoimp.flii(Integer.parseInt(request.getParameter("mid")));
	request.setAttribute("li",list);
	request.getRequestDispatcher("/Xiugai.jsp").forward(request, response);
		return null;
	}
	@RequestMapping("/good/xiugai_gai.action")
	public void xiugai_gai(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Good good=new Good();
		good.setMid(Integer.parseInt(request.getParameter("mid")));
		good.setNamee(request.getParameter("shuming"));
		good.setAuthore(request.getParameter("zuozhe"));
		good.setTypee(Integer.parseInt(request.getParameter("leixing")));
		try {
			gooddaoimp.update(good);
			response.getWriter().print("<script type='text/javascript'> alert('修改成功');location.href='/hibernate_web/good/chasuoyou.action';</script>");
		} catch (Exception e) {
			response.getWriter().print("<script type='text/javascript'> alert('修改失败');location.go(-1);</script>");
		}
	}
	@RequestMapping("/good/sanchu.action")
	public void sanchu(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Good good=new Good();
		good.setMid(Integer.parseInt(request.getParameter("mid")));
		try {
			gooddaoimp.delete(good);
			response.getWriter().print("<script type='text/javascript'> alert('修改成功');location.href='/hibernate_web/good/chasuoyou.action';</script>");
		} catch (Exception e) {
			response.getWriter().print("<script type='text/javascript'> alert('修改失败');location.go(-1);</script>");
		}
		
	}
	
}
