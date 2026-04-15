class UseCase14TrainConsistMgmt {
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }
    static class PassengerBogie {
        String type;
        int capacity;
        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }
    }
    public static void main(String[] args) {
        try {
            PassengerBogie bogie = new PassengerBogie("Sleeper", -10);
            System.out.println("Bogie created: " + bogie.type + " - " + bogie.capacity);
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}
