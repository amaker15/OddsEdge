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
            }
            .navigationTitle("Sports Betting")
        }
    }
}

// MARK: - Live Odds View
struct LiveOddsView: View {
    var body: some View {
        Text("Live Odds")
            .font(.title)
    }
}

// MARK: - Betting History View
struct BettingHistoryView: View {
    var body: some View {
        Text("Betting History")
            .font(.title)
    }
}
