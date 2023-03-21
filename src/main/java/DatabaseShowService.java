import java.io.IOException;
import java.sql.SQLException;

public class DatabaseShowService {
    public static void main(String[] args) throws SQLException, IOException {
        System.out.println("maxProjectCountClients = " + DatabaseQueryService.findMaxProjectsClient());
        System.out.println("longestProjects = " + DatabaseQueryService.findLongestProject());
        System.out.println("maxSalaryWorkers = " + DatabaseQueryService.findMaxSalaryWorker());
        System.out.println("youngestOldestWorkers = " + DatabaseQueryService.findYoungestOldestWorkers());
        System.out.println("printProjectPrices = " + DatabaseQueryService.printProjectPrices());
    }
}
