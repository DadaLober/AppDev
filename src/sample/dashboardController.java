package sample;

import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class dashboardController {

    @FXML
    private Button homeButton;
    @FXML
    private Button addProductButton;
    @FXML
    private Button viewProducts;
    @FXML
    private Label username;
    @FXML
    private Label homeTotalMonitored;
    @FXML
    private Label homeTotalGoods;
    @FXML
    private Label homeTotalElectronics;
    @FXML
    private BarChart homeTotalMonitoredChart;
    @FXML
    private AreaChart homeTotalGoodsChart;
    @FXML
    private LineChart homeTotalElectronicsChart;
}
