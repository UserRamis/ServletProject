import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/TestResultServlet")
public class TestResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получаем ответы пользователя из параметров запроса
        String answer1 = request.getParameter("question1");
        String answer2 = request.getParameter("question2");
        String answer3 = request.getParameter("question3");
        String answer4 = request.getParameter("question4");
        String answer5 = request.getParameter("question5");


        // Правильные ответы
        String correctAnswer1 = "block";
        String correctAnswer2 = "2";
        String correctAnswer3 = "+";
        String correctAnswer4 = "Object";
        String correctAnswer5 = "Get";

        // Проверяем ответы и вычисляем результат
        boolean isCorrect1 = correctAnswer1.equals(answer1);
        boolean isCorrect2 = correctAnswer2.equals(answer2);
        boolean isCorrect3 = correctAnswer3.equals(answer3);
        boolean isCorrect4 = correctAnswer4.equals(answer4);
        boolean isCorrect5 = correctAnswer5.equals(answer5);

        int score = 0;
        if (isCorrect1) {
            score++;
        }
        if (isCorrect2) {
            score++;
        }
        if (isCorrect3) {
            score++;
        }
        if (isCorrect4) {
            score++;
        }
        if (isCorrect5) {
            score++;
        }

        // Отображаем результат на странице
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<html><head><title>Результат теста</title></head><body>");
        response.getWriter().println("<h1>Результат теста</h1>");
        response.getWriter().println("<p>1. Как называется код между фигурными скобками? " + (isCorrect1 ? "Правильно" : "Неправильно") + "</p>");
        response.getWriter().println("<p>2. Каково значение arr[1].length в следующем массиве? " + (isCorrect2 ? "Правильно" : "Неправильно") + "</p>");
        response.getWriter().println("<p>3. Какие из этих операторов можно использовать для объединения двух или более объектов String? " + (isCorrect3 ? "Правильно" : "Неправильно") + "</p>");
        response.getWriter().println("<p>4. От какого класса наследуют все классы Java? " + (isCorrect4 ? "Правильно" : "Неправильно") + "</p>");
        response.getWriter().println("<p>5. Какой класс отвечает за получение информации от пользователя? " + (isCorrect5 ? "Правильно" : "Неправильно") + "</p>");
        response.getWriter().println("<p>Ваш результат: " + score + "/5</p>");
        response.getWriter().println("</body></html>");
    }
}
