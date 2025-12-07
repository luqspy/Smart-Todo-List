## SmartTodo List Application

SmartTodo is a modern, cross-platform to-do list application built using JavaFX. It provides robust task management features, including filtering, searching, persistent data storage (JSON), and the ability to export task lists to PDF.

This project was developed as an assignment for the CAT201 Integrated Software Development Workshop.

##Features

CRUD Operations: Easily Add, Update, Delete, and Mark tasks as Completed.

Persistent Storage: Tasks are automatically saved locally using JSON persistence (via Gson library) for data integrity.

File Management: Open, Save, and Save As functionality for managing multiple task lists (.json files).

Search & Filter: Dynamic searching across task titles and descriptions, and category-based filtering.

Export: Ability to export the current task list view to a PDF document using the system print dialog.

Theming: Includes multiple themes (light.css, dark.css, styles.css) for user preference.

##Project Architecture

The application follows the Model-View-Controller (MVC) architectural pattern, which ensures separation of concerns, making the codebase clean, modular, and easy to maintain. 

Package

Role

Key Files

sample

Main Entry

Main.java (Application entry point)

sample.model

Model (Data)

Task.java (Task structure)

sample.util

Persistence Layer

Storage.java (Handles JSON Read/Write operations)

sample.controller

Controller (Logic)

TodoController.java (Main application logic, CRUD, I/O)

resources/views

View (UI Layout)

todo.fxml (Main layout), about.fxml, detail.fxml (Modal views)

##Getting Started

Prerequisites

Java Development Kit (JDK) 17 or higher

A compatible IDE (IntelliJ IDEA, Eclipse)

JavaFX SDK (Required if running manually, but often bundled/managed by modern IDEs like IntelliJ with the appropriate module configuration.)

Running the Application

Clone the Repository:

git clone [YOUR_REPOSITORY_URL]
cd SmartTodo


Configure JavaFX:

Since this is a modular JavaFX application, ensure your IDE or build tool (like Maven/Gradle, if applicable) is correctly configured to use the JavaFX modules.

The application uses the com.google.gson library for JSON handling, which must be included in your project dependencies or classpath.

Run Main.java:

Locate the sample.Main class and run it directly.



