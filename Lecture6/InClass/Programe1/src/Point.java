class Point
{
	private float x;
	private float y;

	Point()
	{
		this.x=0;
		this.y=0;
	}

	Point (float x,float y)
	{
		this.x=x;
		this.y=y;
	}

	void setValueX(float x)
	{
		this.x=x;
	}
	void setValueY(float y)
	{
		this.y=y;
	}
	float getValueX()
	{
		return x;
	}

	float getValueY()
	{
		return y;
	}

	float calcDistance(Point p2)
	{
		float dist = (float) Math.sqrt(Math.pow((getValueX()-p2.getValueX()),2)+Math.pow((getValueY()+p2.getValueY()),2));
		return dist;
	}
}