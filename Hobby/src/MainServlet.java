

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/** 文字化け防止 **/
		request.setCharacterEncoding("utf-8");

		/** 変換 **/
		String strKen = request.getParameter("ken");
		String strGen = request.getParameter("gen");
		String strDem = request.getParameter("dem");
		String strKai = request.getParameter("kai");
		String strSake = request.getParameter("sake");
		String strJin = request.getParameter("jin");

		/** 未入力、空文字チェック **/
		if(null == strKen||strKen.equals("")) {
			System.out.println("未入力です。再度入力し直してください");
		}

		if(null == strGen||strGen.equals("")) {
			System.out.println("未入力です。再度入力し直してください");
		}

		if(null == strDem||strDem.equals("")) {
			System.out.println("未入力です。再度入力し直してください");
		}

		if(null == strKai||strKai.equals("")) {
			System.out.println("未入力です。再度入力し直してください");
		}

		if(null == strSake||strSake.equals("")) {
			System.out.println("未入力です。再度入力し直してください");
		}

		if(null == strJin||strJin.equals("")) {
			System.out.println("未入力です。再度入力し直してください");
		}

		int ken, gen, dem, kai, sake, jin;
		/** 未入力、空文字チェック2 **/
		try {
			ken = Integer.parseInt(strKen);
			gen = Integer.parseInt(strGen);
			dem = Integer.parseInt(strDem);
			kai = Integer.parseInt(strKai);
			sake = Integer.parseInt(strSake);
			jin = Integer.parseInt(strJin);
		}catch(NumberFormatException e){
			System.out.println("数値が間違っています。再度入力してください。");
			return;
		}

		/** 出力準備 **/

		//JSPに渡すための値

		request.setAttribute("KEN", ken);
		request.setAttribute("GEN", gen);
		request.setAttribute("DEM", dem);
		request.setAttribute("KAI", kai);
		request.setAttribute("SAKE", sake);
		request.setAttribute("JIN", jin);

		//フォワード
		String strJPSName = "/Main.jsp";

		RequestDispatcher rd = request.getRequestDispatcher(strJPSName);

		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
