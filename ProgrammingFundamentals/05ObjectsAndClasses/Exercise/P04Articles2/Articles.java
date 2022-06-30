package F08ObjectsAndClasses.Exercise.P04Articles2;

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

    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }

    public String toString() {
//"{title} - {content}:{author}"
        return String.format(this.tittle+ " - " + this.content + ": " + this.author);
    }
}
