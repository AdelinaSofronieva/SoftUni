package F08ObjectsAndClasses.Exercise.P02Articles;

public class Articles {
    String tittle;
    String content;
    String author;

    public Articles(String tittle, String content, String author) {
        this.tittle = tittle;
        this.content = content;
        this.author = author;
    }

    public String getTittle() {
        return this.tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
//"{title} - {content}:{author}"
        return getTittle() + " - " + getContent() + ": " + getAuthor();
    }
}
