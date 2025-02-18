package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movie1;
        movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "인생은 무한 루프";

        MovieReview movie2;
        movie2 = new MovieReview();
        movie2.title = "어바웃 타임";
        movie2.review = "인생 시간 영화!";

        MovieReview[] movies = new MovieReview[2];
        movies[0] = movie1;
        movies[1] = movie2;

        for (MovieReview m : movies) {
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }
    }
}
