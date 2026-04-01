class Download implements Runnable {
    public void run() {
        System.out.println("Downloading file...");
    }
}

class DownloadManager {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Download());
        Thread t2 = new Thread(new Download());

        t1.start();
        t2.start();
    }
}