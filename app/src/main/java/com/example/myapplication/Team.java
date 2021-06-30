package com.example.myapplication;

public class Team {
    int imgTeam;
    String heroName,heroTeam;

    public Team(int imgTeam,String heroName,String heroTeam)
    {
        this.imgTeam = imgTeam;
        this.heroName = heroName;
        this.heroTeam = heroTeam;
    }

    public Team(String hero, String team) {
    }

    public int getImgTeam() {
        return imgTeam;
    }

    public void setImgTeam(int imgTeam) {
        this.imgTeam = imgTeam;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroTeam() {
        return heroTeam;
    }

    public void setHeroTeam(String heroTeam) {
        this.heroTeam = heroTeam;
    }


}
