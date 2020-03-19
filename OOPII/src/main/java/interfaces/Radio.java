package interfaces;

public interface Radio {
    void playChannel(); //metode abstracta

    void stopChannel();

    default public void next(){
        System.out.println("Playinng next channel");
    }
}
