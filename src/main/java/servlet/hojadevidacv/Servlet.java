package servlet.hojadevidacv;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/holaServlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        // Creo la plantilla HTML
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Hoja de Vida de Luis Pilaguano</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 20px; }");
        out.println("h1 { color: #4CAF50; }");
        out.println("p { font-size: 18px; }");
        out.println(".section { margin-bottom: 20px; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>Hoja de Vida - Luis Pilaguano</h1>");
        out.println("<p><strong>Nombre:</strong> Luis Pilaguano</p>");
        out.println("<p><strong>Edad:</strong> 26 años</p>");
        out.println("<p><strong>Estudios:</strong> Estudiante de nivel Técnico en el Instituto Tecnológico Quito</p>");
        out.println("<p><strong>Especialidad:</strong> Programación</p>");
        out.println("<p><strong>Pasiones:</strong> Me encanta la programación y la tecnología.</p>");

        //  educación
        out.println("<div class=\"section\">");
        out.println("<h2>Educación</h2>");
        out.println("<p><strong>Institución:</strong> Instituto Tecnológico Quito</p>");
        out.println("<p><strong>Grado:</strong> Tercer Nivel (Técnico)</p>");
        out.println("<p><strong>Área de Estudio:</strong> Desarrollo de Software y Programación</p>");
        out.println("</div>");

        // habilidades
        out.println("<div class=\"section\">");
        out.println("<h2>Habilidades</h2>");
        out.println("<ul>");
        out.println("<li>Programación en Java</li>");
        out.println("<li>Desarrollo web (HTML, CSS, JavaScript)</li>");
        out.println("<li>Uso de bases de datos (MySQL, MongoDB)</li>");
        out.println("<li>Resolución de problemas lógicos</li>");
        out.println("</ul>");
        out.println("</div>");

        // experiencia
        out.println("<div class=\"section\">");
        out.println("<h2>Experiencia</h2>");
        out.println("<p>Aún no tengo experiencia profesional, pero me encuentro en proceso de formación y desarrollo de proyectos de programación como parte de mi formación académica.</p>");
        out.println("</div>");

        // pasatiempos
        out.println("<div class=\"section\">");
        out.println("<h2>Pasatiempos</h2>");
        out.println("<p>Me encanta resolver problemas lógicos y desarrollar software. Además, disfruto de la lectura sobre nuevas tecnologías y programación.</p>");
        out.println("</div>");

        // Final
        out.println("</body>");
        out.println("</html>");
    }
}
