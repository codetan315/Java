package legacy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/lunch/list")
public class LunchListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Path path = Paths.get("C:\\study\\lunch.txt");
		List<String> menuList = Files.readAllLines(path);

//		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//			ArrayList<String> menuList = new ArrayList<>();
//			String line = br.readLine();
//			while (line != null) {
//				menuList.add(line);
//				line = br.readLine();
//			}
//
//			resp.setContentType("text/html;charset=UTF-8");
//			PrintWriter out = resp.getWriter();
//			out.println("<html>");
//			out.println("<head><title>List</title></head>");
//			out.println("<body>");
//			out.println("<ul>");
//			for (String menu : menuList) {
//				out.println("<li>" + menu + "</li>");
//			}
//			out.println("</ul>");
//			out.println("</body>");
//			out.println("</html>");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		List<String> menuList = new ArrayList<>();
//		menuList.add("APPLE");
//		menuList.add("BANANA");
//		menuList.add("CHERRY");
		
		req.setAttribute("menuList", menuList);
		
		RequestDispatcher rd = req.getRequestDispatcher("/lunch_list.jsp");
		rd.forward(req, resp);

	}

}
