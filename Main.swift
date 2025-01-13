// iOS Sports Betting App
// Main starting point for building the application in Swift using SwiftUI framework.

import SwiftUI

@main
struct SportsBettingApp: App {
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}

// MARK: - Content View
struct ContentView: View {
    var body: some View {
        NavigationView {
            VStack {
                Text("Welcome to Sports Betting App")
                    .font(.largeTitle)
                    .padding()

                NavigationLink(destination: LiveOddsView()) {
                    Text("View Live Odds")
                        .font(.headline)
                        .foregroundColor(.white)
                        .padding()
                        .background(Color.blue)
                        .cornerRadius(10)
                }
                .padding()

                NavigationLink(destination: BettingHistoryView()) {
                    Text("View Betting History")
                        .font(.headline)
                        .foregroundColor(.white)
                        .padding()
                        .background(Color.green)
                        .cornerRadius(10)
                }

                NavigationLink(destination: NotificationsView()) {
                    Text("Manage Notifications")
                        .font(.headline)
                        .foregroundColor(.white)
                        .padding()
                        .background(Color.orange)
                        .cornerRadius(10)
                }
            }
            .navigationTitle("Sports Betting")
        }
    }
}

// MARK: - Live Odds View
struct LiveOddsView: View {
    var body: some View {
        VStack {
            Text("Live Odds")
                .font(.title)
                .padding()

            List {
                Text("NFL: Team A vs. Team B - Odds: +110/-120")
                Text("NBA: Team C vs. Team D - Odds: -105/-115")
                Text("MLB: Team E vs. Team F - Odds: +150/-130")
            }
        }
    }
}

// MARK: - Betting History View
struct BettingHistoryView: View {
    var body: some View {
        VStack {
            Text("Betting History")
                .font(.title)
                .padding()

            List {
                Text("2025-01-12: NFL - Team A win - Bet: $50 - Won: $55")
                Text("2025-01-11: NBA - Team D lose - Bet: $30 - Lost: $30")
                Text("2025-01-10: NHL - Team G win - Bet: $20 - Won: $38")
            }
        }
    }
}

// MARK: - Notifications View
struct NotificationsView: View {
    @State private var notificationsEnabled: Bool = true

    var body: some View {
        VStack {
            Toggle("Enable Notifications", isOn: $notificationsEnabled)
                .padding()

            if notificationsEnabled {
                Text("You will receive real-time updates on line movements and game results.")
                    .padding()
            } else {
                Text("Notifications are turned off.")
                    .padding()
            }
        }
        .navigationTitle("Notifications")
    }
}
