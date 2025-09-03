package edu.practice.day8.model.ex4;

public class KakaoTalk implements Messenger {
    private String friend;

    public KakaoTalk(String friend) {
        this.friend = friend;
    }

    @Override
    public void sendMessage() {
        System.out.println("💬 " + friend + "님에게 카톡을 보냅니다! 노란색 말풍선~");
    }

    @Override
    public void receiveMessage() {
        System.out.println("📱 " + friend + "님으로부터 카톡이 왔어요! 톡톡~");
    }

    @Override
    public void makeCall() {
        System.out.println("📞 " + friend + "님과 카톡 보이스톡 연결!");
    }
}