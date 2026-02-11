public class MediaLib
{
    public static String owner = "PLTW";

    private static int numEntries;
    private static int numBooks;
    private static int numMovies;
    private static int numSongs;

    private Book book;
    private Movie movie;
    private Song song;

    public void addBook(Book b)
    {
        if (book == null)
        {
            book = b;
            numEntries++;
            numBooks++;
        }
    }

    public void addMovie(Movie m)
    {
        if (movie == null)
        {
            movie = m;
            numEntries++;
            numMovies++;
        }
    }

    public void addSong(Song s)
    {
        if (song == null)
        {
            song = s;
            numEntries++;
            numSongs++;
        }
    }

    public static int getNumEntries()
    {
        return numEntries;
    }

    public static int getNumBooks()
    {
        return numBooks;
    }

    public static int getNumMovies()
    {
        return numMovies;
    }

    public static int getNumSongs()
    {
        return numSongs;
    }

    public static String getOwner()
    {
        return owner;
    }

    public static void changeOwner(String o)
    {
        owner = o;
    }

    public String toString()
    {
        String info = "";

        if (book != null)
            info += "Book: " + book + "\n";
        if (movie != null)
            info += "Movie: " + movie + "\n";
        if (song != null)
            info += "Song: " + song + "\n";

        return info;
    }
}
