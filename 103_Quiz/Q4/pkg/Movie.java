package pkg;

public class Movie {
    String movieName;
    double rating;
    int numRatings;
    int revenue;

    public Movie() {
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }

    public Movie(String name, double rate , int num , int money) {
        movieName = name;
        rating = rate;
        numRatings = num;
        revenue = money;
    }

    public void movieToString() {
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println("");
    }

    public String getMovieName() {
        return movieName;
    }

    public int getRevenue() {
        return revenue;
    }

    public double addRating(double rate) {
        rating = ((rating * numRatings) + rate)/(numRatings + 1);
        return rating;
    }
    
    public double getRating() {
        return rating;
    }

    public boolean compareRatings(Movie a) { 
    return this.rating > a.getRating();
    }

}