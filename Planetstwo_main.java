
package Planet;

/**
 * Prints facts about planets - practice using Collections methods
 */
public class PlanetsMain {

    public static void main(String[] args) {

        // Source https://nssdc.gsfc.nasa.gov/planetary/factsheet/
        List<Planet> planets = new ArrayList<>(9);
        planets.add(new Planet("Mercury", 0.33, 58));
        planets.add(new Planet("Venus", 4.87, 108));
        planets.add(new Planet("Earth", 5.97, 150));
        planets.add(new Planet("Mars", .642, 228));
        planets.add(new Planet("Jupiter", 1898, 779));
        planets.add(new Planet("Saturn", 568, 1434));
        planets.add(new Planet("Uranus", 86.8, 2873));
        planets.add(new Planet("Neptune", 102, 4495));
        planets.add(new Planet("Pluto", 0.0146, 5906));

        System.out.println("Orignal order:");
        printPlanets(planets);

        Collections.reverse(planets);
        // TODO

        System.out.println("Planets in a random order:");
        printPlanets(planets);

        planets.remove("Pluto")
        // TODO

        System.out.println("Removed Pluto:");
        printPlanets(planets);

        // Sort by distance from sun using Natural Ordering (Hint: Implement Planet.compareTo)
        Collections.sort(planets.getDistance);

        System.out.println("Sorted by distance from sun:");
        printPlanets(planets);

        // Sort alphabetically (Hint: you need a Comparator class)
        Collections.sort(planets)

        System.out.println("Sorted alphabetically:");
        printPlanets(planets);

        Collections.sort(planets.getMass);
        // TODO

        System.out.println("Sorted by mass:");
        printPlanets(planets);

        // Add each planet in your list to a Map (name => Planet)
        Map<String, Planet> planetMap = new HashMap<>();
        // Hint - use an enhanced for loop
        for(Planet temp: planets) {
            planetMap.put(temp.getName(), temp);
        }
        // TODO

        System.out.println("Earth:" + planetMap.get("Earth"));
        System.out.println("Mars:" + planetMap.get("Mars"));
        // Retrieve and print Mars
        // TODO

    }

    /**
     * Print the planet list in a table
     */
    private static void printPlanets(List<Planet> planets) {

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s%-15s%-10s%n%n", "Planet", "Mass", "Distance");

        for (Planet planet : planets) {
            System.out.printf("%-10s%-15.3f%-10d%n", planet.getName(),
                    planet.getMass(), planet.getDistance());
        }

        System.out.println("------------------------------------------------------------\n\n");
    }

}
