# Treasure Salesman Game

## 📖 Table of Contents
1. [Overview](#-overview)
2. [Technologies Used](#-technologies-used)
3. [Installation](#-installation)
   - [Prerequisites](#prerequisites)
   - [Steps to Run the Game](#steps-to-run-the-game)
4. [How to Play](#-how-to-play)
5. [Screenshots](#-screenshots)
6. [Features](#-features)
7. [Future Improvements](#-future-improvements)

## 🎮 Overview
The **Treasure Salesman Game** is a competitive two-player strategy game where players explore a grid-based map to find hidden treasures, navigate through traps and obstacles, and engage in battles. The goal is to collect and sell as many treasures as possible while strategically using resources to gain an advantage.

## 🛠️ Technologies Used
- **Java** - Core programming language
- **JavaFX** - GUI framework for building the game interface
- **FXGL** - JavaFX-based game engine for enhanced visuals and mechanics
- **Maven** - Dependency management and project building
- **TilesFX, ControlsFX, BootstrapFX** - Additional UI components and styling
- **Jackson** - JSON parsing and data handling

## 📥 Installation
### Prerequisites
- Install **Java 21+** (recommended JDK: Eclipse Adoptium)
- Install **Maven** (if not already installed)
- Ensure **JavaFX SDK** is correctly set up

### Steps to Run the Game
1. **Clone the Repository:**
   ```sh
   git clone https://github.com/Xmwo3i/travelingsalesmangame.git
   cd travelingsalesmangame
   ```
2. **Build the Project with Maven:**
   ```sh
   mvn clean install
   ```
3. **Run the Game:**
   ```sh
   mvn javafx:run
   ```

## 🎯 How to Play
- **Two Players:** Compete to find and collect treasures hidden inside **green houses**.
- **Selling Treasures:** Bring the collected treasures to the **castle (yellow house at the center)** and enter their coordinates to claim them.
- **Traps & Loot:**
  - **Red houses** are traps that deduct money from your wallet.
  - **Blue houses** are loot locations that add money to your wallet.
- **Obstacles:** **Black houses** act as walls that block movement.
- **Market:** **Orange houses** serve as markets where players can purchase weapons to increase their strength.
- **Earning Money:**
  - Find and sell treasures at the castle.
  - Collect loot from blue houses.
- **Battles:**
  - If two players land on the same house, a battle occurs.
  - The player with **higher strength wins**.
  - The loser **loses all money**, which is transferred to the winner, and must **restart from the beginning** with **0 money and 0 strength**.
- **Winning Condition:** The player who collects the most treasures wins the game.

## 📸 Screenshots
![Screenshot 2025-02-10 024458](https://github.com/user-attachments/assets/4a09b1cf-006e-4841-8d51-e7c96254a8d0)

## 🚀 Features
✔ Competitive two-player gameplay  
✔ Interactive grid-based map with obstacles and rewards  
✔ Strategy-driven battle system based on strength and wealth  
✔ Market system for purchasing upgrades  
✔ Visually engaging game elements powered by FXGL  
✔ JSON-based data handling using Jackson  
✔ Modular and scalable Java code  

## 🛠️ Future Improvements
- Add AI-controlled opponents for single-player mode.
- Implement a larger variety of weapons and power-ups.
- Introduce different map layouts and randomized treasure placements.
- Add a ranking system for competitive play.

---

