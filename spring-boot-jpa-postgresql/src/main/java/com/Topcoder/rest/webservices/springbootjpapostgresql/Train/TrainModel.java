package com.Topcoder.rest.webservices.springbootjpapostgresql.Train;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trains",schema="public")
public class TrainModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	//@Column(name="name")
	private String name;
	//@Column(name="description")
	private String description;
	//@Column(name="distance-between-stop")
	@Column(name = "\"distance-between-stop\"")
    //@JsonProperty("distance-between-stop")
	private String distance_between_stop;
	@Column(name="\"max-speed\"")
	private String max_speed;
	@Column(name="\"sharing-tracks\"")
	private Boolean sharing_tracks;
	@Column(name="\"grade-crossing\"")
	private Boolean grade_crossing;
	@Column(name="\"train-frequency\"")
	private String train_frequency;
	//@Column(name="amenities")
	private String amenities;
	
	public TrainModel() {
		
	}
	
	public TrainModel(Long id, String name, String description, String distance_between_stop, String max_speed,
			Boolean sharing_tracks, Boolean grade_crossing, String train_frequency, String amenities) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.distance_between_stop = distance_between_stop;
		this.max_speed = max_speed;
		this.sharing_tracks = sharing_tracks;
		this.grade_crossing = grade_crossing;
		this.train_frequency = train_frequency;
		this.amenities = amenities;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDistance_between_stop() {
		return distance_between_stop;
	}
	public void setDistance_between_stop(String distance_between_stop) {
		this.distance_between_stop = distance_between_stop;
	}
	public String getMax_speed() {
		return max_speed;
	}
	public void setMax_speed(String max_speed) {
		this.max_speed = max_speed;
	}
	public Boolean getSharing_tracks() {
		return sharing_tracks;
	}
	public void setSharing_tracks(Boolean sharing_tracks) {
		this.sharing_tracks = sharing_tracks;
	}
	public Boolean getGrade_crossing() {
		return grade_crossing;
	}
	public void setGrade_crossing(Boolean grade_crossing) {
		this.grade_crossing = grade_crossing;
	}
	public String getTrain_frequency() {
		return train_frequency;
	}
	public void setTrain_frequency(String train_frequency) {
		this.train_frequency = train_frequency;
	}
	public String getAmenities() {
		return amenities;
	}
	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	@Override
	public String toString() {
		return "TrainModel [id=" + id + ", name=" + name + ", description=" + description + ", distance_between_stop="
				+ distance_between_stop + ", max_speed=" + max_speed + ", sharing_tracks=" + sharing_tracks
				+ ", grade_crossing=" + grade_crossing + ", train_frequency=" + train_frequency + ", amenities="
				+ amenities + "]";
	}
	
	
	

}
