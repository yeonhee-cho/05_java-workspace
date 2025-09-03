package edu.practice.day8.model.ex2;

public class Twitter implements SocialMedia {
    private String tweet;

    public Twitter(String tweet) {
        this.tweet = tweet;
    }

    @Override
    public void post() {
        System.out.println("🐦 트위터에 트윗합니다: " + tweet);
    }

    @Override
    public void like() {
        System.out.println("❤️ 트윗에 좋아요를 눌렀습니다!");
    }

    @Override
    public void share() {
        System.out.println("🔄 리트윗했습니다!");
    }
}