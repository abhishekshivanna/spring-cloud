package ratings_service.domain;

import org.springframework.data.annotation.Id;


public class Rating {

	@Id
	private String id;
    private String userId;
    private String movieId;
    private int rating;

    public Rating() {}

    public Rating(String id, String mid, String uid, int rating) {
    	this.id = id;
        this.movieId = mid;
        this.userId = uid;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("MovieID: %s -- Rating: %d by User %s", this.movieId, this.rating, this.userId);
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUid() {
		return userId;
	}

	public void setUid(String uid) {
		this.userId = uid;
	}

	public String getMid() {
		return movieId;
	}

	public void setMid(String mid) {
		this.movieId = mid;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
