package pw.artwhite;

/**
 * Created by artwhite on 20/01/2018.
 */
public class Project {
    private int projects[] = new int[1 + (int) (Math.random()*10)];
    private int timeOnProjects;
    private int maxProfit;

    public Project(int[] projects, int timeOnProjects) {
        this.projects = projects;
        this.timeOnProjects = timeOnProjects;
        this.maxProfit = maxProfit;
    }

    private void writeInArr(){
        for (int i = 0; i < this.projects.length; i++){
            this.projects[i] = 1 + (int) (Math.random()*20);
        }
    }


}
