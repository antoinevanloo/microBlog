package blog;

import blog.dao.ArticleDao;
import blog.modele.Article;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/blog")
public class BlogControleurServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog");
        try {
            EntityManager em = emf.createEntityManager();
            try {
                ArticleDao articleDao = new ArticleDao(em);
                em.getTransaction().begin();
                List<Article>  articles = articleDao.get();
                em.getTransaction().commit();

                req.setAttribute("articles", articles);
            } finally {
                em.close();
            }
        } finally {
            emf.close();
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/blog.jsp");
        rd.forward(req, resp);
    }

}
