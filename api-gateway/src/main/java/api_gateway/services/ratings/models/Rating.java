package api_gateway.services.ratings.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rating {

    private String userId;
    private String movieId;
    private int rating;

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
