public record Book(String title, String author, int pages,
                   String isbn, String isbnAuthor, String isbnTitle)
{

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
