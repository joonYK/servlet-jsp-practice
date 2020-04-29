package ch4;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CodeReturn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/jar");
        resp.setHeader("Content-Disposition", "attachment; filename=test.jar;");

        ServletContext ctx = getServletContext();
        InputStream is = ctx.getResourceAsStream("/test.jar");

        int read;
        byte[] bytes = new byte[1024];

        OutputStream os = resp.getOutputStream();
        while ((read = is.read(bytes)) != -1) {
            os.write(bytes, 0, read);
        }
        os.flush();
        os.close();
    }
}
