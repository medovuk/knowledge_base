package ru.akhitev.kb.java6.multithreading.daemon;

class RunnableForDaemon implements Runnable {
    @Override
    public void run() {
        System.out.println("daemon is working");
    }
}
