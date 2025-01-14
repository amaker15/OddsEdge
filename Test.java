import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SportsBettingApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sports Betting App");

        Label welcomeLabel = new Label("Welcome to Sports Betting App");
        welcomeLabel.setStyle("-fx-font-size: 24px; -fx-padding: 20px;");

        Button liveOddsButton = new Button("View Live Odds");
        liveOddsButton.setStyle("-fx-font-size: 16px; -fx-background-color: blue; -fx-text-fill: white;");
        liveOddsButton.setOnAction(e -> showLiveOddsView());

        Button bettingHistoryButton = new Button("View Betting History");
        bettingHistoryButton.setStyle("-fx-font-size: 16px; -fx-background-color: green; -fx-text-fill: white;");
        bettingHistoryButton.setOnAction(e -> showBettingHistoryView());

        Button notificationsButton = new Button("Manage Notifications");
        notificationsButton.setStyle("-fx-font-size: 16px; -fx-background-color: orange; -fx-text-fill: white;");
        notificationsButton.setOnAction(e -> showNotificationsView());

        VBox layout = new VBox(15, welcomeLabel, liveOddsButton, bettingHistoryButton, notificationsButton);
        layout.setStyle("-fx-alignment: center; -fx-padding: 20px;");

        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showLiveOddsView() {
        Stage stage = new Stage();
        stage.setTitle("Live Odds");

        Label label = new Label("Live Odds");
        label.setStyle("-fx-font-size: 20px; -fx-padding: 10px;");

        ListView<String> oddsList = new ListView<>();
        oddsList.getItems().addAll(
            "NFL: Team A vs. Team B - Odds: +110/-120",
            "NBA: Team C vs. Team D - Odds: -105/-115",
            "MLB: Team E vs. Team F - Odds: +150/-130"
        );

        VBox layout = new VBox(10, label, oddsList);
        layout.setStyle("-fx-padding: 20px;");

        Scene scene = new Scene(layout, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    private void showBettingHistoryView() {
        Stage stage = new Stage();
        stage.setTitle("Betting History");

        Label label = new Label("Betting History");
        label.setStyle("-fx-font-size: 20px; -fx-padding: 10px;");

        ListView<String> historyList = new ListView<>();
        historyList.getItems().addAll(
            "2025-01-12: NFL - Team A win - Bet: $50 - Won: $55",
            "2025-01-11: NBA - Team D lose - Bet: $30 - Lost: $30",
            "2025-01-10: NHL - Team G win - Bet: $20 - Won: $38"
        );

        VBox layout = new VBox(10, label, historyList);
        layout.setStyle("-fx-padding: 20px;");

        Scene scene = new Scene(layout, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    private void showNotificationsView() {
        Stage stage = new Stage();
        stage.setTitle("Manage Notifications");

        Label label = new Label("Manage Notifications");
        label.setStyle("-fx-font-size: 20px; -fx-padding: 10px;");

        CheckBox notificationsCheckBox = new CheckBox("Enable Notifications");
        notificationsCheckBox.setSelected(true);

        Label statusLabel = new Label("You will receive real-time updates on line movements and game results.");

        notificationsCheckBox.setOnAction(e -> {
            if (notificationsCheckBox.isSelected()) {
                statusLabel.setText("You will receive real-time updates on line movements and game results.");
            } else {
                statusLabel.setText("Notifications are turned off.");
            }
        });

        VBox layout = new VBox(10, label, notificationsCheckBox, statusLabel);
        layout.setStyle("-fx-padding: 20px;");

        Scene scene = new Scene(layout, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
