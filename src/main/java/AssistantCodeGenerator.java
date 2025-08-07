import java.util.List;
import java.util.Scanner;

import com.google.genai.types.Part;
import com.google.genai.Client;
import com.google.genai.types.Content;
import com.google.genai.types.GenerateContentConfig;
import com.google.genai.types.GenerateContentResponse;
import io.github.cdimascio.dotenv.Dotenv;

public class AssistantCodeGenerator {
  public static void main(String[] args) {
    Dotenv env = Dotenv.load();
    String api_key = env.get("GOOGLE_API_KEY");
    Client client = Client.builder().apiKey(api_key).build();

    System.out.println("Enter your prompt");
    Scanner sc = new Scanner(System.in);
    String prompt = sc.nextLine();

    Part instructionPart = Part.builder()
        .text("You are a code generator.Reply only with a code or a code snippet in the user's desired language.Let the default language be Java.Explaination of the code is allowed.Keep it as simple as possible.")
        .build();

    Content instruction = Content.builder()
        .role("assistant")
        .parts(List.of(instructionPart))
        .build();
    GenerateContentConfig config = GenerateContentConfig.builder()
        .systemInstruction(instruction)
        .build();

    GenerateContentResponse response = client.models.generateContent(
        "gemini-2.5-flash",
        prompt, config);

    System.out.println(response.text());
    sc.close();
  }
}