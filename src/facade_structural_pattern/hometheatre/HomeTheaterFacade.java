/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_structural_pattern.hometheatre;

/**
 *
 * @author fa21-bse-011
 */
class HomeTheaterFacade {
    private Projector projector;
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Lights lights;

    public HomeTheaterFacade(Projector projector, Amplifier amplifier, DVDPlayer dvdPlayer, Lights lights) {
        this.projector = projector;
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the movie theater...");
        projector.off();
        amplifier.off();
        dvdPlayer.off();
    }
}

