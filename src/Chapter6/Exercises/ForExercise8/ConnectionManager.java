package Chapter6.Exercises.ForExercise8;

class Connection {
    private Connection() {}
    static Connection makeConnection() {
        return new Connection();
    }
}

public class ConnectionManager {
    static Connection[] connections = new Connection[10];

    static void makeConnections() {
        for (int i = 0; i < connections.length; i++) {
            connections[i] = Connection.makeConnection();
        }
    }

    public static Connection getConnection(int i) {
        makeConnections();
        if (i >= 10 || i < 0) {
            return null;
        }
        return connections[i];
    }
}