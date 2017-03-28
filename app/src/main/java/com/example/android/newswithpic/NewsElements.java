package com.example.android.newswithpic;

/**
 * Created by Pratik saxsena on 26-03-2017.
 */

public class NewsElements {

    private String headlines;
    private String image;

    public NewsElements(String headlines, String image)
    {
        this.headlines = headlines;
        this.image = image;
    }

    public String getImage()
    {
        if(image.isEmpty())
            return "https://us.123rf.com/450wm/uasumy/uasumy1504/uasumy150400022/38624301-green-letter-g-and-leaf-eco-technology-logo-mockup-ecology-poster.jpg?ver=6";
        else
            return image;
    }

    public String getHeadlines()
    {
        return headlines;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public void setHeadlines(String headlines)
    {
        this.headlines = headlines;
    }
}
