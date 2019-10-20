package ru.akhitev.kb.java6.multithreading.wait_notify.raid;

class TacticForBossWithWaitNotify implements TacticForBoss {
    private boolean oathBreakersShameActive = false;

    public synchronized void startOathBreakersShame() {
        oathBreakersShameActive = true;
        notifyAll();
    }

    public synchronized void oathBreakersShameEnded() {
        oathBreakersShameActive = false;
        notifyAll();
    }

    public synchronized void waitForOathBreakersShame() throws InterruptedException {
        while (!oathBreakersShameActive) {
            wait();
        }
    }

    public synchronized void fullDamage() throws InterruptedException {
        while (oathBreakersShameActive) {
            wait();
        }
    }
}
