public class Run extends Thread {
    private String name;

    public Run( String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("--------:"+name);
        try {
            sleep(1000 * 3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
