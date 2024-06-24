class PromptEngineer {
    public static void main(String[] args) {
        String promptName = "Generate a creative story";
        String promptDescription = "Create a short fictional story with engaging characters and plot"
        String promptCategory = "Creative Writing";
        int promptDifficulty = 4;
        int promptLength = 250;
        String[] promptTags = {"fiction", "story", "creative", "narrative"};
        String promptExamples = "Once upon a time, in a faraway land...";
        String promptInstructions = "Begin the story with an intriguing opening line. Develop the plot and characters over the course of the narrative.";
        String promptHints = "Consider using vivid descriptors and dialogue to bring the story to life.";
        int promptTimeout = 600;
        int promptRetries = 3;
        double promptSuccessRate = 0.85;
        String promptFeedback = "The story was engaging and well-written. Great job!";
        int promptLeaderboard = 7;
        System.out.println("Prompt Name: " + promptName);
        System.out.println("Prompt Description: " + promptDescription);
        System.out.println("Prompt Category: " + promptCategory);
        System.out.println("Prompt Difficulty: " + promptDifficulty);
        System.out.println("Prompt Length: " + promptLength + " words");
        System.out.println("Prompt Tags: " + String.join(", ", promptTags));
        System.out.println("Prompt Examples: " + promptExamples);
        System.out.println("Prompt Instructions: " + promptInstructions);
        System.out.println("Prompt Hints: " + promptHints);
        System.out.println("Prompt Timeout: " + promptTimeout + " seconds");
        System.out.println("Prompt Retries: " + promptRetries);
        System.out.println("Prompt Success Rate: " + (promptSuccessRate * 100) + "%");
        System.out.println("Prompt Feedback: " + promptFeedback);
        System.out.println("Prompt Leaderboard: Rank #" + promptLeaderboard);
    }
}
