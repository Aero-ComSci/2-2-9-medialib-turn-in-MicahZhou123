public class Movie
{
    private String title;
    private double duration;
    private int rating;

    public Movie(String t, double d)
    {
        title = t;
        duration = d;
        rating = 0;
    }

    public String getTitle()
    {
        return title;
    }

    public double getDuration()
    {
        return duration;
    }

    public int getRating()
    {
        return rating;
    }

    public void setTitle(String t)
    {
        title = t;
    }

    public void setDuration(double d)
    {
        duration = d;
    }

    public void adjustRating(int change)
    {
        int newRating = rating + change;
        if (newRating >= 0 && newRating <= 10)
        {
            rating = newRating;
        }
    }

    public boolean equals(Movie m)
    {
        if (m == null) return false;
        return title.equals(m.title) && Double.compare(duration, m.duration) == 0;
    }

    public String toString()
    {
        String info = "\"" + title + "\", duration " + duration + " hours";
        if (rating != 0)
        {
            info += ", rating is " + rating;
        }
        return info;
    }
}
