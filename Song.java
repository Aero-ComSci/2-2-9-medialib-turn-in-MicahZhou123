public class Song
{
    private String title;

    public Song(String t)
    {
        title = t;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String t)
    {
        title = t;
    }

    public boolean equals(Song s)
    {
        if (s == null) return false;
        return title.equals(s.title);
    }

    public String toString()
    {
        return "\"" + title + "\"";
    }
}
