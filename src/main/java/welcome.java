import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class welcome implements Filter {
    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        int key = usersCollection.key;
        String permutate = usersCollection.permutate;
        String passCiphertext = caesarCipherPermutation.encrypt(password, key, permutate);
        String passHashtext = sha256.sha(passCiphertext);
        int flag = 0;
        for (int i = 0; i < usersCollection.usersSaved().length; i++) {
            if (name.equals(usersCollection.usersSaved()[i].getName()) && passHashtext.equals(usersCollection.usersSaved()[i].getPassword())) {
                flag++;
                if (usersCollection.usersSaved()[i].getRole() == "user") {
                    out.print("Welcome to your user account!");
                    RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
                }
                if (usersCollection.usersSaved()[i].getRole() == "admin") {
                    out.print("Welcome to your admin account!");
                    RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
                }
            }
        }
        if (flag == 0) {
            out.print("Username or password error!");
            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
        }
    }
    @Override
    public void destroy() {

    }
}