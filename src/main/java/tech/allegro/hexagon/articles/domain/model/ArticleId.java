package tech.allegro.hexagon.articles.domain.model;

public class ArticleId {
    private final String value;

    private ArticleId(final String value) {
        this.value = value;
    }

    public static ArticleId of(final String articleId) {
        return new ArticleId(articleId);
    }

    public String value() {
        return value;
    }
}
