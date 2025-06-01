package singleton;


//Synchronized keyword
class DBConnectionSyn {
    private static DBConnectionSyn instance = null;

    private DBConnectionSyn() {}

    public static DBConnectionSyn getInstance() {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if(instance == null) {
                    instance = new DBConnectionSyn();
                }
            }
        }
        return instance;
    }
}


//Bill pugh method
//How It Works Internally
//1. JVM loads DbConnection class → But it does not load the Holder class yet.

//2. First call to getDBConnection() → JVM loads and initializes DBConnectionHolder at this point.

//3. DBConnection.con is created once → Because it's static final, JVM ensures it's initialized only once.

//Subsequent calls → Just return the same instance without reloading.

//As in general, static fields are initialized only once, hence inner class also initialized once

//Class Loading in Java is Thread-Safe
//In Java, class loading is done by the JVM in a thread-safe manner.
//A class is loaded and initialized only once, even in multi-

class DBConnection {
    private DBConnection() {}

    private static class DBConnectionHolder {
        private static final DBConnection con = new DBConnection();
    }

    public static DBConnection getDBConnection() {
        return DBConnectionHolder.con;
    }
}

class Test {
    public static void main(String[] args) {
        DBConnection c1 = DBConnection.getDBConnection();
        DBConnection c2 = DBConnection.getDBConnection();
        System.out.println(c1 == c2);
    }
}


class Demo {
    private Demo() {}

    private static class DemoHolder {
        private static final Demo demo= new Demo();
    }

    public static Demo getInstance() {
        return DemoHolder.demo;
    }
}