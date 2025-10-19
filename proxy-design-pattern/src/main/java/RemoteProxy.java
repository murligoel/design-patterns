interface IDataService {
    String fetchData();
}

class RealDataService implements IDataService {
    public RealDataService() {
        System.out.println("[RealDataService] Initialized (simulating remote setup)");
    }

    @Override
    public String fetchData() {
        return "[RealDataService] Data from server";
    }
}

class DataServiceProxy implements IDataService {
    private RealDataService realDataService;

    public DataServiceProxy() {
        this.realDataService = new RealDataService();
    }

    @Override
    public String fetchData() {
        System.out.println("[DataServiceProxy] Connecting to remote service...");
        return realDataService.fetchData();
    }
}

public class RemoteProxy {
    public static void main(String[] args) {
        IDataService dataService = new DataServiceProxy();
        dataService.fetchData();
    }
}
