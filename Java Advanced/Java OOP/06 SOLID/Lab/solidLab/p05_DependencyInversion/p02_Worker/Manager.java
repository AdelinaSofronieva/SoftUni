package J06SOLID.Lab.solidLab.p05_DependencyInversion.p02_Worker;

public class Manager {

    public Manager() {
        Worker worker = new Worker();
        worker.work();
    }
}
