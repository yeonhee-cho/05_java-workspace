package edu.practice.day8.model.ex4;

public class Discord implements Messenger {
    private String server;

    public Discord(String server) {
        this.server = server;
    }

    @Override
    public void sendMessage() {
        System.out.println( "💬 " + server + " 서버에 메시지를 보냅니다!");
    }

    @Override
    public void receiveMessage() {
        System.out.println("📱 " + server + " 서버에서 새 메시지가 도착했어요!");
    }

    @Override
    public void makeCall() {
        System.out.println("🎤 " + server + " 서버 음성채널에 접속!");
    }
}
