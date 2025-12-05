# Machi Koro Android App - Product Requirements Document

## Overview

A full recreation of the Machi Koro board game built entirely with Jetpack Compose for Android. This will be a digital version of the popular city-building dice game where players roll dice, activate cards, earn coins, and compete to build their city first.

## Technical Stack

-   **Language**: Kotlin
-   **UI Framework**: Jetpack Compose
-   **Architecture**: MVVM with Repository pattern
-   **Min SDK**: TBD
-   **Target SDK**: Latest stable

## Development Milestones

### Milestone 1: Project Foundation & Card Data Models

**Goal**: Set up the project structure and define all game data

**Tasks**:

-   Create new Android project with Jetpack Compose
-   Set up basic project structure (packages for data, domain, ui, etc.)
-   Define data models for all Machi Koro cards:
    -   Card types (establishments, landmarks)
    -   Card properties (name, cost, activation numbers, effects, icons)
    -   Card colors/categories (blue, green, red, purple)
-   Create repository for card data
-   Implement card data source (hardcoded list of all base game cards)
-   Create simple card browser UI to view all cards
-   Display cards in a list/grid with basic information

**Definition of Done**:

-   All base game cards are defined in data models
-   Card repository provides access to all cards
-   User can scroll through and view all available cards
-   Cards display name, cost, and activation info

---

### Milestone 2: Core Game Logic & Rules Engine

**Goal**: Implement the fundamental game rules and turn mechanics

**Tasks**:

