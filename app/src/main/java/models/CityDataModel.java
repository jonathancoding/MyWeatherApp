package models;

/**
 * Created by jianyang on 4/4/15.
 */
public class CityDataModel
{
	private String name;
	private String lat;
	private String lng;

	public CityDataModel(String name, String lat, String lng)
	{
		this.name = name;
		this.lat = lat;
		this.lng = lng;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getLng()
	{
		return lng;
	}

	public void setLng(String lng)
	{
		this.lng = lng;
	}

	public String getLat()
	{
		return lat;
	}

	public void setLat(String lat)
	{
		this.lat = lat;
	}
}
