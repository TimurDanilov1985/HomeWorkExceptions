package seminar3.src.application;

public class View {
    private String message;
    public void setMessage(String message) {
        this.message = message;
    }

    public void print() {
        for (int i = 0; i < message.length(); i++) {
            try {
                Thread.sleep(20);
                System.out.print(message.charAt(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
