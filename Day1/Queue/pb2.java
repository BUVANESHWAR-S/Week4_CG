package Day1.Queue;

public class pb2 {

    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {
        int totalPetrol = 0;
        int totalDistance = 0;
        int start = 0;
        int balance = 0;

        for (int i = 0; i < pumps.length; i++) {
            totalPetrol += pumps[i].petrol;
            totalDistance += pumps[i].distance;
            balance += pumps[i].petrol - pumps[i].distance;

            if (balance < 0) {
                start = i + 1;
                balance = 0;
            }
        }

        return (totalPetrol >= totalDistance) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };

        int startIndex = findStartingPoint(pumps);
        System.out.println(startIndex);
    }
}
