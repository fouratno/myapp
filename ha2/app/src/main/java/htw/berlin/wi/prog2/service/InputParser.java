package htw.berlin.wi.prog2.service;

import htw.berlin.wi.prog2.domain.Ingredient;

import java.util.List;

public interface InputParser {
    // Declares a method ingredientsFromInput which takes a single string argument and returns a list of Ingredient objects.
    // This method is expected to parse the provided string and extract or construct a list of Ingredient objects based on that input.
    // The method does not have a body; it only defines the method signature.
    // Classes that implement this interface will provide the specific implementation of this method.
    List<Ingredient> ingredientsFromInput(String inputLine);
}
