package org.designpatterns.behavioral.medaiter.manager;

public class PlayMediator {

    private final Plane plane;
    private final PlanesInFlight planesInFlight;
    private final PlanesOnGround planesOnGround;
    private final Runway runway;

    public PlayMediator() {
        plane = new Plane(123);
        planesInFlight = new PlanesInFlight();
        planesOnGround = new PlanesOnGround();
        runway = new Runway();
    }

    public void takeOff() {
        if (!plane.getIsInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane " + plane.getId() + " is taking off...");
            planesOnGround.removePlane(plane);
            planesInFlight.addPlane(plane);
            plane.setIsInTheAir(true);
            runway.setIsAvailable(false);
        }
    }
}
