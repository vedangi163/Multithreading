package singleton;


//Synchronized keyword
//public class DBConnection {
//    private DBConnection instance = null;
//
//    private DBConnection() {}
//
//    public synchronized static DBConnection getInstance() {
//        if(instance == null) {
//            return new DBConnection();
//        }
//        return instance;
//    }
//}


//Bill pugh method
//How It Works Internally
//1. JVM loads DbConnection class → But it does not load the Holder class yet.

//2. First call to getDBConnection() → JVM loads and initializes DBConnectionHolder at this point.

//3. DBConnection.con is created once → Because it's static final, JVM ensures it's initialized only once.

//Subsequent calls → Just return the same instance without reloading.

//As in general, static fields are initialized only once, hence inner class also initialized once

class DBConnection {
    private DBConnection() {}

    private static class DBConnectionHolder {
        private static final DBConnection con = new DBConnection();
    }

    public DBConnection getDBConnection() {
        return DBConnectionHolder.con;
    }
}