-   Create game state management system
-   Implement dice rolling logic (1 or 2 dice)
-   Create turn management system
-   Implement card activation logic based on dice rolls
-   Handle different card types:
    -   Blue cards (activate on anyone's turn)
    -   Green cards (activate on your turn only)
    -   Red cards (take coins from active player)
    -   Purple cards (special effects)
-   Create coin management system
-   Implement basic game flow (roll → activate → buy → end turn)

**Definition of Done**:

-   Dice can be rolled with proper randomization
-   Cards activate correctly based on roll results
-   Coins are awarded/deducted properly
-   Turn order is maintained
-   Game state is tracked accurately

---

### Milestone 3: Player Management & Game Setup

**Goal**: Support multiple players and game initialization

**Tasks**:

-   Create player data model
-   Implement player hand/tableau system
-   Set up game initialization flow
-   Create player selection screen (2-4 players)
-   Assign starting cards to each player (Wheat Field + Bakery)
-   Assign starting landmarks to each player
-   Implement coin starting amounts
-   Create player turn indicator UI
-   Build basic game board layout showing all players

**Definition of Done**:

-   Can start a new game with 2-4 players
-   Each player starts with correct cards and coins
-   Player turn order is established
-   UI shows current player and all player states

---

### Milestone 4: Card Purchasing System

**Goal**: Allow players to buy new cards

**Tasks**:

-   Create card marketplace/supply UI
-   Implement card purchase logic
-   Handle coin deduction for purchases
-   Add purchased cards to player's tableau
-   Implement purchase restrictions:
    -   Only one of each landmark per player
    -   Multiple copies of establishments allowed
    -   Must have enough coins
-   Create "Buy Phase" in turn flow
-   Add visual feedback for affordable/unaffordable cards
-   Implement "End Turn" button

**Definition of Done**:

-   Players can browse available cards during buy phase
-   Cards can be purchased if affordable
-   Coins are deducted correctly
-   Purchased cards appear in player's tableau
-   Turn advances after ending turn

---

### Milestone 5: Landmark System & Win Condition

**Goal**: Implement landmarks and victory detection

**Tasks**:

-   Create landmark-specific data models
-   Implement all landmark effects:
    -   Train Station (roll 1 or 2 dice choice)
    -   Shopping Mall (+1 coin to cup/bread icons)
    -   Amusement Park (extra turn on doubles)
    -   Radio Tower (re-roll once per turn)
-   Add landmark purchase system
-   Implement win condition checking
-   Create victory screen
-   Add landmark status indicators to player UI

**Definition of Done**:

-   All 4 landmarks can be purchased
-   Landmark effects work correctly
-   Game detects when a player owns all landmarks
-   Winner is announced with victory screen
-   Landmarks are visually distinct from establishments

---

### Milestone 6: Game Board UI & Polish

**Goal**: Create the main gameplay interface

**Tasks**:

-   Design and implement main game board layout
-   Create player tableau view (shows owned cards)
-   Build dice rolling animation
-   Create coin counter display
-   Implement card activation animations
-   Add turn phase indicators (Roll, Buy, End)
-   Create card detail view (tap to see full card info)
-   Implement proper spacing and visual hierarchy
-   Add color coding for card types
-   Create marketplace layout with all available cards

**Definition of Done**:

-   Game board is visually clear and organized
-   All game information is visible at a glance
-   Animations enhance the experience
-   UI is intuitive and easy to navigate
-   Cards are easily identifiable

---

### Milestone 7: Advanced Card Effects & Special Rules

**Goal**: Handle complex card interactions

**Tasks**:

-   Implement card-specific special effects
-   Handle card combinations and multipliers
-   Implement "take coins from opponent" logic (red cards)
-   Create proper coin transfer system
-   Handle edge cases (not enough coins, bank limits)
-   Implement card effect chaining
-   Add proper effect resolution order
-   Handle purple card major establishments

**Definition of Done**:

-   All card effects work as per official rules
-   Red cards properly transfer coins
-   Purple cards execute special actions correctly
-   Edge cases are handled gracefully
-   Complex interactions resolve correctly

---

### Milestone 8: AI Opponent (Optional) or Pass-and-Play

**Goal**: Enable single-player or local multiplayer

**Tasks**:

-   Implement pass-and-play mode (players share device)
-   Add player name customization
-   Create turn transition screen (hide info between turns)
-   OR implement basic AI opponent:
    -   Simple strategy for card purchases
    -   Automated dice rolling and turn execution
    -   Difficulty levels (easy, medium, hard)

**Definition of Done**:

-   Multiple people can play on one device, OR
-   AI can play a competent game
-   Game flow is smooth between players/AI

---

### Milestone 9: Game Settings & Variations

**Goal**: Add customization and replayability

**Tasks**:

-   Create settings screen
-   Add game variant options:
    -   Base game only
    -   Harbor expansion (if implementing)
    -   Starting coin variations
-   Implement game speed settings
-   Add animation toggle
-   Create "New Game" and "Quit Game" options
-   Implement game reset functionality
-   Add rules/help screen

**Definition of Done**:

-   Players can configure game before starting
-   Settings persist across sessions
-   Rules are accessible in-game
-   Can start new games easily

---

### Milestone 10: Polish, Testing & Release Prep

**Goal**: Finalize the app for release

**Tasks**:

-   Comprehensive testing of all game scenarios
-   Fix bugs and edge cases
-   Optimize performance
-   Add app icon and splash screen
-   Implement proper state saving (handle app lifecycle)
-   Add sound effects (optional)
-   Create onboarding/tutorial (optional)
-   Write comprehensive test suite
-   Conduct user testing
-   Polish UI/UX based on feedback
-   Prepare for release (screenshots, description, etc.)

**Definition of Done**:

-   App is stable with no critical bugs
-   Performance is smooth on target devices
-   State is preserved during configuration changes
-   Ready for production release

---

## Future Enhancements (Post-Launch)

-   Harbor expansion cards and rules
-   Millionaire's Row expansion
-   Online multiplayer
-   Statistics and achievements
-   Card collection tracking
-   Different themes/card art styles
-   Accessibility improvements
-   Tablet optimization

## Success Metrics

-   Game accurately implements official Machi Koro rules
-   Smooth 60fps performance
-   Intuitive UI that doesn't require reading manual
-   Average game completion time matches physical game (~30 min)
-   Zero critical bugs in core game flow

## Out of Scope (v1.0)

-   Online multiplayer
-   Expansion packs (Harbor, Millionaire's Row)
-   Social features
-   In-app purchases
-   Localization (English only initially)
