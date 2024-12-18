/*
 * This source file was generated by the Gradle 'init' task
 */
package org.yourcompany.yourproject;

public class Buch {
    // Attributes
    private String title;
    private String author;
    private int year;
    private String genre;

    // Constructor
    public Buch(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter and Setter for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    @Override
    public String toString() {
    return "Buch{" +
           "Title='" + title + '\'' +
           ", Author='" + author + '\'' +
           ", Year=" + year +
           ", Genre='" + genre + '\'' +
           '}';
    }

}
  

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
