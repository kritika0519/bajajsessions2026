package methods;

import java.util.*;


// add delete a coment by id
// find all comments on a particular topic by particular user

class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Comment {
    int id;
    String topic;
    String text;
    User user;

    public Comment(int id, String topic, String text, User user) {
        this.id = id;
        this.topic = topic;
        this.text = text;
        this.user = user;
    }
}

public class SimpleCommentSystem {
    private static int userIdCounter = 1;
    private static int commentIdCounter = 1;
    private static List<User> users = new ArrayList<>();
    private static List<Comment> comments = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Register User");
            System.out.println("2. Add Comment");
            System.out.println("3. View All Comments");
            System.out.println("4. View Comments by Topic");
            System.out.println("5. Delete Comment");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    addComment();
                    break;
                case 3:
                    viewAllComments();
                    break;
                case 4:
                    viewCommentsByTopic();
                    break;
                case 5:
                    deleteComment();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }





    private static void registerUser() {
        System.out.print("Enter username: ");
        String name = sc.nextLine();
        users.add(new User(userIdCounter, name));
        System.out.println("User registered successfully! Your User ID is: " + userIdCounter);
        userIdCounter++;
    }





    private static void addComment() {
        System.out.print("Enter your User ID: ");
        int userId = sc.nextInt();
        sc.nextLine(); 

        User user = getUserById(userId);
        if (user == null) {
            System.out.println("User not found! Please register first.");
            return;
        }

        System.out.print("Enter topic: ");
        String topic = sc.nextLine();
        System.out.print("Enter your comment: ");
        String text = sc.nextLine();

        comments.add(new Comment(commentIdCounter++, topic, text, user));
        System.out.println("Comment added successfully!");
    }




    private static void viewAllComments() {
        if (comments.isEmpty()) {
            System.out.println("No comments available.");
            return;
        }
        for (Comment comment : comments) {
            System.out.println(comment.id + " | Topic: " + comment.topic + " | User: " + comment.user.name + " | Comment: " + comment.text);
        }
    }




    private static void viewCommentsByTopic() {
        System.out.print("Enter topic: ");
        String topic = sc.nextLine();
        boolean found = false;
        for (Comment comment : comments) {
            if (comment.topic.equalsIgnoreCase(topic)) {
                System.out.println(comment.id + " | User: " + comment.user.name + " | Comment: " + comment.text);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No comments found for this topic.");
        }
    }



    private static void deleteComment() {
        System.out.print("Enter Comment ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        boolean removed = comments.removeIf(comment -> comment.id == id);
        if (removed) {
            System.out.println("Comment deleted successfully!");
        } else {
            System.out.println("Comment not found!");
        }
    }



    private static User getUserById(int id) {
        for (User user : users) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }
}