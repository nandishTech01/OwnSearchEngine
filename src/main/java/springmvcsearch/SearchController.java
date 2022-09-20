package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.function.RenderingResponse;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	
	@RequestMapping("/home")
	public String home(){
		
		System.out.println("this is home handler..");
		return "home";
		
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		String url ="https://www.google.com/search?q=" +query;
		//creating object
		RedirectView r = new RedirectView();
		r.setUrl(url);
		
		if(query.isEmpty()) {
			r.setUrl("home");
			return r;
		}
		return r;
	}
}
